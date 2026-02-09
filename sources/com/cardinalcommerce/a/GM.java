package com.cardinalcommerce.a;

import com.cardinalcommerce.a.ECGOST;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public interface GM {
    public static final ASN1ObjectIdentifier configure = new ASN1ObjectIdentifier("1.2.250.1.223.101.256.1");

    public final class Mappings {
        private static final long cca_continue = Runtime.getRuntime().maxMemory();

        Mappings() {
        }

        public static int Cardinal(int i) {
            int i2 = 1;
            if (i > 127) {
                int i3 = 1;
                while (true) {
                    i >>>= 8;
                    if (i == 0) {
                        break;
                    }
                    i3++;
                }
                for (int i4 = (i3 - 1) << 3; i4 >= 0; i4 -= 8) {
                    i2++;
                }
            }
            return i2;
        }

        static int init(int i) throws IOException {
            if (i < 31) {
                return 1;
            }
            if (i < 128) {
                return 2;
            }
            byte[] bArr = new byte[5];
            int i2 = 4;
            do {
                i >>= 7;
                i2--;
                bArr[i2] = (byte) ((i & 127) | 128);
            } while (i > 127);
            return 1 + (5 - i2);
        }

        public static int Cardinal(InputStream inputStream) {
            if (inputStream instanceof ECGOST.Mappings) {
                return ((ECGOST.Mappings) inputStream).getInstance();
            }
            if (inputStream instanceof getProxyAddress) {
                return ((getProxyAddress) inputStream).init;
            }
            if (inputStream instanceof ByteArrayInputStream) {
                return ((ByteArrayInputStream) inputStream).available();
            }
            if (inputStream instanceof FileInputStream) {
                try {
                    FileChannel channel = ((FileInputStream) inputStream).getChannel();
                    long size = channel != null ? channel.size() : 2147483647L;
                    if (size < 2147483647L) {
                        return (int) size;
                    }
                } catch (IOException unused) {
                }
            }
            long j = cca_continue;
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }
    }
}
