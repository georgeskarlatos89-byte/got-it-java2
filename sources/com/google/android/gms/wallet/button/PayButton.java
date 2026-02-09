package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.wallet.R;
import com.google.android.gms.wallet.button.ButtonOptions;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class PayButton extends FrameLayout implements View.OnClickListener {
    private View.OnClickListener zza;
    private ButtonOptions.Builder zzb;
    private View zzc;
    private final zzf zzd;

    public PayButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public void initialize(ButtonOptions buttonOptions) {
        int i;
        Drawable drawable;
        ButtonOptions.Builder builder = this.zzb;
        if (buttonOptions.getButtonType() != 0) {
            ButtonOptions.this.zza = buttonOptions.getButtonType();
        }
        if (buttonOptions.getButtonTheme() != 0) {
            ButtonOptions.this.zzb = buttonOptions.getButtonTheme();
        }
        if (buttonOptions.zze) {
            builder.setCornerRadius(buttonOptions.getCornerRadius());
        }
        if (buttonOptions.getAllowedPaymentMethods() != null) {
            ButtonOptions.this.zzd = buttonOptions.getAllowedPaymentMethods();
        }
        removeAllViews();
        ButtonOptions build = this.zzb.build();
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getContext(), 232100000) != 0) {
            if (build.getButtonTheme() == 2) {
                i = R.style.PayButtonGenericLightTheme;
            } else {
                i = R.style.PayButtonGenericDarkTheme;
            }
            zzg zzg = new zzg(new ContextThemeWrapper(getContext(), i), (AttributeSet) null);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(zzg.getContext()).inflate(R.layout.paybutton_generic, zzg, true).findViewById(R.id.pay_button_view);
            Context context = zzg.getContext();
            int cornerRadius = build.getCornerRadius();
            GradientDrawable gradientDrawable = (GradientDrawable) zzh.zza(context, R.attr.payButtonGenericBackground).mutate();
            float f = (float) cornerRadius;
            gradientDrawable.setCornerRadius(f);
            int i2 = R.attr.payButtonGenericRippleColor;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            ColorStateList valueOf = ColorStateList.valueOf(color);
            if (PlatformVersion.isAtLeastLollipop()) {
                drawable = new RippleDrawable(valueOf, gradientDrawable, (Drawable) null);
            } else {
                GradientDrawable gradientDrawable2 = (GradientDrawable) zzh.zza(context, R.attr.payButtonGenericRippleMask).mutate();
                gradientDrawable2.setCornerRadius(f);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, layerDrawable);
                stateListDrawable.addState(new int[0], gradientDrawable);
                drawable = stateListDrawable;
            }
            linearLayout.setBackground(drawable);
            zzg.setContentDescription(zzg.getContext().getString(R.string.gpay_logo_description));
            this.zzc = zzg;
            addView(zzg);
            this.zzc.setOnClickListener(this);
            Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
        } else if (TextUtils.isEmpty(build.getAllowedPaymentMethods())) {
            Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
        } else {
            View zza2 = zzf.zza((Context) Preconditions.checkNotNull(getContext()), build);
            this.zzc = zza2;
            if (zza2 == null) {
                Log.e("PayButton", "Failed to create buttonView");
                return;
            }
            addView(zza2);
            this.zzc.setOnClickListener(this);
        }
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.zza;
        if (onClickListener != null && view == this.zzc) {
            onClickListener.onClick(this);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza = onClickListener;
    }

    public PayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ButtonOptions.Builder newBuilder = ButtonOptions.newBuilder();
        this.zzb = newBuilder;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PayButtonAttributes);
        int i2 = obtainStyledAttributes.getInt(R.styleable.PayButtonAttributes_buttonTheme, 1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PayButtonAttributes_cornerRadius, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.zzb = i2;
        buttonOptions.zzc = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(R.styleable.PayButtonAttributes_cornerRadius)) {
            ButtonOptions.this.zze = true;
        }
        obtainStyledAttributes.recycle();
        newBuilder.setButtonType(1);
        this.zzd = new zzf();
    }
}
