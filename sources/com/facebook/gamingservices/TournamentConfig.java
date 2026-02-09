package com.facebook.gamingservices;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentScoreType;
import com.facebook.gamingservices.internal.TournamentSortOrder;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0002$%B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001fH\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006&"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/share/model/ShareModel;", "builder", "Lcom/facebook/gamingservices/TournamentConfig$Builder;", "(Lcom/facebook/gamingservices/TournamentConfig$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "endTime", "Ljava/time/Instant;", "getEndTime", "()Ljava/time/Instant;", "image", "Landroid/media/Image;", "getImage", "()Landroid/media/Image;", "payload", "", "getPayload", "()Ljava/lang/String;", "scoreType", "Lcom/facebook/gamingservices/internal/TournamentScoreType;", "getScoreType", "()Lcom/facebook/gamingservices/internal/TournamentScoreType;", "sortOrder", "Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "getSortOrder", "()Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "title", "getTitle", "describeContents", "", "writeToParcel", "", "out", "flags", "Builder", "CREATOR", "facebook-gamingservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TournamentConfig.kt */
public final class TournamentConfig implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);
    private final Instant endTime;
    private final Image image;
    private final String payload;
    private final TournamentScoreType scoreType;
    private final TournamentSortOrder sortOrder;
    private final String title;

    public /* synthetic */ TournamentConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TournamentSortOrder getSortOrder() {
        return this.sortOrder;
    }

    public final TournamentScoreType getScoreType() {
        return this.scoreType;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getPayload() {
        return this.payload;
    }

    private TournamentConfig(Builder builder) {
        this.title = builder.getTitle();
        this.sortOrder = builder.getSortOrder();
        this.scoreType = builder.getScoreType();
        this.endTime = builder.getEndTime();
        this.image = builder.getImage();
        this.payload = builder.getPayload();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        r0 = r9.readString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TournamentConfig(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r8.<init>()
            java.lang.String r0 = r9.readString()
            r8.title = r0
            com.facebook.gamingservices.internal.TournamentSortOrder[] r0 = com.facebook.gamingservices.internal.TournamentSortOrder.values()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0015:
            r4 = 0
            if (r3 >= r1) goto L_0x002c
            r5 = r0[r3]
            java.lang.String r6 = r5.name()
            java.lang.String r7 = r9.readString()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x002c:
            r5 = r4
        L_0x002d:
            r8.sortOrder = r5
            com.facebook.gamingservices.internal.TournamentScoreType[] r0 = com.facebook.gamingservices.internal.TournamentScoreType.values()
            int r1 = r0.length
        L_0x0034:
            if (r2 >= r1) goto L_0x004a
            r3 = r0[r2]
            java.lang.String r5 = r3.name()
            java.lang.String r6 = r9.readString()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x004a:
            r3 = r4
        L_0x004b:
            r8.scoreType = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0066
            java.lang.String r0 = r9.readString()
            if (r0 == 0) goto L_0x0066
            com.facebook.gamingservices.internal.DateFormatter r1 = com.facebook.gamingservices.internal.DateFormatter.INSTANCE
            java.time.ZonedDateTime r0 = r1.format$facebook_gamingservices_release(r0)
            java.time.temporal.TemporalAccessor r0 = (java.time.temporal.TemporalAccessor) r0
            java.time.Instant r0 = java.time.Instant.from(r0)
            goto L_0x0067
        L_0x0066:
            r0 = r4
        L_0x0067:
            r8.endTime = r0
            java.lang.String r9 = r9.readString()
            r8.payload = r9
            r8.image = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.gamingservices.TournamentConfig.<init>(android.os.Parcel):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(String.valueOf(this.sortOrder));
        parcel.writeString(String.valueOf(this.scoreType));
        parcel.writeString(String.valueOf(this.endTime));
        parcel.writeString(this.title);
        parcel.writeString(this.payload);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020\u0002H\u0016J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\b)J\u0012\u0010&\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010,\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010-\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u00100\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015¨\u00061"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/gamingservices/TournamentConfig;", "()V", "endTime", "Ljava/time/Instant;", "getEndTime", "()Ljava/time/Instant;", "setEndTime", "(Ljava/time/Instant;)V", "image", "Landroid/media/Image;", "getImage", "()Landroid/media/Image;", "setImage", "(Landroid/media/Image;)V", "payload", "", "getPayload", "()Ljava/lang/String;", "setPayload", "(Ljava/lang/String;)V", "scoreType", "Lcom/facebook/gamingservices/internal/TournamentScoreType;", "getScoreType", "()Lcom/facebook/gamingservices/internal/TournamentScoreType;", "setScoreType", "(Lcom/facebook/gamingservices/internal/TournamentScoreType;)V", "sortOrder", "Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "getSortOrder", "()Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "setSortOrder", "(Lcom/facebook/gamingservices/internal/TournamentSortOrder;)V", "title", "getTitle", "setTitle", "build", "readFrom", "parcel", "Landroid/os/Parcel;", "readFrom$facebook_gamingservices_release", "model", "setTournamentEndTime", "setTournamentImage", "setTournamentPayload", "setTournamentScoreType", "setTournamentSortOrder", "setTournamentTitle", "facebook-gamingservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: TournamentConfig.kt */
    public static final class Builder implements ShareModelBuilder<TournamentConfig, Builder> {
        private Instant endTime;
        private Image image;
        private String payload;
        private TournamentScoreType scoreType;
        private TournamentSortOrder sortOrder;
        private String title;

        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final TournamentSortOrder getSortOrder() {
            return this.sortOrder;
        }

        public final void setSortOrder(TournamentSortOrder tournamentSortOrder) {
            this.sortOrder = tournamentSortOrder;
        }

        public final TournamentScoreType getScoreType() {
            return this.scoreType;
        }

        public final void setScoreType(TournamentScoreType tournamentScoreType) {
            this.scoreType = tournamentScoreType;
        }

        public final Instant getEndTime() {
            return this.endTime;
        }

        public final void setEndTime(Instant instant) {
            this.endTime = instant;
        }

        public final Image getImage() {
            return this.image;
        }

        public final void setImage(Image image2) {
            this.image = image2;
        }

        public final String getPayload() {
            return this.payload;
        }

        public final void setPayload(String str) {
            this.payload = str;
        }

        public final Builder setTournamentTitle(String str) {
            this.title = str;
            return this;
        }

        public final Builder setTournamentSortOrder(TournamentSortOrder tournamentSortOrder) {
            Intrinsics.checkNotNullParameter(tournamentSortOrder, SDKConstants.PARAM_SORT_ORDER);
            this.sortOrder = tournamentSortOrder;
            return this;
        }

        public final Builder setTournamentScoreType(TournamentScoreType tournamentScoreType) {
            Intrinsics.checkNotNullParameter(tournamentScoreType, "scoreType");
            this.scoreType = tournamentScoreType;
            return this;
        }

        public final Builder setTournamentEndTime(Instant instant) {
            Intrinsics.checkNotNullParameter(instant, SDKConstants.PARAM_END_TIME);
            this.endTime = instant;
            return this;
        }

        public final Builder setTournamentImage(Image image2) {
            this.image = image2;
            return this;
        }

        public final Builder setTournamentPayload(String str) {
            this.payload = str;
            return this;
        }

        public TournamentConfig build() {
            return new TournamentConfig(this, (DefaultConstructorMarker) null);
        }

        public final Builder readFrom$facebook_gamingservices_release(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((TournamentConfig) parcel.readParcelable(TournamentConfig.class.getClassLoader()));
        }

        public Builder readFrom(TournamentConfig tournamentConfig) {
            if (tournamentConfig == null) {
                return this;
            }
            TournamentSortOrder sortOrder2 = tournamentConfig.getSortOrder();
            if (sortOrder2 != null) {
                setTournamentSortOrder(sortOrder2);
            }
            TournamentScoreType scoreType2 = tournamentConfig.getScoreType();
            if (scoreType2 != null) {
                setTournamentScoreType(scoreType2);
            }
            Instant endTime2 = tournamentConfig.getEndTime();
            if (endTime2 != null) {
                setTournamentEndTime(endTime2);
            }
            String title2 = tournamentConfig.getTitle();
            if (title2 != null) {
                setTournamentTitle(title2);
            }
            setTournamentPayload(tournamentConfig.getPayload());
            return this;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/gamingservices/TournamentConfig;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/gamingservices/TournamentConfig;", "facebook-gamingservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: TournamentConfig.kt */
    public static final class CREATOR implements Parcelable.Creator<TournamentConfig> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public TournamentConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TournamentConfig(parcel);
        }

        public TournamentConfig[] newArray(int i) {
            return new TournamentConfig[i];
        }
    }
}
