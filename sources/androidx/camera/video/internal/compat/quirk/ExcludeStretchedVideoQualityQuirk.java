package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.video.Quality;

public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    static boolean load() {
        return isSamsungJ4();
    }

    private static boolean isSamsungJ4() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL);
    }

    public boolean isProblematicVideoQuality(Quality quality) {
        if (!isSamsungJ4()) {
            return false;
        }
        if (quality == Quality.FHD || quality == Quality.UHD) {
            return true;
        }
        return false;
    }
}
