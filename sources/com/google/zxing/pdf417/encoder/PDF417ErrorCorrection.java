package com.google.zxing.pdf417.encoder;

import ai.gotit.giap.constant.CommonConstant;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.imageutils.JfifUtil;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import net.minidev.json.parser.JSONParser;
import okhttp3.internal.http.StatusLine;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{TiffUtil.TIFF_TAG_ORIENTATION, 562, 232, 755, CommonConstant.MAX_SERVER_ERROR_STATUS_CODE, 524, 801, Opcodes.IINC, 295, 116, 442, 428, 295, 42, Opcodes.ARETURN, 65}, new int[]{361, 575, 922, 525, Opcodes.ARETURN, 586, 640, 321, 536, 742, 677, 742, 687, 284, Opcodes.INSTANCEOF, 517, 273, 494, 263, Opcodes.I2S, 593, 800, 571, 320, 803, Opcodes.I2L, 231, 390, 685, 330, 63, 410}, new int[]{539, HttpStatus.SC_UNPROCESSABLE_ENTITY, 6, 93, 862, 771, 453, 106, 610, 287, 107, HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, 733, 877, 381, 612, 723, 476, 462, Opcodes.IRETURN, 430, 609, 858, 822, 543, 376, FrameMetricsAggregator.EVERY_DURATION, 400, 672, 762, 283, Opcodes.INVOKESTATIC, 440, 35, 519, 31, 460, 594, JfifUtil.MARKER_APP1, 535, 517, 352, 605, Opcodes.IFLE, 651, HttpStatus.SC_CREATED, 488, HttpStatus.SC_BAD_GATEWAY, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, JfifUtil.MARKER_EOI, JfifUtil.MARKER_RST0, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, 620, 246, Opcodes.LCMP, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, Opcodes.INSTANCEOF, 219, Opcodes.LOR, Opcodes.INVOKEDYNAMIC, 236, 287, 192, 775, 278, Opcodes.LRETURN, 40, 379, 712, 463, 646, 776, Opcodes.LOOKUPSWITCH, 491, 297, 763, Opcodes.IFGE, 732, 95, RotationOptions.ROTATE_270, 447, 90, HttpStatus.SC_INSUFFICIENT_STORAGE, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, Opcodes.IFGT, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, Opcodes.IXOR, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, Opcodes.L2D, 720, 858, Opcodes.MONITORENTER, 311, 913, 275, 190, 375, 850, 438, 733, Opcodes.MONITORENTER, 280, HttpStatus.SC_CREATED, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, TypefaceStyle.BOLD, 799, Opcodes.L2F, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, JfifUtil.MARKER_SOI, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, TiffUtil.TIFF_TAG_ORIENTATION, 877, Opcodes.IF_ICMPGE, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, FrameMetricsAggregator.EVERY_DURATION, 51, 8, 517, JfifUtil.MARKER_APP1, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, Opcodes.L2I, 538, 906, 90, 2, 290, 743, Opcodes.IFNONNULL, 655, 903, 329, 49, 802, 580, 355, 588, Opcodes.NEWARRAY, 462, 10, Opcodes.I2F, 628, 320, 479, Opcodes.IXOR, 739, 71, 263, 318, 374, 601, 192, 605, Opcodes.D2I, 673, 687, 234, 722, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, Opcodes.RETURN, 752, 607, 640, 455, Opcodes.INSTANCEOF, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, StatusLine.HTTP_MISDIRECTED_REQUEST, 726, 528, HttpStatus.SC_SERVICE_UNAVAILABLE, 118, 49, 795, 32, Opcodes.D2F, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, Opcodes.I2F, 54, 834, 299, 922, Opcodes.ATHROW, 910, 532, 609, 829, Opcodes.ANEWARRAY, 20, Opcodes.GOTO, 29, 872, 449, 83, 402, 41, JSONParser.MODE_RFC4627, HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, 579, 481, Opcodes.LRETURN, 404, 251, 688, 95, 497, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, 642, 543, 307, Opcodes.IF_ICMPEQ, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, HttpStatus.SC_GATEWAY_TIMEOUT, 35, CommonConstant.MAX_SERVER_ERROR_STATUS_CODE, 428, HttpStatus.SC_MULTI_STATUS, 409, 574, 118, 498, 285, 380, 350, 492, Opcodes.MULTIANEWARRAY, 265, 920, Opcodes.IFLT, 914, 299, 229, 643, 294, 871, 306, 88, 87, Opcodes.INSTANCEOF, 352, 781, 846, 75, 327, 520, 435, 543, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, HttpStatus.SC_REQUEST_TIMEOUT, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, Opcodes.D2I, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, InputDeviceCompat.SOURCE_DPAD, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, Opcodes.JSR, 190, 826, 328, 596, 786, HttpStatus.SC_SEE_OTHER, 570, 381, 415, 641, Opcodes.IFGE, 237, Opcodes.DCMPL, 429, 531, HttpStatus.SC_MULTI_STATUS, 676, 710, 89, Opcodes.JSR, HttpStatus.SC_NOT_MODIFIED, 402, 40, 708, 575, Opcodes.IF_ICMPGE, 864, 229, 65, 861, 841, 512, Opcodes.IF_ICMPLE, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, Opcodes.DCMPG, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, Opcodes.GOTO, 342, 244, Opcodes.LRETURN, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, HttpStatus.SC_METHOD_FAILURE, 245, 288, 594, 394, FrameMetricsAggregator.EVERY_DURATION, 327, 589, 777, 699, 688, 43, HttpStatus.SC_REQUEST_TIMEOUT, 842, 383, 721, 521, 560, 644, 714, 559, 62, Opcodes.I2B, 873, 663, 713, Opcodes.IF_ICMPEQ, 672, 729, 624, 59, Opcodes.INSTANCEOF, HttpStatus.SC_EXPECTATION_FAILED, Opcodes.IFLE, 209, 563, 564, 343, 693, 109, 608, 563, 365, Opcodes.PUTFIELD, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, HttpStatus.SC_FAILED_DEPENDENCY, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, Opcodes.INVOKESTATIC, 45, 787, 680, 18, 66, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, HttpStatus.SC_METHOD_FAILURE, HttpStatus.SC_USE_PROXY, 441, HttpStatus.SC_MULTI_STATUS, 300, 892, 827, Opcodes.F2D, 537, 381, 662, InputDeviceCompat.SOURCE_DPAD, 56, 252, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, JfifUtil.MARKER_SOI, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, HttpStatus.SC_SEE_OTHER, 843, 922, 281, 73, 469, 791, 660, Opcodes.IF_ICMPGE, 498, 308, Opcodes.IFLT, HttpStatus.SC_UNPROCESSABLE_ENTITY, 907, 817, Opcodes.NEW, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, Opcodes.INVOKESPECIAL, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, HttpStatus.SC_FAILED_DEPENDENCY, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, JSONParser.MODE_RFC4627, 447, Opcodes.LOOKUPSWITCH, 616, 464, 190, 531, 297, 321, 762, 752, 533, Opcodes.DRETURN, Opcodes.I2F, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, Opcodes.L2D, 646, 411, 877, 669, Opcodes.F2D, 919, 45, 780, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, Opcodes.IF_ICMPLE, 332, 899, Opcodes.IF_ACMPEQ, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, HttpStatus.SC_NOT_MODIFIED, 282, 738, 675, 410, 389, 244, 31, 121, HttpStatus.SC_SEE_OTHER, 263}};

    private PDF417ErrorCorrection() {
    }

    static int getErrorCorrectionCodewordCount(int i) {
        if (i >= 0 && i <= 8) {
            return 1 << (i + 1);
        }
        throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
    }

    static int getRecommendedMinimumErrorCorrectionLevel(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        } else if (i <= 40) {
            return 2;
        } else {
            if (i <= 160) {
                return 3;
            }
            if (i <= 320) {
                return 4;
            }
            if (i <= 863) {
                return 5;
            }
            throw new WriterException("No recommendation possible");
        }
    }

    static String generateErrorCorrection(CharSequence charSequence, int i) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = errorCorrectionCodewordCount - 1;
            int charAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((EC_COEFFICIENTS[i][i3] * charAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((charAt * EC_COEFFICIENTS[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i4 = errorCorrectionCodewordCount - 1; i4 >= 0; i4--) {
            char c = cArr[i4];
            if (c != 0) {
                cArr[i4] = (char) (929 - c);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }
}
