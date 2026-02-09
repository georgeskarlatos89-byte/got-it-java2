package com.aurelhubert.ahbottomnavigation.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class AHNotification implements Parcelable {
    public static final Parcelable.Creator<AHNotification> CREATOR = new Parcelable.Creator<AHNotification>() {
        public AHNotification createFromParcel(Parcel parcel) {
            return new AHNotification(parcel);
        }

        public AHNotification[] newArray(int i) {
            return new AHNotification[i];
        }
    };
    public static final int NOTIFICATION_SIZE_DEFAULT = -1;
    /* access modifiers changed from: private */
    public boolean animate;
    /* access modifiers changed from: private */
    public int backgroundColor;
    /* access modifiers changed from: private */
    public int size;
    /* access modifiers changed from: private */
    public String text;
    /* access modifiers changed from: private */
    public int textColor;

    public int describeContents() {
        return 0;
    }

    public AHNotification() {
        this.size = -1;
        this.animate = false;
    }

    private AHNotification(Parcel parcel) {
        this.size = -1;
        this.animate = false;
        this.text = parcel.readString();
        this.textColor = parcel.readInt();
        this.backgroundColor = parcel.readInt();
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.text) && this.size <= 0;
    }

    public boolean hasValue() {
        return (this.text == null && this.size == -1) ? false : true;
    }

    public boolean isDot() {
        return TextUtils.isEmpty(this.text) && this.size >= 0;
    }

    public String getReadableText() {
        String str = this.text;
        return str == null ? "" : str;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setAnimate(boolean z) {
        this.animate = z;
    }

    public boolean shouldAnimate() {
        return this.animate;
    }

    public static AHNotification justText(String str) {
        return new Builder().setText(str).build();
    }

    public static List<AHNotification> generateEmptyList(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new AHNotification());
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.backgroundColor);
        parcel.writeInt(this.size);
    }

    public boolean hasText() {
        return !TextUtils.isEmpty(this.text);
    }

    public static class Builder {
        private boolean animate = false;
        private int backgroundColor;
        private int size = -1;
        private String text;
        private int textColor;

        public Builder setText(String str) {
            this.text = str;
            return this;
        }

        public Builder setTextColor(int i) {
            this.textColor = i;
            return this;
        }

        public Builder setBackgroundColor(Integer num) {
            if (num == null) {
                return this;
            }
            this.backgroundColor = num.intValue();
            return this;
        }

        public Builder setSize(int i) {
            this.size = i;
            return this;
        }

        public Builder animate(boolean z) {
            this.animate = z;
            return this;
        }

        public AHNotification build() {
            AHNotification aHNotification = new AHNotification();
            String unused = aHNotification.text = this.text;
            int unused2 = aHNotification.textColor = this.textColor;
            int unused3 = aHNotification.backgroundColor = this.backgroundColor;
            int unused4 = aHNotification.size = this.size;
            boolean unused5 = aHNotification.animate = this.animate;
            return aHNotification;
        }
    }
}
