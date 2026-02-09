package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;

public final class getProgressView implements GMCipherSpi.SM2withSha256 {
    private byte[] Cardinal;
    private byte[] cca_continue;
    private GMCipherSpi.SM2withSha256 configure;
    private byte[] getInstance;
    private boolean getSDKVersion;
    private int init;

    public getProgressView() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.cardinalcommerce.a.ChallengeParameters} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.a.setCCAImageUri getInstance(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r10) throws java.io.IOException {
        /*
            com.cardinalcommerce.a.BCDSAPrivateKey r0 = r10.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r0 = r0.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.a.ElGamal.Mappings.getEnvironment
            java.lang.String r2 = r0.init
            java.lang.String r1 = r1.init
            int r3 = r2.length()
            int r4 = r1.length()
            r5 = 0
            if (r3 <= r4) goto L_0x0029
            int r3 = r1.length()
            char r3 = r2.charAt(r3)
            r4 = 46
            if (r3 != r4) goto L_0x0029
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x002a
        L_0x0029:
            r1 = r5
        L_0x002a:
            if (r1 == 0) goto L_0x004a
            com.cardinalcommerce.a.setUICustomization r0 = r10.Cardinal
            byte[] r0 = r0.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r0 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r0)
            com.cardinalcommerce.a.setUICustomization r0 = com.cardinalcommerce.a.setUICustomization.init(r0)
            com.cardinalcommerce.a.ChallengeStatusReceiver r1 = new com.cardinalcommerce.a.ChallengeStatusReceiver
            com.cardinalcommerce.a.BCDSAPrivateKey r10 = r10.cca_continue
            int r10 = com.cardinalcommerce.a.close.cca_continue((com.cardinalcommerce.a.BCDSAPrivateKey) r10)
            byte[] r0 = r0.getInstance()
            r1.<init>(r10, r0)
            return r1
        L_0x004a:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.a.ElGamal.Mappings.getSDKVersion
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0086
            com.cardinalcommerce.a.getAuthenticationRequestParameters r0 = new com.cardinalcommerce.a.getAuthenticationRequestParameters
            com.cardinalcommerce.a.setUICustomization r1 = r10.Cardinal
            byte[] r1 = r1.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r1)
            com.cardinalcommerce.a.setUICustomization r1 = com.cardinalcommerce.a.setUICustomization.init(r1)
            byte[] r1 = r1.getInstance()
            com.cardinalcommerce.a.BCDSAPrivateKey r10 = r10.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r10 = r10.Cardinal
            boolean r3 = r10 instanceof com.cardinalcommerce.a.ChallengeParameters
            if (r3 == 0) goto L_0x0073
            r2 = r10
            com.cardinalcommerce.a.ChallengeParameters r2 = (com.cardinalcommerce.a.ChallengeParameters) r2
            goto L_0x007e
        L_0x0073:
            if (r10 == 0) goto L_0x007e
            com.cardinalcommerce.a.ChallengeParameters r2 = new com.cardinalcommerce.a.ChallengeParameters
            com.cardinalcommerce.a.isEnableLogging r10 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r10)
            r2.<init>((com.cardinalcommerce.a.isEnableLogging) r10)
        L_0x007e:
            java.lang.String r10 = com.cardinalcommerce.a.close.configure(r2)
            r0.<init>(r1, r10)
            return r0
        L_0x0086:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.a.ElGamal.Mappings.isEnableDFSync
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00aa
            com.cardinalcommerce.a.timedout r0 = new com.cardinalcommerce.a.timedout
            com.cardinalcommerce.a.setUICustomization r10 = r10.Cardinal
            byte[] r10 = r10.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r10 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r10)
            com.cardinalcommerce.a.setUICustomization r10 = com.cardinalcommerce.a.setUICustomization.init(r10)
            byte[] r10 = r10.getInstance()
            short[] r10 = Cardinal(r10)
            r0.<init>(r10)
            return r0
        L_0x00aa:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.a.ElGamal.Mappings.CardinalRenderType
            boolean r1 = r0.equals(r1)
            java.lang.String r3 = "ClassNotFoundException processing BDS state: "
            java.lang.String r4 = "in == null"
            if (r1 == 0) goto L_0x01c2
            com.cardinalcommerce.a.BCDSAPrivateKey r0 = r10.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.Cardinal
            boolean r1 = r0 instanceof com.cardinalcommerce.a.get3DSServerTransactionID
            if (r1 == 0) goto L_0x00c1
            com.cardinalcommerce.a.get3DSServerTransactionID r0 = (com.cardinalcommerce.a.get3DSServerTransactionID) r0
            goto L_0x00cf
        L_0x00c1:
            if (r0 == 0) goto L_0x00ce
            com.cardinalcommerce.a.get3DSServerTransactionID r1 = new com.cardinalcommerce.a.get3DSServerTransactionID
            com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r0)
            r1.<init>(r0)
            r0 = r1
            goto L_0x00cf
        L_0x00ce:
            r0 = r2
        L_0x00cf:
            com.cardinalcommerce.a.BCDSAPrivateKey r1 = r0.getInstance
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r1.cca_continue
            com.cardinalcommerce.a.setUICustomization r10 = r10.Cardinal
            byte[] r10 = r10.getInstance()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r10 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r10)
            if (r10 == 0) goto L_0x00e9
            com.cardinalcommerce.a.setAcsTransactionID r6 = new com.cardinalcommerce.a.setAcsTransactionID
            com.cardinalcommerce.a.isEnableLogging r10 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r10)
            r6.<init>(r10)
            goto L_0x00ea
        L_0x00e9:
            r6 = r2
        L_0x00ea:
            com.cardinalcommerce.a.setImageDrawable$Cardinal r10 = new com.cardinalcommerce.a.setImageDrawable$Cardinal     // Catch:{ ClassNotFoundException -> 0x01aa }
            com.cardinalcommerce.a.setFocusableInTouchMode r7 = new com.cardinalcommerce.a.setFocusableInTouchMode     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r0 = r0.configure     // Catch:{ ClassNotFoundException -> 0x01aa }
            com.cardinalcommerce.a.IESCipher$ECIESwithAESCBC r8 = com.cardinalcommerce.a.close.cca_continue((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r1)     // Catch:{ ClassNotFoundException -> 0x01aa }
            r7.<init>(r0, r8)     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.<init>(r7)     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r0 = r6.Cardinal     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.Cardinal = r0     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = r6.configure     // Catch:{ ClassNotFoundException -> 0x01aa }
            if (r0 != 0) goto L_0x0104
            r7 = r2
            goto L_0x010b
        L_0x0104:
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r7 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r8 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r0, r5, r7, r5, r8)     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x010b:
            if (r7 == 0) goto L_0x01a4
            int r0 = r7.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r8 = r7.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r7, r5, r0, r5, r8)     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.configure = r0     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = r6.getInstance     // Catch:{ ClassNotFoundException -> 0x01aa }
            if (r0 != 0) goto L_0x011c
            r7 = r2
            goto L_0x0123
        L_0x011c:
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r7 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r8 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r0, r5, r7, r5, r8)     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x0123:
            if (r7 == 0) goto L_0x019e
            int r0 = r7.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r8 = r7.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r7, r5, r0, r5, r8)     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.init = r0     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = r6.cca_continue     // Catch:{ ClassNotFoundException -> 0x01aa }
            if (r0 != 0) goto L_0x0134
            r7 = r2
            goto L_0x013b
        L_0x0134:
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r7 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r8 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r0, r5, r7, r5, r8)     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x013b:
            if (r7 == 0) goto L_0x0198
            int r0 = r7.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r8 = r7.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r7, r5, r0, r5, r8)     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.getInstance = r0     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = r6.init     // Catch:{ ClassNotFoundException -> 0x01aa }
            if (r0 != 0) goto L_0x014c
            r7 = r2
            goto L_0x0153
        L_0x014c:
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r7 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r8 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r0, r5, r7, r5, r8)     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x0153:
            if (r7 == 0) goto L_0x0192
            int r0 = r7.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r4 = r7.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r7, r5, r0, r5, r4)     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.getSDKVersion = r0     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r0 = r6.getWarnings     // Catch:{ ClassNotFoundException -> 0x01aa }
            if (r0 != 0) goto L_0x0164
            r4 = r2
            goto L_0x016b
        L_0x0164:
            int r4 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r4 = new byte[r4]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r0, r5, r4, r5, r7)     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x016b:
            if (r4 == 0) goto L_0x018c
            byte[] r0 = r6.getWarnings     // Catch:{ ClassNotFoundException -> 0x01aa }
            if (r0 != 0) goto L_0x0172
            goto L_0x0179
        L_0x0172:
            int r2 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            byte[] r2 = new byte[r2]     // Catch:{ ClassNotFoundException -> 0x01aa }
            int r4 = r0.length     // Catch:{ ClassNotFoundException -> 0x01aa }
            java.lang.System.arraycopy(r0, r5, r2, r5, r4)     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x0179:
            java.lang.Class<com.cardinalcommerce.a.doChallenge> r0 = com.cardinalcommerce.a.doChallenge.class
            java.lang.Object r0 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.cca_continue((byte[]) r2, (java.lang.Class) r0)     // Catch:{ ClassNotFoundException -> 0x01aa }
            com.cardinalcommerce.a.doChallenge r0 = (com.cardinalcommerce.a.doChallenge) r0     // Catch:{ ClassNotFoundException -> 0x01aa }
            com.cardinalcommerce.a.doChallenge r2 = new com.cardinalcommerce.a.doChallenge     // Catch:{ ClassNotFoundException -> 0x01aa }
            com.cardinalcommerce.a.IESCipher$ECIESwithAESCBC r1 = com.cardinalcommerce.a.ChallengeUtils.Cardinal(r1)     // Catch:{ ClassNotFoundException -> 0x01aa }
            r2.<init>((com.cardinalcommerce.a.doChallenge) r0, (com.cardinalcommerce.a.IESCipher.ECIESwithAESCBC) r1)     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.cleanup = r2     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x018c:
            com.cardinalcommerce.a.setImageDrawable r0 = new com.cardinalcommerce.a.setImageDrawable     // Catch:{ ClassNotFoundException -> 0x01aa }
            r0.<init>(r10, r5)     // Catch:{ ClassNotFoundException -> 0x01aa }
            return r0
        L_0x0192:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x01aa }
            throw r10     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x0198:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x01aa }
            throw r10     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x019e:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x01aa }
            throw r10     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x01a4:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x01aa }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x01aa }
            throw r10     // Catch:{ ClassNotFoundException -> 0x01aa }
        L_0x01aa:
            r10 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r10 = r1.append(r10)
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        L_0x01c2:
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers.cleanup
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02d4
            com.cardinalcommerce.a.BCDSAPrivateKey r0 = r10.cca_continue
            com.cardinalcommerce.a.CardinalConfigurationParameters r0 = r0.Cardinal
            boolean r1 = r0 instanceof com.cardinalcommerce.a.getAcsTransactionID
            if (r1 == 0) goto L_0x01d5
            com.cardinalcommerce.a.getAcsTransactionID r0 = (com.cardinalcommerce.a.getAcsTransactionID) r0
            goto L_0x01e3
        L_0x01d5:
            if (r0 == 0) goto L_0x01e2
            com.cardinalcommerce.a.getAcsTransactionID r1 = new com.cardinalcommerce.a.getAcsTransactionID
            com.cardinalcommerce.a.isEnableLogging r0 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r0)
            r1.<init>(r0)
            r0 = r1
            goto L_0x01e3
        L_0x01e2:
            r0 = r2
        L_0x01e3:
            com.cardinalcommerce.a.BCDSAPrivateKey r1 = r0.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r1.cca_continue
            com.cardinalcommerce.a.setUICustomization r10 = r10.Cardinal     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r10 = r10.getInstance()     // Catch:{ ClassNotFoundException -> 0x02bc }
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r10 = com.cardinalcommerce.a.getThreeDSRequestorAppURL.Cardinal(r10)     // Catch:{ ClassNotFoundException -> 0x02bc }
            if (r10 == 0) goto L_0x01fd
            com.cardinalcommerce.a.setAcsTransactionID r6 = new com.cardinalcommerce.a.setAcsTransactionID     // Catch:{ ClassNotFoundException -> 0x02bc }
            com.cardinalcommerce.a.isEnableLogging r10 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r10)     // Catch:{ ClassNotFoundException -> 0x02bc }
            r6.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x02bc }
            goto L_0x01fe
        L_0x01fd:
            r6 = r2
        L_0x01fe:
            com.cardinalcommerce.a.setButtonDrawable$configure r10 = new com.cardinalcommerce.a.setButtonDrawable$configure     // Catch:{ ClassNotFoundException -> 0x02bc }
            com.cardinalcommerce.a.setCCAId r7 = new com.cardinalcommerce.a.setCCAId     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r8 = r0.getInstance     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r0 = r0.Cardinal     // Catch:{ ClassNotFoundException -> 0x02bc }
            com.cardinalcommerce.a.IESCipher$ECIESwithAESCBC r9 = com.cardinalcommerce.a.close.cca_continue((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r1)     // Catch:{ ClassNotFoundException -> 0x02bc }
            r7.<init>(r8, r0, r9)     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.<init>(r7)     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r0 = r6.Cardinal     // Catch:{ ClassNotFoundException -> 0x02bc }
            long r7 = (long) r0     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.cca_continue = r7     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = r6.configure     // Catch:{ ClassNotFoundException -> 0x02bc }
            if (r0 != 0) goto L_0x021b
            r7 = r2
            goto L_0x0222
        L_0x021b:
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r7 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r8 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r0, r5, r7, r5, r8)     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x0222:
            if (r7 == 0) goto L_0x02b6
            int r0 = r7.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r8 = r7.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r7, r5, r0, r5, r8)     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.getInstance = r0     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = r6.getInstance     // Catch:{ ClassNotFoundException -> 0x02bc }
            if (r0 != 0) goto L_0x0233
            r7 = r2
            goto L_0x023a
        L_0x0233:
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r7 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r8 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r0, r5, r7, r5, r8)     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x023a:
            if (r7 == 0) goto L_0x02b0
            int r0 = r7.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r8 = r7.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r7, r5, r0, r5, r8)     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.configure = r0     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = r6.cca_continue     // Catch:{ ClassNotFoundException -> 0x02bc }
            if (r0 != 0) goto L_0x024b
            r7 = r2
            goto L_0x0252
        L_0x024b:
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r7 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r8 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r0, r5, r7, r5, r8)     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x0252:
            if (r7 == 0) goto L_0x02aa
            int r0 = r7.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r8 = r7.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r7, r5, r0, r5, r8)     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.Cardinal = r0     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = r6.init     // Catch:{ ClassNotFoundException -> 0x02bc }
            if (r0 != 0) goto L_0x0263
            r7 = r2
            goto L_0x026a
        L_0x0263:
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r7 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r8 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r0, r5, r7, r5, r8)     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x026a:
            if (r7 == 0) goto L_0x02a4
            int r0 = r7.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = new byte[r0]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r4 = r7.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r7, r5, r0, r5, r4)     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.cleanup = r0     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r0 = r6.getWarnings     // Catch:{ ClassNotFoundException -> 0x02bc }
            if (r0 != 0) goto L_0x027b
            r4 = r2
            goto L_0x0282
        L_0x027b:
            int r4 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r4 = new byte[r4]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r7 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r0, r5, r4, r5, r7)     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x0282:
            if (r4 == 0) goto L_0x029e
            byte[] r0 = r6.getWarnings     // Catch:{ ClassNotFoundException -> 0x02bc }
            if (r0 != 0) goto L_0x0289
            goto L_0x0290
        L_0x0289:
            int r2 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            byte[] r2 = new byte[r2]     // Catch:{ ClassNotFoundException -> 0x02bc }
            int r4 = r0.length     // Catch:{ ClassNotFoundException -> 0x02bc }
            java.lang.System.arraycopy(r0, r5, r2, r5, r4)     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x0290:
            java.lang.Class<com.cardinalcommerce.a.EMVCoError> r0 = com.cardinalcommerce.a.EMVCoError.class
            java.lang.Object r0 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.cca_continue((byte[]) r2, (java.lang.Class) r0)     // Catch:{ ClassNotFoundException -> 0x02bc }
            com.cardinalcommerce.a.EMVCoError r0 = (com.cardinalcommerce.a.EMVCoError) r0     // Catch:{ ClassNotFoundException -> 0x02bc }
            com.cardinalcommerce.a.EMVCoError r0 = r0.cca_continue(r1)     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.getWarnings = r0     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x029e:
            com.cardinalcommerce.a.setButtonDrawable r0 = new com.cardinalcommerce.a.setButtonDrawable     // Catch:{ ClassNotFoundException -> 0x02bc }
            r0.<init>(r10, r5)     // Catch:{ ClassNotFoundException -> 0x02bc }
            return r0
        L_0x02a4:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x02bc }
            throw r10     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x02aa:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x02bc }
            throw r10     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x02b0:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x02bc }
            throw r10     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x02b6:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x02bc }
            r10.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x02bc }
            throw r10     // Catch:{ ClassNotFoundException -> 0x02bc }
        L_0x02bc:
            r10 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r10 = r1.append(r10)
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        L_0x02d4:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "algorithm identifier in private key not recognised"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getProgressView.getInstance(com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo):com.cardinalcommerce.a.setCCAImageUri");
    }

    private static short[] Cardinal(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            int i2 = i << 1;
            sArr[i] = (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
        }
        return sArr;
    }

    public getProgressView(GMCipherSpi.SM2withSha256 sM2withSha256) {
        this.configure = sM2withSha256;
        int instance = sM2withSha256.getInstance();
        this.init = instance;
        this.getInstance = new byte[instance];
        this.cca_continue = new byte[instance];
        this.Cardinal = new byte[instance];
    }

    public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) throws IllegalArgumentException {
        GMCipherSpi.SM2withSha256 sM2withSha256;
        boolean z2 = this.getSDKVersion;
        this.getSDKVersion = z;
        if (sM2withRMD instanceof DigestSignatureSpi.MD4) {
            DigestSignatureSpi.MD4 md4 = (DigestSignatureSpi.MD4) sM2withRMD;
            byte[] bArr = md4.init;
            if (bArr.length == this.init) {
                System.arraycopy(bArr, 0, this.getInstance, 0, bArr.length);
                Cardinal();
                if (md4.cca_continue != null) {
                    sM2withSha256 = this.configure;
                    sM2withRMD = md4.cca_continue;
                } else if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                } else {
                    return;
                }
            } else {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
        } else {
            Cardinal();
            if (sM2withRMD != null) {
                sM2withSha256 = this.configure;
            } else if (z2 != z) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            } else {
                return;
            }
        }
        sM2withSha256.getInstance(z, sM2withRMD);
    }

    public final String cca_continue() {
        return new StringBuilder().append(this.configure.cca_continue()).append("/CBC").toString();
    }

    public final int getInstance() {
        return this.configure.getInstance();
    }

    public final int Cardinal(byte[] bArr, int i, byte[] bArr2, int i2) throws GMSignatureSpi, IllegalStateException {
        if (!this.getSDKVersion) {
            int i3 = this.init;
            if (i + i3 <= bArr.length) {
                System.arraycopy(bArr, i, this.Cardinal, 0, i3);
                int Cardinal2 = this.configure.Cardinal(bArr, i, bArr2, i2);
                for (int i4 = 0; i4 < this.init; i4++) {
                    int i5 = i2 + i4;
                    bArr2[i5] = (byte) (bArr2[i5] ^ this.cca_continue[i4]);
                }
                byte[] bArr3 = this.cca_continue;
                this.cca_continue = this.Cardinal;
                this.Cardinal = bArr3;
                return Cardinal2;
            }
            throw new GMSignatureSpi("input buffer too short");
        } else if (this.init + i <= bArr.length) {
            for (int i6 = 0; i6 < this.init; i6++) {
                byte[] bArr4 = this.cca_continue;
                bArr4[i6] = (byte) (bArr4[i6] ^ bArr[i + i6]);
            }
            int Cardinal3 = this.configure.Cardinal(this.cca_continue, 0, bArr2, i2);
            byte[] bArr5 = this.cca_continue;
            System.arraycopy(bArr2, i2, bArr5, 0, bArr5.length);
            return Cardinal3;
        } else {
            throw new GMSignatureSpi("input buffer too short");
        }
    }

    public final void Cardinal() {
        byte[] bArr = this.getInstance;
        System.arraycopy(bArr, 0, this.cca_continue, 0, bArr.length);
        byte[] bArr2 = this.Cardinal;
        for (int i = 0; i < bArr2.length; i++) {
            bArr2[i] = 0;
        }
        this.configure.Cardinal();
    }
}
