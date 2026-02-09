package androidx.camera.video.internal.config;

import androidx.camera.core.impl.CamcorderProfileProxy;
import androidx.camera.video.internal.config.MimeInfo;

final class AutoValue_MimeInfo extends MimeInfo {
    private final CamcorderProfileProxy compatibleCamcorderProfile;
    private final String mimeType;
    private final int profile;

    private AutoValue_MimeInfo(String str, int i, CamcorderProfileProxy camcorderProfileProxy) {
        this.mimeType = str;
        this.profile = i;
        this.compatibleCamcorderProfile = camcorderProfileProxy;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public int getProfile() {
        return this.profile;
    }

    public CamcorderProfileProxy getCompatibleCamcorderProfile() {
        return this.compatibleCamcorderProfile;
    }

    public String toString() {
        return "MimeInfo{mimeType=" + this.mimeType + ", profile=" + this.profile + ", compatibleCamcorderProfile=" + this.compatibleCamcorderProfile + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MimeInfo)) {
            return false;
        }
        MimeInfo mimeInfo = (MimeInfo) obj;
        if (this.mimeType.equals(mimeInfo.getMimeType()) && this.profile == mimeInfo.getProfile()) {
            CamcorderProfileProxy camcorderProfileProxy = this.compatibleCamcorderProfile;
            if (camcorderProfileProxy == null) {
                if (mimeInfo.getCompatibleCamcorderProfile() == null) {
                    return true;
                }
            } else if (camcorderProfileProxy.equals(mimeInfo.getCompatibleCamcorderProfile())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003;
        CamcorderProfileProxy camcorderProfileProxy = this.compatibleCamcorderProfile;
        return hashCode ^ (camcorderProfileProxy == null ? 0 : camcorderProfileProxy.hashCode());
    }

    static final class Builder extends MimeInfo.Builder {
        private CamcorderProfileProxy compatibleCamcorderProfile;
        private String mimeType;
        private Integer profile;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public MimeInfo.Builder setMimeType(String str) {
            if (str != null) {
                this.mimeType = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        public MimeInfo.Builder setProfile(int i) {
            this.profile = Integer.valueOf(i);
            return this;
        }

        public MimeInfo.Builder setCompatibleCamcorderProfile(CamcorderProfileProxy camcorderProfileProxy) {
            this.compatibleCamcorderProfile = camcorderProfileProxy;
            return this;
        }

        public MimeInfo build() {
            String str = this.mimeType == null ? " mimeType" : "";
            if (this.profile == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new AutoValue_MimeInfo(this.mimeType, this.profile.intValue(), this.compatibleCamcorderProfile);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
