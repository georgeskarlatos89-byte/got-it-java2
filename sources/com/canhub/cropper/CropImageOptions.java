package com.canhub.cropper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.canhub.cropper.CropImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\bW\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bá\u0005\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u001f\u001a\u00020\n\u0012\b\b\u0003\u0010 \u001a\u00020\u0015\u0012\b\b\u0003\u0010!\u001a\u00020\n\u0012\b\b\u0003\u0010\"\u001a\u00020\n\u0012\b\b\u0003\u0010#\u001a\u00020\n\u0012\b\b\u0003\u0010$\u001a\u00020\u0015\u0012\b\b\u0003\u0010%\u001a\u00020\u0015\u0012\b\b\u0003\u0010&\u001a\u00020\n\u0012\b\b\u0003\u0010'\u001a\u00020\u0015\u0012\b\b\u0003\u0010(\u001a\u00020\u0015\u0012\b\b\u0003\u0010)\u001a\u00020\u0015\u0012\b\b\u0003\u0010*\u001a\u00020\u0015\u0012\b\b\u0003\u0010+\u001a\u00020\u0015\u0012\b\b\u0003\u0010,\u001a\u00020\u0015\u0012\b\b\u0003\u0010-\u001a\u00020\u0015\u0012\b\b\u0003\u0010.\u001a\u00020\u0015\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\b\b\u0003\u00101\u001a\u00020\u0015\u0012\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00105\u001a\u000206\u0012\b\b\u0002\u00107\u001a\u00020\u0015\u0012\b\b\u0003\u00108\u001a\u00020\u0015\u0012\b\b\u0003\u00109\u001a\u00020\u0015\u0012\b\b\u0002\u0010:\u001a\u00020;\u0012\b\b\u0002\u0010<\u001a\u00020\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\b\b\u0002\u0010?\u001a\u00020\u0015\u0012\b\b\u0002\u0010@\u001a\u00020\u0003\u0012\b\b\u0002\u0010A\u001a\u00020\u0003\u0012\b\b\u0002\u0010B\u001a\u00020\u0003\u0012\b\b\u0002\u0010C\u001a\u00020\u0015\u0012\b\b\u0002\u0010D\u001a\u00020\u0003\u0012\b\b\u0002\u0010E\u001a\u00020\u0003\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u000100\u0012\b\b\u0003\u0010G\u001a\u00020\u0015\u0012\b\b\u0002\u0010H\u001a\u00020\u0003\u0012\b\b\u0002\u0010I\u001a\u00020\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010M\u0012\b\b\u0003\u0010N\u001a\u00020\n\u0012\b\b\u0003\u0010O\u001a\u00020\u0015\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010K\u0012\b\b\u0003\u0010Q\u001a\u00020\u0015\u0012\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bV\u0010WJ\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\nHÆ\u0003J\t\u0010^\u001a\u00020\nHÆ\u0003J\t\u0010_\u001a\u00020\nHÆ\u0003J\t\u0010`\u001a\u00020\u000eHÆ\u0003J\t\u0010a\u001a\u00020\u0010HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0015HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0015HÆ\u0003J\t\u0010k\u001a\u00020\nHÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0015HÆ\u0003J\t\u0010n\u001a\u00020\u0015HÆ\u0003J\t\u0010o\u001a\u00020\nHÆ\u0003J\t\u0010p\u001a\u00020\u0015HÆ\u0003J\t\u0010q\u001a\u00020\nHÆ\u0003J\t\u0010r\u001a\u00020\nHÆ\u0003J\t\u0010s\u001a\u00020\nHÆ\u0003J\t\u0010t\u001a\u00020\u0015HÆ\u0003J\t\u0010u\u001a\u00020\u0015HÆ\u0003J\t\u0010v\u001a\u00020\nHÆ\u0003J\t\u0010w\u001a\u00020\u0015HÆ\u0003J\t\u0010x\u001a\u00020\u0015HÆ\u0003J\t\u0010y\u001a\u00020\u0015HÆ\u0003J\t\u0010z\u001a\u00020\u0015HÆ\u0003J\t\u0010{\u001a\u00020\u0015HÆ\u0003J\t\u0010|\u001a\u00020\u0015HÆ\u0003J\t\u0010}\u001a\u00020\u0015HÆ\u0003J\t\u0010~\u001a\u00020\u0015HÆ\u0003J\t\u0010\u001a\u000200HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0003\u0010\u0001J\f\u0010\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\n\u0010\u0001\u001a\u000206HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020;HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010>HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010KHÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010MHÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010KHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0003\u0010\u0001J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0003\u0010\u0001J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0003\u0010\u0001J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0003\u0010\u0001Jè\u0005\u0010 \u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0003\u0010\u001f\u001a\u00020\n2\b\b\u0003\u0010 \u001a\u00020\u00152\b\b\u0003\u0010!\u001a\u00020\n2\b\b\u0003\u0010\"\u001a\u00020\n2\b\b\u0003\u0010#\u001a\u00020\n2\b\b\u0003\u0010$\u001a\u00020\u00152\b\b\u0003\u0010%\u001a\u00020\u00152\b\b\u0003\u0010&\u001a\u00020\n2\b\b\u0003\u0010'\u001a\u00020\u00152\b\b\u0003\u0010(\u001a\u00020\u00152\b\b\u0003\u0010)\u001a\u00020\u00152\b\b\u0003\u0010*\u001a\u00020\u00152\b\b\u0003\u0010+\u001a\u00020\u00152\b\b\u0003\u0010,\u001a\u00020\u00152\b\b\u0003\u0010-\u001a\u00020\u00152\b\b\u0003\u0010.\u001a\u00020\u00152\b\b\u0002\u0010/\u001a\u0002002\b\b\u0003\u00101\u001a\u00020\u00152\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00152\b\b\u0003\u00108\u001a\u00020\u00152\b\b\u0003\u00109\u001a\u00020\u00152\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010?\u001a\u00020\u00152\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00152\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u0001002\b\b\u0003\u0010G\u001a\u00020\u00152\b\b\u0002\u0010H\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010M2\b\b\u0003\u0010N\u001a\u00020\n2\b\b\u0003\u0010O\u001a\u00020\u00152\n\b\u0002\u0010P\u001a\u0004\u0018\u00010K2\b\b\u0003\u0010Q\u001a\u00020\u00152\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0003\u0010¡\u0001J\u0007\u0010¢\u0001\u001a\u00020\u0015J\u0016\u0010£\u0001\u001a\u00020\u00032\n\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u0001HÖ\u0003J\n\u0010¦\u0001\u001a\u00020\u0015HÖ\u0001J\n\u0010§\u0001\u001a\u00020KHÖ\u0001J\u001b\u0010¨\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030«\u00012\u0007\u0010¬\u0001\u001a\u00020\u0015R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010.\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010/\u001a\u0002008\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0004\n\u0002\u0010XR\u0014\u00103\u001a\u0004\u0018\u0001048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00105\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00108\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00109\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010:\u001a\u00020;8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010<\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010@\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010A\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010B\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010C\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010D\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010E\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u0004\u0018\u0001008\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010G\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010H\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010I\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010M8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010N\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010O\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Q\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010R\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0004\n\u0002\u0010XR\u0016\u0010S\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0004\n\u0002\u0010XR\u0016\u0010T\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0004\n\u0002\u0010XR\u0016\u0010U\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0004\n\u0002\u0010X¨\u0006­\u0001"}, d2 = {"Lcom/canhub/cropper/CropImageOptions;", "Landroid/os/Parcelable;", "imageSourceIncludeGallery", "", "imageSourceIncludeCamera", "cropShape", "Lcom/canhub/cropper/CropImageView$CropShape;", "cornerShape", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cropCornerRadius", "", "snapRadius", "touchRadius", "guidelines", "Lcom/canhub/cropper/CropImageView$Guidelines;", "scaleType", "Lcom/canhub/cropper/CropImageView$ScaleType;", "showCropOverlay", "showCropLabel", "showProgressBar", "progressBarColor", "", "autoZoomEnabled", "multiTouchEnabled", "centerMoveEnabled", "canChangeCropWindow", "maxZoom", "initialCropWindowPaddingRatio", "fixAspectRatio", "aspectRatioX", "aspectRatioY", "borderLineThickness", "borderLineColor", "borderCornerThickness", "borderCornerOffset", "borderCornerLength", "borderCornerColor", "circleCornerFillColorHexValue", "guidelinesThickness", "guidelinesColor", "backgroundColor", "minCropWindowWidth", "minCropWindowHeight", "minCropResultWidth", "minCropResultHeight", "maxCropResultWidth", "maxCropResultHeight", "activityTitle", "", "activityMenuIconColor", "activityMenuTextColor", "customOutputUri", "Landroid/net/Uri;", "outputCompressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "outputCompressQuality", "outputRequestWidth", "outputRequestHeight", "outputRequestSizeOptions", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "noOutputImage", "initialCropWindowRectangle", "Landroid/graphics/Rect;", "initialRotation", "allowRotation", "allowFlipping", "allowCounterRotation", "rotationDegrees", "flipHorizontally", "flipVertically", "cropMenuCropButtonTitle", "cropMenuCropButtonIcon", "skipEditing", "showIntentChooser", "intentChooserTitle", "", "intentChooserPriorityList", "", "cropperLabelTextSize", "cropperLabelTextColor", "cropperLabelText", "activityBackgroundColor", "toolbarColor", "toolbarTitleColor", "toolbarBackButtonColor", "toolbarTintColor", "<init>", "(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "()Ljava/lang/Integer;", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "copy", "(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/canhub/cropper/CropImageOptions;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: CropImageOptions.kt */
public final class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new Creator();
    public int activityBackgroundColor;
    public int activityMenuIconColor;
    public Integer activityMenuTextColor;
    public CharSequence activityTitle;
    public boolean allowCounterRotation;
    public boolean allowFlipping;
    public boolean allowRotation;
    public int aspectRatioX;
    public int aspectRatioY;
    public boolean autoZoomEnabled;
    public int backgroundColor;
    public int borderCornerColor;
    public float borderCornerLength;
    public float borderCornerOffset;
    public float borderCornerThickness;
    public int borderLineColor;
    public float borderLineThickness;
    public boolean canChangeCropWindow;
    public boolean centerMoveEnabled;
    public int circleCornerFillColorHexValue;
    public CropImageView.CropCornerShape cornerShape;
    public float cropCornerRadius;
    public int cropMenuCropButtonIcon;
    public CharSequence cropMenuCropButtonTitle;
    public CropImageView.CropShape cropShape;
    public String cropperLabelText;
    public int cropperLabelTextColor;
    public float cropperLabelTextSize;
    public Uri customOutputUri;
    public boolean fixAspectRatio;
    public boolean flipHorizontally;
    public boolean flipVertically;
    public CropImageView.Guidelines guidelines;
    public int guidelinesColor;
    public float guidelinesThickness;
    public boolean imageSourceIncludeCamera;
    public boolean imageSourceIncludeGallery;
    public float initialCropWindowPaddingRatio;
    public Rect initialCropWindowRectangle;
    public int initialRotation;
    public List<String> intentChooserPriorityList;
    public String intentChooserTitle;
    public int maxCropResultHeight;
    public int maxCropResultWidth;
    public int maxZoom;
    public int minCropResultHeight;
    public int minCropResultWidth;
    public int minCropWindowHeight;
    public int minCropWindowWidth;
    public boolean multiTouchEnabled;
    public boolean noOutputImage;
    public Bitmap.CompressFormat outputCompressFormat;
    public int outputCompressQuality;
    public int outputRequestHeight;
    public CropImageView.RequestSizeOptions outputRequestSizeOptions;
    public int outputRequestWidth;
    public int progressBarColor;
    public int rotationDegrees;
    public CropImageView.ScaleType scaleType;
    public boolean showCropLabel;
    public boolean showCropOverlay;
    public boolean showIntentChooser;
    public boolean showProgressBar;
    public boolean skipEditing;
    public float snapRadius;
    public Integer toolbarBackButtonColor;
    public Integer toolbarColor;
    public Integer toolbarTintColor;
    public Integer toolbarTitleColor;
    public float touchRadius;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* compiled from: CropImageOptions.kt */
    public static final class Creator implements Parcelable.Creator<CropImageOptions> {
        public final CropImageOptions createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            return new CropImageOptions(parcel.readInt() != 0, parcel.readInt() != 0, CropImageView.CropShape.valueOf(parcel.readString()), CropImageView.CropCornerShape.valueOf(parcel.readString()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), CropImageView.Guidelines.valueOf(parcel.readString()), CropImageView.ScaleType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel2.readParcelable(CropImageOptions.class.getClassLoader()), Bitmap.CompressFormat.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), CropImageView.RequestSizeOptions.valueOf(parcel.readString()), parcel.readInt() != 0, (Rect) parcel2.readParcelable(CropImageOptions.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        this(false, false, (CropImageView.CropShape) null, (CropImageView.CropCornerShape) null, 0.0f, 0.0f, 0.0f, (CropImageView.Guidelines) null, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -1, -1, 63, (DefaultConstructorMarker) null);
    }

    public CropImageOptions(boolean z) {
        this(z, false, (CropImageView.CropShape) null, (CropImageView.CropCornerShape) null, 0.0f, 0.0f, 0.0f, (CropImageView.Guidelines) null, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -2, -1, 63, (DefaultConstructorMarker) null);
    }

    public CropImageOptions(boolean z, boolean z2) {
        this(z, z2, (CropImageView.CropShape) null, (CropImageView.CropCornerShape) null, 0.0f, 0.0f, 0.0f, (CropImageView.Guidelines) null, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -4, -1, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2) {
        this(z, z2, cropShape2, (CropImageView.CropCornerShape) null, 0.0f, 0.0f, 0.0f, (CropImageView.Guidelines) null, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -8, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape) {
        this(z, z2, cropShape2, cropCornerShape, 0.0f, 0.0f, 0.0f, (CropImageView.Guidelines) null, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -16, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f) {
        this(z, z2, cropShape2, cropCornerShape, f, 0.0f, 0.0f, (CropImageView.Guidelines) null, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -32, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, 0.0f, (CropImageView.Guidelines) null, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -64, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, (CropImageView.Guidelines) null, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -128, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, (CropImageView.ScaleType) null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, InputDeviceCompat.SOURCE_ANY, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -512, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -1024, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -2048, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -4096, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -8192, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -16384, -1, 63, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -32768, -1, 63, (DefaultConstructorMarker) null);
        boolean z8 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, SupportMenu.CATEGORY_MASK, -1, 63, (DefaultConstructorMarker) null);
        boolean z9 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -131072, -1, 63, (DefaultConstructorMarker) null);
        boolean z10 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -262144, -1, 63, (DefaultConstructorMarker) null);
        boolean z10 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -524288, -1, 63, (DefaultConstructorMarker) null);
        boolean z10 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -1048576, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -2097152, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -4194304, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -8388608, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -16777216, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -33554432, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -67108864, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -134217728, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -268435456, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -536870912, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, -1073741824, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, Integer.MIN_VALUE, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -1, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, 0, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -2, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, 0, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -4, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, 0, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -8, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, 0, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -16, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, 0, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -32, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, (CharSequence) null, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -64, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, 0, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -128, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, (Integer) null, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, InputDeviceCompat.SOURCE_ANY, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, (Uri) null, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -512, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, (Bitmap.CompressFormat) null, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -1024, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, 0, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -2048, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, 0, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -4096, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, 0, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -8192, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, (CropImageView.RequestSizeOptions) null, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -16384, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, false, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -32768, 63, (DefaultConstructorMarker) null);
        boolean z11 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, (Rect) null, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, SupportMenu.CATEGORY_MASK, 63, (DefaultConstructorMarker) null);
        boolean z12 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, 0, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -131072, 63, (DefaultConstructorMarker) null);
        boolean z12 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, false, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -262144, 63, (DefaultConstructorMarker) null);
        boolean z12 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, false, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -524288, 63, (DefaultConstructorMarker) null);
        boolean z13 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, false, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -1048576, 63, (DefaultConstructorMarker) null);
        boolean z14 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, 0, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -2097152, 63, (DefaultConstructorMarker) null);
        boolean z15 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, false, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -4194304, 63, (DefaultConstructorMarker) null);
        boolean z15 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, false, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -8388608, 63, (DefaultConstructorMarker) null);
        boolean z16 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, (CharSequence) null, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -16777216, 63, (DefaultConstructorMarker) null);
        boolean z17 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, 0, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -33554432, 63, (DefaultConstructorMarker) null);
        boolean z17 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, false, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -67108864, 63, (DefaultConstructorMarker) null);
        boolean z17 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, false, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -134217728, 63, (DefaultConstructorMarker) null);
        boolean z18 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, (String) null, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -268435456, 63, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, (List) null, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -536870912, 63, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, 0.0f, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, -1073741824, 63, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, f10, 0, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, Integer.MIN_VALUE, 63, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, f10, i23, (String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, 0, 63, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23, String str2) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, f10, i23, str2, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, 0, 62, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23, String str2, int i24) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, f10, i23, str2, i24, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, 0, 60, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23, String str2, int i24, Integer num2) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, f10, i23, str2, i24, num2, (Integer) null, (Integer) null, (Integer) null, 0, 0, 56, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23, String str2, int i24, Integer num2, Integer num3) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, f10, i23, str2, i24, num2, num3, (Integer) null, (Integer) null, 0, 0, 48, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23, String str2, int i24, Integer num2, Integer num3, Integer num4) {
        this(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, f10, i23, str2, i24, num2, num3, num4, (Integer) null, 0, 0, 32, (DefaultConstructorMarker) null);
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
    }

    public static /* synthetic */ CropImageOptions copy$default(CropImageOptions cropImageOptions, boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List list, float f10, int i23, String str2, int i24, Integer num2, Integer num3, Integer num4, Integer num5, int i25, int i26, int i27, Object obj) {
        CropImageOptions cropImageOptions2 = cropImageOptions;
        int i28 = i25;
        int i29 = i26;
        return cropImageOptions.copy((i28 & 1) != 0 ? cropImageOptions2.imageSourceIncludeGallery : z, (i28 & 2) != 0 ? cropImageOptions2.imageSourceIncludeCamera : z2, (i28 & 4) != 0 ? cropImageOptions2.cropShape : cropShape2, (i28 & 8) != 0 ? cropImageOptions2.cornerShape : cropCornerShape, (i28 & 16) != 0 ? cropImageOptions2.cropCornerRadius : f, (i28 & 32) != 0 ? cropImageOptions2.snapRadius : f2, (i28 & 64) != 0 ? cropImageOptions2.touchRadius : f3, (i28 & 128) != 0 ? cropImageOptions2.guidelines : guidelines2, (i28 & 256) != 0 ? cropImageOptions2.scaleType : scaleType2, (i28 & 512) != 0 ? cropImageOptions2.showCropOverlay : z3, (i28 & 1024) != 0 ? cropImageOptions2.showCropLabel : z4, (i28 & 2048) != 0 ? cropImageOptions2.showProgressBar : z5, (i28 & 4096) != 0 ? cropImageOptions2.progressBarColor : i, (i28 & 8192) != 0 ? cropImageOptions2.autoZoomEnabled : z6, (i28 & 16384) != 0 ? cropImageOptions2.multiTouchEnabled : z7, (i28 & 32768) != 0 ? cropImageOptions2.centerMoveEnabled : z8, (i28 & 65536) != 0 ? cropImageOptions2.canChangeCropWindow : z9, (i28 & 131072) != 0 ? cropImageOptions2.maxZoom : i2, (i28 & 262144) != 0 ? cropImageOptions2.initialCropWindowPaddingRatio : f4, (i28 & 524288) != 0 ? cropImageOptions2.fixAspectRatio : z10, (i28 & 1048576) != 0 ? cropImageOptions2.aspectRatioX : i3, (i28 & 2097152) != 0 ? cropImageOptions2.aspectRatioY : i4, (i28 & 4194304) != 0 ? cropImageOptions2.borderLineThickness : f5, (i28 & 8388608) != 0 ? cropImageOptions2.borderLineColor : i5, (i28 & 16777216) != 0 ? cropImageOptions2.borderCornerThickness : f6, (i28 & 33554432) != 0 ? cropImageOptions2.borderCornerOffset : f7, (i28 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? cropImageOptions2.borderCornerLength : f8, (i28 & 134217728) != 0 ? cropImageOptions2.borderCornerColor : i6, (i28 & 268435456) != 0 ? cropImageOptions2.circleCornerFillColorHexValue : i7, (i28 & 536870912) != 0 ? cropImageOptions2.guidelinesThickness : f9, (i28 & 1073741824) != 0 ? cropImageOptions2.guidelinesColor : i8, (i28 & Integer.MIN_VALUE) != 0 ? cropImageOptions2.backgroundColor : i9, (i29 & 1) != 0 ? cropImageOptions2.minCropWindowWidth : i10, (i29 & 2) != 0 ? cropImageOptions2.minCropWindowHeight : i11, (i29 & 4) != 0 ? cropImageOptions2.minCropResultWidth : i12, (i29 & 8) != 0 ? cropImageOptions2.minCropResultHeight : i13, (i29 & 16) != 0 ? cropImageOptions2.maxCropResultWidth : i14, (i29 & 32) != 0 ? cropImageOptions2.maxCropResultHeight : i15, (i29 & 64) != 0 ? cropImageOptions2.activityTitle : charSequence, (i29 & 128) != 0 ? cropImageOptions2.activityMenuIconColor : i16, (i29 & 256) != 0 ? cropImageOptions2.activityMenuTextColor : num, (i29 & 512) != 0 ? cropImageOptions2.customOutputUri : uri, (i29 & 1024) != 0 ? cropImageOptions2.outputCompressFormat : compressFormat, (i29 & 2048) != 0 ? cropImageOptions2.outputCompressQuality : i17, (i29 & 4096) != 0 ? cropImageOptions2.outputRequestWidth : i18, (i29 & 8192) != 0 ? cropImageOptions2.outputRequestHeight : i19, (i29 & 16384) != 0 ? cropImageOptions2.outputRequestSizeOptions : requestSizeOptions, (i29 & 32768) != 0 ? cropImageOptions2.noOutputImage : z11, (i29 & 65536) != 0 ? cropImageOptions2.initialCropWindowRectangle : rect, (i29 & 131072) != 0 ? cropImageOptions2.initialRotation : i20, (i29 & 262144) != 0 ? cropImageOptions2.allowRotation : z12, (i29 & 524288) != 0 ? cropImageOptions2.allowFlipping : z13, (i29 & 1048576) != 0 ? cropImageOptions2.allowCounterRotation : z14, (i29 & 2097152) != 0 ? cropImageOptions2.rotationDegrees : i21, (i29 & 4194304) != 0 ? cropImageOptions2.flipHorizontally : z15, (i29 & 8388608) != 0 ? cropImageOptions2.flipVertically : z16, (i29 & 16777216) != 0 ? cropImageOptions2.cropMenuCropButtonTitle : charSequence2, (i29 & 33554432) != 0 ? cropImageOptions2.cropMenuCropButtonIcon : i22, (i29 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? cropImageOptions2.skipEditing : z17, (i29 & 134217728) != 0 ? cropImageOptions2.showIntentChooser : z18, (i29 & 268435456) != 0 ? cropImageOptions2.intentChooserTitle : str, (i29 & 536870912) != 0 ? cropImageOptions2.intentChooserPriorityList : list, (i29 & 1073741824) != 0 ? cropImageOptions2.cropperLabelTextSize : f10, (i29 & Integer.MIN_VALUE) != 0 ? cropImageOptions2.cropperLabelTextColor : i23, (i27 & 1) != 0 ? cropImageOptions2.cropperLabelText : str2, (i27 & 2) != 0 ? cropImageOptions2.activityBackgroundColor : i24, (i27 & 4) != 0 ? cropImageOptions2.toolbarColor : num2, (i27 & 8) != 0 ? cropImageOptions2.toolbarTitleColor : num3, (i27 & 16) != 0 ? cropImageOptions2.toolbarBackButtonColor : num4, (i27 & 32) != 0 ? cropImageOptions2.toolbarTintColor : num5);
    }

    public final boolean component1() {
        return this.imageSourceIncludeGallery;
    }

    public final boolean component10() {
        return this.showCropOverlay;
    }

    public final boolean component11() {
        return this.showCropLabel;
    }

    public final boolean component12() {
        return this.showProgressBar;
    }

    public final int component13() {
        return this.progressBarColor;
    }

    public final boolean component14() {
        return this.autoZoomEnabled;
    }

    public final boolean component15() {
        return this.multiTouchEnabled;
    }

    public final boolean component16() {
        return this.centerMoveEnabled;
    }

    public final boolean component17() {
        return this.canChangeCropWindow;
    }

    public final int component18() {
        return this.maxZoom;
    }

    public final float component19() {
        return this.initialCropWindowPaddingRatio;
    }

    public final boolean component2() {
        return this.imageSourceIncludeCamera;
    }

    public final boolean component20() {
        return this.fixAspectRatio;
    }

    public final int component21() {
        return this.aspectRatioX;
    }

    public final int component22() {
        return this.aspectRatioY;
    }

    public final float component23() {
        return this.borderLineThickness;
    }

    public final int component24() {
        return this.borderLineColor;
    }

    public final float component25() {
        return this.borderCornerThickness;
    }

    public final float component26() {
        return this.borderCornerOffset;
    }

    public final float component27() {
        return this.borderCornerLength;
    }

    public final int component28() {
        return this.borderCornerColor;
    }

    public final int component29() {
        return this.circleCornerFillColorHexValue;
    }

    public final CropImageView.CropShape component3() {
        return this.cropShape;
    }

    public final float component30() {
        return this.guidelinesThickness;
    }

    public final int component31() {
        return this.guidelinesColor;
    }

    public final int component32() {
        return this.backgroundColor;
    }

    public final int component33() {
        return this.minCropWindowWidth;
    }

    public final int component34() {
        return this.minCropWindowHeight;
    }

    public final int component35() {
        return this.minCropResultWidth;
    }

    public final int component36() {
        return this.minCropResultHeight;
    }

    public final int component37() {
        return this.maxCropResultWidth;
    }

    public final int component38() {
        return this.maxCropResultHeight;
    }

    public final CharSequence component39() {
        return this.activityTitle;
    }

    public final CropImageView.CropCornerShape component4() {
        return this.cornerShape;
    }

    public final int component40() {
        return this.activityMenuIconColor;
    }

    public final Integer component41() {
        return this.activityMenuTextColor;
    }

    public final Uri component42() {
        return this.customOutputUri;
    }

    public final Bitmap.CompressFormat component43() {
        return this.outputCompressFormat;
    }

    public final int component44() {
        return this.outputCompressQuality;
    }

    public final int component45() {
        return this.outputRequestWidth;
    }

    public final int component46() {
        return this.outputRequestHeight;
    }

    public final CropImageView.RequestSizeOptions component47() {
        return this.outputRequestSizeOptions;
    }

    public final boolean component48() {
        return this.noOutputImage;
    }

    public final Rect component49() {
        return this.initialCropWindowRectangle;
    }

    public final float component5() {
        return this.cropCornerRadius;
    }

    public final int component50() {
        return this.initialRotation;
    }

    public final boolean component51() {
        return this.allowRotation;
    }

    public final boolean component52() {
        return this.allowFlipping;
    }

    public final boolean component53() {
        return this.allowCounterRotation;
    }

    public final int component54() {
        return this.rotationDegrees;
    }

    public final boolean component55() {
        return this.flipHorizontally;
    }

    public final boolean component56() {
        return this.flipVertically;
    }

    public final CharSequence component57() {
        return this.cropMenuCropButtonTitle;
    }

    public final int component58() {
        return this.cropMenuCropButtonIcon;
    }

    public final boolean component59() {
        return this.skipEditing;
    }

    public final float component6() {
        return this.snapRadius;
    }

    public final boolean component60() {
        return this.showIntentChooser;
    }

    public final String component61() {
        return this.intentChooserTitle;
    }

    public final List<String> component62() {
        return this.intentChooserPriorityList;
    }

    public final float component63() {
        return this.cropperLabelTextSize;
    }

    public final int component64() {
        return this.cropperLabelTextColor;
    }

    public final String component65() {
        return this.cropperLabelText;
    }

    public final int component66() {
        return this.activityBackgroundColor;
    }

    public final Integer component67() {
        return this.toolbarColor;
    }

    public final Integer component68() {
        return this.toolbarTitleColor;
    }

    public final Integer component69() {
        return this.toolbarBackButtonColor;
    }

    public final float component7() {
        return this.touchRadius;
    }

    public final Integer component70() {
        return this.toolbarTintColor;
    }

    public final CropImageView.Guidelines component8() {
        return this.guidelines;
    }

    public final CropImageView.ScaleType component9() {
        return this.scaleType;
    }

    public final CropImageOptions copy(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23, String str2, int i24, Integer num2, Integer num3, Integer num4, Integer num5) {
        boolean z19 = z;
        Intrinsics.checkNotNullParameter(cropShape2, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines2, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType2, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions, "outputRequestSizeOptions");
        return new CropImageOptions(z, z2, cropShape2, cropCornerShape, f, f2, f3, guidelines2, scaleType2, z3, z4, z5, i, z6, z7, z8, z9, i2, f4, z10, i3, i4, f5, i5, f6, f7, f8, i6, i7, f9, i8, i9, i10, i11, i12, i13, i14, i15, charSequence, i16, num, uri, compressFormat, i17, i18, i19, requestSizeOptions, z11, rect, i20, z12, z13, z14, i21, z15, z16, charSequence2, i22, z17, z18, str, list, f10, i23, str2, i24, num2, num3, num4, num5);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) obj;
        return this.imageSourceIncludeGallery == cropImageOptions.imageSourceIncludeGallery && this.imageSourceIncludeCamera == cropImageOptions.imageSourceIncludeCamera && this.cropShape == cropImageOptions.cropShape && this.cornerShape == cropImageOptions.cornerShape && Float.compare(this.cropCornerRadius, cropImageOptions.cropCornerRadius) == 0 && Float.compare(this.snapRadius, cropImageOptions.snapRadius) == 0 && Float.compare(this.touchRadius, cropImageOptions.touchRadius) == 0 && this.guidelines == cropImageOptions.guidelines && this.scaleType == cropImageOptions.scaleType && this.showCropOverlay == cropImageOptions.showCropOverlay && this.showCropLabel == cropImageOptions.showCropLabel && this.showProgressBar == cropImageOptions.showProgressBar && this.progressBarColor == cropImageOptions.progressBarColor && this.autoZoomEnabled == cropImageOptions.autoZoomEnabled && this.multiTouchEnabled == cropImageOptions.multiTouchEnabled && this.centerMoveEnabled == cropImageOptions.centerMoveEnabled && this.canChangeCropWindow == cropImageOptions.canChangeCropWindow && this.maxZoom == cropImageOptions.maxZoom && Float.compare(this.initialCropWindowPaddingRatio, cropImageOptions.initialCropWindowPaddingRatio) == 0 && this.fixAspectRatio == cropImageOptions.fixAspectRatio && this.aspectRatioX == cropImageOptions.aspectRatioX && this.aspectRatioY == cropImageOptions.aspectRatioY && Float.compare(this.borderLineThickness, cropImageOptions.borderLineThickness) == 0 && this.borderLineColor == cropImageOptions.borderLineColor && Float.compare(this.borderCornerThickness, cropImageOptions.borderCornerThickness) == 0 && Float.compare(this.borderCornerOffset, cropImageOptions.borderCornerOffset) == 0 && Float.compare(this.borderCornerLength, cropImageOptions.borderCornerLength) == 0 && this.borderCornerColor == cropImageOptions.borderCornerColor && this.circleCornerFillColorHexValue == cropImageOptions.circleCornerFillColorHexValue && Float.compare(this.guidelinesThickness, cropImageOptions.guidelinesThickness) == 0 && this.guidelinesColor == cropImageOptions.guidelinesColor && this.backgroundColor == cropImageOptions.backgroundColor && this.minCropWindowWidth == cropImageOptions.minCropWindowWidth && this.minCropWindowHeight == cropImageOptions.minCropWindowHeight && this.minCropResultWidth == cropImageOptions.minCropResultWidth && this.minCropResultHeight == cropImageOptions.minCropResultHeight && this.maxCropResultWidth == cropImageOptions.maxCropResultWidth && this.maxCropResultHeight == cropImageOptions.maxCropResultHeight && Intrinsics.areEqual((Object) this.activityTitle, (Object) cropImageOptions.activityTitle) && this.activityMenuIconColor == cropImageOptions.activityMenuIconColor && Intrinsics.areEqual((Object) this.activityMenuTextColor, (Object) cropImageOptions.activityMenuTextColor) && Intrinsics.areEqual((Object) this.customOutputUri, (Object) cropImageOptions.customOutputUri) && this.outputCompressFormat == cropImageOptions.outputCompressFormat && this.outputCompressQuality == cropImageOptions.outputCompressQuality && this.outputRequestWidth == cropImageOptions.outputRequestWidth && this.outputRequestHeight == cropImageOptions.outputRequestHeight && this.outputRequestSizeOptions == cropImageOptions.outputRequestSizeOptions && this.noOutputImage == cropImageOptions.noOutputImage && Intrinsics.areEqual((Object) this.initialCropWindowRectangle, (Object) cropImageOptions.initialCropWindowRectangle) && this.initialRotation == cropImageOptions.initialRotation && this.allowRotation == cropImageOptions.allowRotation && this.allowFlipping == cropImageOptions.allowFlipping && this.allowCounterRotation == cropImageOptions.allowCounterRotation && this.rotationDegrees == cropImageOptions.rotationDegrees && this.flipHorizontally == cropImageOptions.flipHorizontally && this.flipVertically == cropImageOptions.flipVertically && Intrinsics.areEqual((Object) this.cropMenuCropButtonTitle, (Object) cropImageOptions.cropMenuCropButtonTitle) && this.cropMenuCropButtonIcon == cropImageOptions.cropMenuCropButtonIcon && this.skipEditing == cropImageOptions.skipEditing && this.showIntentChooser == cropImageOptions.showIntentChooser && Intrinsics.areEqual((Object) this.intentChooserTitle, (Object) cropImageOptions.intentChooserTitle) && Intrinsics.areEqual((Object) this.intentChooserPriorityList, (Object) cropImageOptions.intentChooserPriorityList) && Float.compare(this.cropperLabelTextSize, cropImageOptions.cropperLabelTextSize) == 0 && this.cropperLabelTextColor == cropImageOptions.cropperLabelTextColor && Intrinsics.areEqual((Object) this.cropperLabelText, (Object) cropImageOptions.cropperLabelText) && this.activityBackgroundColor == cropImageOptions.activityBackgroundColor && Intrinsics.areEqual((Object) this.toolbarColor, (Object) cropImageOptions.toolbarColor) && Intrinsics.areEqual((Object) this.toolbarTitleColor, (Object) cropImageOptions.toolbarTitleColor) && Intrinsics.areEqual((Object) this.toolbarBackButtonColor, (Object) cropImageOptions.toolbarBackButtonColor) && Intrinsics.areEqual((Object) this.toolbarTintColor, (Object) cropImageOptions.toolbarTintColor);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.imageSourceIncludeGallery) * 31) + Boolean.hashCode(this.imageSourceIncludeCamera)) * 31) + this.cropShape.hashCode()) * 31) + this.cornerShape.hashCode()) * 31) + Float.hashCode(this.cropCornerRadius)) * 31) + Float.hashCode(this.snapRadius)) * 31) + Float.hashCode(this.touchRadius)) * 31) + this.guidelines.hashCode()) * 31) + this.scaleType.hashCode()) * 31) + Boolean.hashCode(this.showCropOverlay)) * 31) + Boolean.hashCode(this.showCropLabel)) * 31) + Boolean.hashCode(this.showProgressBar)) * 31) + Integer.hashCode(this.progressBarColor)) * 31) + Boolean.hashCode(this.autoZoomEnabled)) * 31) + Boolean.hashCode(this.multiTouchEnabled)) * 31) + Boolean.hashCode(this.centerMoveEnabled)) * 31) + Boolean.hashCode(this.canChangeCropWindow)) * 31) + Integer.hashCode(this.maxZoom)) * 31) + Float.hashCode(this.initialCropWindowPaddingRatio)) * 31) + Boolean.hashCode(this.fixAspectRatio)) * 31) + Integer.hashCode(this.aspectRatioX)) * 31) + Integer.hashCode(this.aspectRatioY)) * 31) + Float.hashCode(this.borderLineThickness)) * 31) + Integer.hashCode(this.borderLineColor)) * 31) + Float.hashCode(this.borderCornerThickness)) * 31) + Float.hashCode(this.borderCornerOffset)) * 31) + Float.hashCode(this.borderCornerLength)) * 31) + Integer.hashCode(this.borderCornerColor)) * 31) + Integer.hashCode(this.circleCornerFillColorHexValue)) * 31) + Float.hashCode(this.guidelinesThickness)) * 31) + Integer.hashCode(this.guidelinesColor)) * 31) + Integer.hashCode(this.backgroundColor)) * 31) + Integer.hashCode(this.minCropWindowWidth)) * 31) + Integer.hashCode(this.minCropWindowHeight)) * 31) + Integer.hashCode(this.minCropResultWidth)) * 31) + Integer.hashCode(this.minCropResultHeight)) * 31) + Integer.hashCode(this.maxCropResultWidth)) * 31) + Integer.hashCode(this.maxCropResultHeight)) * 31) + this.activityTitle.hashCode()) * 31) + Integer.hashCode(this.activityMenuIconColor)) * 31;
        Integer num = this.activityMenuTextColor;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.customOutputUri;
        int hashCode3 = (((((((((((((hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31) + this.outputCompressFormat.hashCode()) * 31) + Integer.hashCode(this.outputCompressQuality)) * 31) + Integer.hashCode(this.outputRequestWidth)) * 31) + Integer.hashCode(this.outputRequestHeight)) * 31) + this.outputRequestSizeOptions.hashCode()) * 31) + Boolean.hashCode(this.noOutputImage)) * 31;
        Rect rect = this.initialCropWindowRectangle;
        int hashCode4 = (((((((((((((((hashCode3 + (rect == null ? 0 : rect.hashCode())) * 31) + Integer.hashCode(this.initialRotation)) * 31) + Boolean.hashCode(this.allowRotation)) * 31) + Boolean.hashCode(this.allowFlipping)) * 31) + Boolean.hashCode(this.allowCounterRotation)) * 31) + Integer.hashCode(this.rotationDegrees)) * 31) + Boolean.hashCode(this.flipHorizontally)) * 31) + Boolean.hashCode(this.flipVertically)) * 31;
        CharSequence charSequence = this.cropMenuCropButtonTitle;
        int hashCode5 = (((((((hashCode4 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Integer.hashCode(this.cropMenuCropButtonIcon)) * 31) + Boolean.hashCode(this.skipEditing)) * 31) + Boolean.hashCode(this.showIntentChooser)) * 31;
        String str = this.intentChooserTitle;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.intentChooserPriorityList;
        int hashCode7 = (((((hashCode6 + (list == null ? 0 : list.hashCode())) * 31) + Float.hashCode(this.cropperLabelTextSize)) * 31) + Integer.hashCode(this.cropperLabelTextColor)) * 31;
        String str2 = this.cropperLabelText;
        int hashCode8 = (((hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.activityBackgroundColor)) * 31;
        Integer num2 = this.toolbarColor;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.toolbarTitleColor;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.toolbarBackButtonColor;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.toolbarTintColor;
        if (num5 != null) {
            i = num5.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        boolean z = this.imageSourceIncludeGallery;
        boolean z2 = this.imageSourceIncludeCamera;
        CropImageView.CropShape cropShape2 = this.cropShape;
        CropImageView.CropCornerShape cropCornerShape = this.cornerShape;
        float f = this.cropCornerRadius;
        float f2 = this.snapRadius;
        float f3 = this.touchRadius;
        CropImageView.Guidelines guidelines2 = this.guidelines;
        CropImageView.ScaleType scaleType2 = this.scaleType;
        boolean z3 = this.showCropOverlay;
        boolean z4 = this.showCropLabel;
        boolean z5 = this.showProgressBar;
        int i = this.progressBarColor;
        boolean z6 = this.autoZoomEnabled;
        boolean z7 = this.multiTouchEnabled;
        boolean z8 = this.centerMoveEnabled;
        boolean z9 = this.canChangeCropWindow;
        int i2 = this.maxZoom;
        float f4 = this.initialCropWindowPaddingRatio;
        boolean z10 = this.fixAspectRatio;
        int i3 = this.aspectRatioX;
        int i4 = this.aspectRatioY;
        float f5 = this.borderLineThickness;
        int i5 = this.borderLineColor;
        float f6 = this.borderCornerThickness;
        float f7 = this.borderCornerOffset;
        float f8 = this.borderCornerLength;
        int i6 = this.borderCornerColor;
        int i7 = this.circleCornerFillColorHexValue;
        float f9 = this.guidelinesThickness;
        int i8 = this.guidelinesColor;
        int i9 = this.backgroundColor;
        int i10 = this.minCropWindowWidth;
        int i11 = this.minCropWindowHeight;
        int i12 = this.minCropResultWidth;
        int i13 = this.minCropResultHeight;
        int i14 = this.maxCropResultWidth;
        int i15 = this.maxCropResultHeight;
        CharSequence charSequence = this.activityTitle;
        int i16 = this.activityMenuIconColor;
        Integer num = this.activityMenuTextColor;
        Uri uri = this.customOutputUri;
        Bitmap.CompressFormat compressFormat = this.outputCompressFormat;
        int i17 = this.outputCompressQuality;
        int i18 = this.outputRequestWidth;
        int i19 = this.outputRequestHeight;
        CropImageView.RequestSizeOptions requestSizeOptions = this.outputRequestSizeOptions;
        boolean z11 = this.noOutputImage;
        Rect rect = this.initialCropWindowRectangle;
        int i20 = this.initialRotation;
        boolean z12 = this.allowRotation;
        boolean z13 = this.allowFlipping;
        boolean z14 = this.allowCounterRotation;
        int i21 = this.rotationDegrees;
        boolean z15 = this.flipHorizontally;
        boolean z16 = this.flipVertically;
        CharSequence charSequence2 = this.cropMenuCropButtonTitle;
        int i22 = this.cropMenuCropButtonIcon;
        boolean z17 = this.skipEditing;
        boolean z18 = this.showIntentChooser;
        String str = this.intentChooserTitle;
        List<String> list = this.intentChooserPriorityList;
        float f10 = this.cropperLabelTextSize;
        int i23 = this.cropperLabelTextColor;
        String str2 = this.cropperLabelText;
        int i24 = this.activityBackgroundColor;
        Integer num2 = this.toolbarColor;
        Integer num3 = this.toolbarTitleColor;
        return "CropImageOptions(imageSourceIncludeGallery=" + z + ", imageSourceIncludeCamera=" + z2 + ", cropShape=" + cropShape2 + ", cornerShape=" + cropCornerShape + ", cropCornerRadius=" + f + ", snapRadius=" + f2 + ", touchRadius=" + f3 + ", guidelines=" + guidelines2 + ", scaleType=" + scaleType2 + ", showCropOverlay=" + z3 + ", showCropLabel=" + z4 + ", showProgressBar=" + z5 + ", progressBarColor=" + i + ", autoZoomEnabled=" + z6 + ", multiTouchEnabled=" + z7 + ", centerMoveEnabled=" + z8 + ", canChangeCropWindow=" + z9 + ", maxZoom=" + i2 + ", initialCropWindowPaddingRatio=" + f4 + ", fixAspectRatio=" + z10 + ", aspectRatioX=" + i3 + ", aspectRatioY=" + i4 + ", borderLineThickness=" + f5 + ", borderLineColor=" + i5 + ", borderCornerThickness=" + f6 + ", borderCornerOffset=" + f7 + ", borderCornerLength=" + f8 + ", borderCornerColor=" + i6 + ", circleCornerFillColorHexValue=" + i7 + ", guidelinesThickness=" + f9 + ", guidelinesColor=" + i8 + ", backgroundColor=" + i9 + ", minCropWindowWidth=" + i10 + ", minCropWindowHeight=" + i11 + ", minCropResultWidth=" + i12 + ", minCropResultHeight=" + i13 + ", maxCropResultWidth=" + i14 + ", maxCropResultHeight=" + i15 + ", activityTitle=" + charSequence + ", activityMenuIconColor=" + i16 + ", activityMenuTextColor=" + num + ", customOutputUri=" + uri + ", outputCompressFormat=" + compressFormat + ", outputCompressQuality=" + i17 + ", outputRequestWidth=" + i18 + ", outputRequestHeight=" + i19 + ", outputRequestSizeOptions=" + requestSizeOptions + ", noOutputImage=" + z11 + ", initialCropWindowRectangle=" + rect + ", initialRotation=" + i20 + ", allowRotation=" + z12 + ", allowFlipping=" + z13 + ", allowCounterRotation=" + z14 + ", rotationDegrees=" + i21 + ", flipHorizontally=" + z15 + ", flipVertically=" + z16 + ", cropMenuCropButtonTitle=" + charSequence2 + ", cropMenuCropButtonIcon=" + i22 + ", skipEditing=" + z17 + ", showIntentChooser=" + z18 + ", intentChooserTitle=" + str + ", intentChooserPriorityList=" + list + ", cropperLabelTextSize=" + f10 + ", cropperLabelTextColor=" + i23 + ", cropperLabelText=" + str2 + ", activityBackgroundColor=" + i24 + ", toolbarColor=" + num2 + ", toolbarTitleColor=" + num3 + ", toolbarBackButtonColor=" + this.toolbarBackButtonColor + ", toolbarTintColor=" + this.toolbarTintColor + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(this.imageSourceIncludeGallery ? 1 : 0);
        parcel.writeInt(this.imageSourceIncludeCamera ? 1 : 0);
        parcel.writeString(this.cropShape.name());
        parcel.writeString(this.cornerShape.name());
        parcel.writeFloat(this.cropCornerRadius);
        parcel.writeFloat(this.snapRadius);
        parcel.writeFloat(this.touchRadius);
        parcel.writeString(this.guidelines.name());
        parcel.writeString(this.scaleType.name());
        parcel.writeInt(this.showCropOverlay ? 1 : 0);
        parcel.writeInt(this.showCropLabel ? 1 : 0);
        parcel.writeInt(this.showProgressBar ? 1 : 0);
        parcel.writeInt(this.progressBarColor);
        parcel.writeInt(this.autoZoomEnabled ? 1 : 0);
        parcel.writeInt(this.multiTouchEnabled ? 1 : 0);
        parcel.writeInt(this.centerMoveEnabled ? 1 : 0);
        parcel.writeInt(this.canChangeCropWindow ? 1 : 0);
        parcel.writeInt(this.maxZoom);
        parcel.writeFloat(this.initialCropWindowPaddingRatio);
        parcel.writeInt(this.fixAspectRatio ? 1 : 0);
        parcel.writeInt(this.aspectRatioX);
        parcel.writeInt(this.aspectRatioY);
        parcel.writeFloat(this.borderLineThickness);
        parcel.writeInt(this.borderLineColor);
        parcel.writeFloat(this.borderCornerThickness);
        parcel.writeFloat(this.borderCornerOffset);
        parcel.writeFloat(this.borderCornerLength);
        parcel.writeInt(this.borderCornerColor);
        parcel.writeInt(this.circleCornerFillColorHexValue);
        parcel.writeFloat(this.guidelinesThickness);
        parcel.writeInt(this.guidelinesColor);
        parcel.writeInt(this.backgroundColor);
        parcel.writeInt(this.minCropWindowWidth);
        parcel.writeInt(this.minCropWindowHeight);
        parcel.writeInt(this.minCropResultWidth);
        parcel.writeInt(this.minCropResultHeight);
        parcel.writeInt(this.maxCropResultWidth);
        parcel.writeInt(this.maxCropResultHeight);
        TextUtils.writeToParcel(this.activityTitle, parcel, i);
        parcel.writeInt(this.activityMenuIconColor);
        Integer num = this.activityMenuTextColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.customOutputUri, i);
        parcel.writeString(this.outputCompressFormat.name());
        parcel.writeInt(this.outputCompressQuality);
        parcel.writeInt(this.outputRequestWidth);
        parcel.writeInt(this.outputRequestHeight);
        parcel.writeString(this.outputRequestSizeOptions.name());
        parcel.writeInt(this.noOutputImage ? 1 : 0);
        parcel.writeParcelable(this.initialCropWindowRectangle, i);
        parcel.writeInt(this.initialRotation);
        parcel.writeInt(this.allowRotation ? 1 : 0);
        parcel.writeInt(this.allowFlipping ? 1 : 0);
        parcel.writeInt(this.allowCounterRotation ? 1 : 0);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeInt(this.flipHorizontally ? 1 : 0);
        parcel.writeInt(this.flipVertically ? 1 : 0);
        TextUtils.writeToParcel(this.cropMenuCropButtonTitle, parcel, i);
        parcel.writeInt(this.cropMenuCropButtonIcon);
        parcel.writeInt(this.skipEditing ? 1 : 0);
        parcel.writeInt(this.showIntentChooser ? 1 : 0);
        parcel.writeString(this.intentChooserTitle);
        parcel.writeStringList(this.intentChooserPriorityList);
        parcel.writeFloat(this.cropperLabelTextSize);
        parcel.writeInt(this.cropperLabelTextColor);
        parcel.writeString(this.cropperLabelText);
        parcel.writeInt(this.activityBackgroundColor);
        Integer num2 = this.toolbarColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.toolbarTitleColor;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.toolbarBackButtonColor;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.toolbarTintColor;
        if (num5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num5.intValue());
    }

    public CropImageOptions(boolean z, boolean z2, CropImageView.CropShape cropShape2, CropImageView.CropCornerShape cropCornerShape, float f, float f2, float f3, CropImageView.Guidelines guidelines2, CropImageView.ScaleType scaleType2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.RequestSizeOptions requestSizeOptions, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23, String str2, int i24, Integer num2, Integer num3, Integer num4, Integer num5) {
        CropImageView.CropShape cropShape3 = cropShape2;
        CropImageView.CropCornerShape cropCornerShape2 = cropCornerShape;
        CropImageView.Guidelines guidelines3 = guidelines2;
        CropImageView.ScaleType scaleType3 = scaleType2;
        float f11 = f9;
        int i25 = i11;
        int i26 = i12;
        int i27 = i13;
        int i28 = i14;
        int i29 = i15;
        CharSequence charSequence3 = charSequence;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        int i30 = i18;
        int i31 = i19;
        CropImageView.RequestSizeOptions requestSizeOptions2 = requestSizeOptions;
        Intrinsics.checkNotNullParameter(cropShape3, "cropShape");
        Intrinsics.checkNotNullParameter(cropCornerShape2, "cornerShape");
        Intrinsics.checkNotNullParameter(guidelines3, "guidelines");
        Intrinsics.checkNotNullParameter(scaleType3, "scaleType");
        Intrinsics.checkNotNullParameter(charSequence3, "activityTitle");
        Intrinsics.checkNotNullParameter(compressFormat2, "outputCompressFormat");
        Intrinsics.checkNotNullParameter(requestSizeOptions2, "outputRequestSizeOptions");
        this.imageSourceIncludeGallery = z;
        this.imageSourceIncludeCamera = z2;
        this.cropShape = cropShape3;
        this.cornerShape = cropCornerShape2;
        this.cropCornerRadius = f;
        this.snapRadius = f2;
        this.touchRadius = f3;
        this.guidelines = guidelines3;
        this.scaleType = scaleType3;
        this.showCropOverlay = z3;
        this.showCropLabel = z4;
        this.showProgressBar = z5;
        this.progressBarColor = i;
        this.autoZoomEnabled = z6;
        this.multiTouchEnabled = z7;
        this.centerMoveEnabled = z8;
        this.canChangeCropWindow = z9;
        this.maxZoom = i2;
        this.initialCropWindowPaddingRatio = f4;
        this.fixAspectRatio = z10;
        this.aspectRatioX = i3;
        this.aspectRatioY = i4;
        this.borderLineThickness = f5;
        this.borderLineColor = i5;
        this.borderCornerThickness = f6;
        this.borderCornerOffset = f7;
        this.borderCornerLength = f8;
        this.borderCornerColor = i6;
        this.circleCornerFillColorHexValue = i7;
        this.guidelinesThickness = f11;
        this.guidelinesColor = i8;
        this.backgroundColor = i9;
        this.minCropWindowWidth = i10;
        this.minCropWindowHeight = i25;
        this.minCropResultWidth = i26;
        this.minCropResultHeight = i27;
        this.maxCropResultWidth = i28;
        this.maxCropResultHeight = i29;
        this.activityTitle = charSequence3;
        this.activityMenuIconColor = i16;
        this.activityMenuTextColor = num;
        this.customOutputUri = uri;
        this.outputCompressFormat = compressFormat2;
        this.outputCompressQuality = i17;
        this.outputRequestWidth = i30;
        int i32 = i19;
        this.outputRequestHeight = i32;
        this.outputRequestSizeOptions = requestSizeOptions2;
        this.noOutputImage = z11;
        this.initialCropWindowRectangle = rect;
        this.initialRotation = i20;
        this.allowRotation = z12;
        this.allowFlipping = z13;
        this.allowCounterRotation = z14;
        int i33 = i21;
        this.rotationDegrees = i33;
        this.flipHorizontally = z15;
        this.flipVertically = z16;
        this.cropMenuCropButtonTitle = charSequence2;
        this.cropMenuCropButtonIcon = i22;
        this.skipEditing = z17;
        this.showIntentChooser = z18;
        this.intentChooserTitle = str;
        this.intentChooserPriorityList = list;
        this.cropperLabelTextSize = f10;
        this.cropperLabelTextColor = i23;
        this.cropperLabelText = str2;
        this.activityBackgroundColor = i24;
        this.toolbarColor = num2;
        this.toolbarTitleColor = num3;
        this.toolbarBackButtonColor = num4;
        this.toolbarTintColor = num5;
        boolean z19 = true;
        if (this.maxZoom >= 0) {
            if (this.touchRadius >= 0.0f) {
                float f12 = this.initialCropWindowPaddingRatio;
                if (f12 >= 0.0f && ((double) f12) < 0.5d) {
                    if (this.aspectRatioX > 0) {
                        if (this.aspectRatioY > 0) {
                            if (this.borderLineThickness >= 0.0f) {
                                if (this.borderCornerThickness >= 0.0f) {
                                    if (f11 >= 0.0f) {
                                        if (i25 >= 0) {
                                            if (i26 >= 0) {
                                                if (i27 >= 0) {
                                                    if (i28 >= i26) {
                                                        if (i29 >= i27) {
                                                            if (i30 >= 0) {
                                                                if (i32 >= 0) {
                                                                    if (!((i33 < 0 || i33 > 360) ? false : z19)) {
                                                                        throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360".toString());
                                                                    }
                                                                    return;
                                                                }
                                                                throw new IllegalArgumentException("Cannot set request height value to a number < 0 ".toString());
                                                            }
                                                            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ".toString());
                                                        }
                                                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height".toString());
                                                    }
                                                    throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width".toString());
                                                }
                                                throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ".toString());
                                            }
                                            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ".toString());
                                        }
                                        throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ".toString());
                                    }
                                    throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.".toString());
                                }
                                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.".toString());
                            }
                            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.".toString());
                        }
                        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.".toString());
                    }
                    throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.".toString());
                }
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5".toString());
            }
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ".toString());
        }
        throw new IllegalArgumentException("Cannot set max zoom to a number < 1".toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CropImageOptions(boolean r70, boolean r71, com.canhub.cropper.CropImageView.CropShape r72, com.canhub.cropper.CropImageView.CropCornerShape r73, float r74, float r75, float r76, com.canhub.cropper.CropImageView.Guidelines r77, com.canhub.cropper.CropImageView.ScaleType r78, boolean r79, boolean r80, boolean r81, int r82, boolean r83, boolean r84, boolean r85, boolean r86, int r87, float r88, boolean r89, int r90, int r91, float r92, int r93, float r94, float r95, float r96, int r97, int r98, float r99, int r100, int r101, int r102, int r103, int r104, int r105, int r106, int r107, java.lang.CharSequence r108, int r109, java.lang.Integer r110, android.net.Uri r111, android.graphics.Bitmap.CompressFormat r112, int r113, int r114, int r115, com.canhub.cropper.CropImageView.RequestSizeOptions r116, boolean r117, android.graphics.Rect r118, int r119, boolean r120, boolean r121, boolean r122, int r123, boolean r124, boolean r125, java.lang.CharSequence r126, int r127, boolean r128, boolean r129, java.lang.String r130, java.util.List r131, float r132, int r133, java.lang.String r134, int r135, java.lang.Integer r136, java.lang.Integer r137, java.lang.Integer r138, java.lang.Integer r139, int r140, int r141, int r142, kotlin.jvm.internal.DefaultConstructorMarker r143) {
        /*
            r69 = this;
            r0 = r140
            r1 = r141
            r2 = r0 & 1
            r3 = 1
            if (r2 == 0) goto L_0x000b
            r2 = r3
            goto L_0x000d
        L_0x000b:
            r2 = r70
        L_0x000d:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0013
            r4 = r3
            goto L_0x0015
        L_0x0013:
            r4 = r71
        L_0x0015:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001c
            com.canhub.cropper.CropImageView$CropShape r5 = com.canhub.cropper.CropImageView.CropShape.RECTANGLE
            goto L_0x001e
        L_0x001c:
            r5 = r72
        L_0x001e:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0025
            com.canhub.cropper.CropImageView$CropCornerShape r6 = com.canhub.cropper.CropImageView.CropCornerShape.RECTANGLE
            goto L_0x0027
        L_0x0025:
            r6 = r73
        L_0x0027:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x003a
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r8 = 1092616192(0x41200000, float:10.0)
            float r7 = android.util.TypedValue.applyDimension(r3, r8, r7)
            goto L_0x003c
        L_0x003a:
            r7 = r74
        L_0x003c:
            r8 = r0 & 32
            r9 = 1077936128(0x40400000, float:3.0)
            if (r8 == 0) goto L_0x004f
            android.content.res.Resources r8 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = android.util.TypedValue.applyDimension(r3, r9, r8)
            goto L_0x0051
        L_0x004f:
            r8 = r75
        L_0x0051:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0064
            android.content.res.Resources r10 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            r11 = 1103101952(0x41c00000, float:24.0)
            float r10 = android.util.TypedValue.applyDimension(r3, r11, r10)
            goto L_0x0066
        L_0x0064:
            r10 = r76
        L_0x0066:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x006d
            com.canhub.cropper.CropImageView$Guidelines r11 = com.canhub.cropper.CropImageView.Guidelines.ON
            goto L_0x006f
        L_0x006d:
            r11 = r77
        L_0x006f:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0076
            com.canhub.cropper.CropImageView$ScaleType r12 = com.canhub.cropper.CropImageView.ScaleType.FIT_CENTER
            goto L_0x0078
        L_0x0076:
            r12 = r78
        L_0x0078:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x007e
            r13 = r3
            goto L_0x0080
        L_0x007e:
            r13 = r79
        L_0x0080:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0086
            r14 = 0
            goto L_0x0088
        L_0x0086:
            r14 = r80
        L_0x0088:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x008e
            r15 = r3
            goto L_0x0090
        L_0x008e:
            r15 = r81
        L_0x0090:
            r3 = r0 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x009d
            r3 = 51
            r9 = 153(0x99, float:2.14E-43)
            int r3 = android.graphics.Color.rgb(r9, r3, r9)
            goto L_0x009f
        L_0x009d:
            r3 = r82
        L_0x009f:
            r9 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a7
        L_0x00a5:
            r9 = r83
        L_0x00a7:
            r16 = r9
            r9 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x00af
            r9 = 0
            goto L_0x00b1
        L_0x00af:
            r9 = r84
        L_0x00b1:
            r17 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r17
            if (r18 == 0) goto L_0x00bb
            r18 = 1
            goto L_0x00bd
        L_0x00bb:
            r18 = r85
        L_0x00bd:
            r19 = 65536(0x10000, float:9.18355E-41)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00c6
            r19 = 1
            goto L_0x00c8
        L_0x00c6:
            r19 = r86
        L_0x00c8:
            r20 = 131072(0x20000, float:1.83671E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00d1
            r20 = 4
            goto L_0x00d3
        L_0x00d1:
            r20 = r87
        L_0x00d3:
            r21 = 262144(0x40000, float:3.67342E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00dc
            r21 = 0
            goto L_0x00de
        L_0x00dc:
            r21 = r88
        L_0x00de:
            r22 = 524288(0x80000, float:7.34684E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00e7
            r22 = 0
            goto L_0x00e9
        L_0x00e7:
            r22 = r89
        L_0x00e9:
            r23 = 1048576(0x100000, float:1.469368E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00f2
            r23 = 1
            goto L_0x00f4
        L_0x00f2:
            r23 = r90
        L_0x00f4:
            r24 = 2097152(0x200000, float:2.938736E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00fd
            r24 = 1
            goto L_0x00ff
        L_0x00fd:
            r24 = r91
        L_0x00ff:
            r25 = 4194304(0x400000, float:5.877472E-39)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x011b
            android.content.res.Resources r25 = android.content.res.Resources.getSystem()
            r26 = r9
            android.util.DisplayMetrics r9 = r25.getDisplayMetrics()
            r25 = r3
            r27 = r15
            r3 = 1077936128(0x40400000, float:3.0)
            r15 = 1
            float r3 = android.util.TypedValue.applyDimension(r15, r3, r9)
            goto L_0x0123
        L_0x011b:
            r25 = r3
            r26 = r9
            r27 = r15
            r3 = r92
        L_0x0123:
            r9 = 8388608(0x800000, float:1.17549435E-38)
            r9 = r9 & r0
            r15 = 255(0xff, float:3.57E-43)
            if (r9 == 0) goto L_0x0131
            r9 = 170(0xaa, float:2.38E-43)
            int r9 = android.graphics.Color.argb(r9, r15, r15, r15)
            goto L_0x0133
        L_0x0131:
            r9 = r93
        L_0x0133:
            r28 = 16777216(0x1000000, float:2.3509887E-38)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x014d
            android.content.res.Resources r28 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r15 = r28.getDisplayMetrics()
            r28 = r9
            r9 = 1073741824(0x40000000, float:2.0)
            r29 = r3
            r3 = 1
            float r9 = android.util.TypedValue.applyDimension(r3, r9, r15)
            goto L_0x0154
        L_0x014d:
            r29 = r3
            r28 = r9
            r3 = 1
            r9 = r94
        L_0x0154:
            r15 = 33554432(0x2000000, float:9.403955E-38)
            r15 = r15 & r0
            if (r15 == 0) goto L_0x016a
            android.content.res.Resources r15 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            r30 = r9
            r9 = 1084227584(0x40a00000, float:5.0)
            float r9 = android.util.TypedValue.applyDimension(r3, r9, r15)
            goto L_0x016e
        L_0x016a:
            r30 = r9
            r9 = r95
        L_0x016e:
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            r15 = r15 & r0
            if (r15 == 0) goto L_0x0184
            android.content.res.Resources r15 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            r31 = r9
            r9 = 1096810496(0x41600000, float:14.0)
            float r9 = android.util.TypedValue.applyDimension(r3, r9, r15)
            goto L_0x0188
        L_0x0184:
            r31 = r9
            r9 = r96
        L_0x0188:
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x018f
            r3 = -1
            goto L_0x0191
        L_0x018f:
            r3 = r97
        L_0x0191:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x019a
            r32 = -1
            goto L_0x019c
        L_0x019a:
            r32 = r98
        L_0x019c:
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x01b6
            android.content.res.Resources r33 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r15 = r33.getDisplayMetrics()
            r33 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r34 = r9
            r9 = 1
            float r3 = android.util.TypedValue.applyDimension(r9, r3, r15)
            goto L_0x01bc
        L_0x01b6:
            r33 = r3
            r34 = r9
            r3 = r99
        L_0x01bc:
            r9 = 1073741824(0x40000000, float:2.0)
            r9 = r9 & r0
            if (r9 == 0) goto L_0x01ca
            r9 = 170(0xaa, float:2.38E-43)
            r15 = 255(0xff, float:3.57E-43)
            int r9 = android.graphics.Color.argb(r9, r15, r15, r15)
            goto L_0x01cc
        L_0x01ca:
            r9 = r100
        L_0x01cc:
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r15
            if (r0 == 0) goto L_0x01d9
            r0 = 119(0x77, float:1.67E-43)
            r15 = 0
            int r0 = android.graphics.Color.argb(r0, r15, r15, r15)
            goto L_0x01dc
        L_0x01d9:
            r15 = 0
            r0 = r101
        L_0x01dc:
            r35 = r1 & 1
            if (r35 == 0) goto L_0x01f5
            android.content.res.Resources r35 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r15 = r35.getDisplayMetrics()
            r140 = r0
            r0 = 1109917696(0x42280000, float:42.0)
            r35 = r9
            r9 = 1
            float r0 = android.util.TypedValue.applyDimension(r9, r0, r15)
            int r0 = (int) r0
            goto L_0x01fc
        L_0x01f5:
            r140 = r0
            r35 = r9
            r9 = 1
            r0 = r102
        L_0x01fc:
            r15 = r1 & 2
            if (r15 == 0) goto L_0x0212
            android.content.res.Resources r15 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            r143 = r0
            r0 = 1109917696(0x42280000, float:42.0)
            float r0 = android.util.TypedValue.applyDimension(r9, r0, r15)
            int r0 = (int) r0
            goto L_0x0216
        L_0x0212:
            r143 = r0
            r0 = r103
        L_0x0216:
            r15 = r1 & 4
            if (r15 == 0) goto L_0x021d
            r15 = 40
            goto L_0x021f
        L_0x021d:
            r15 = r104
        L_0x021f:
            r36 = r1 & 8
            if (r36 == 0) goto L_0x0226
            r36 = 40
            goto L_0x0228
        L_0x0226:
            r36 = r105
        L_0x0228:
            r37 = r1 & 16
            if (r37 == 0) goto L_0x0230
            r37 = 99999(0x1869f, float:1.40128E-40)
            goto L_0x0232
        L_0x0230:
            r37 = r106
        L_0x0232:
            r38 = r1 & 32
            if (r38 == 0) goto L_0x023a
            r38 = 99999(0x1869f, float:1.40128E-40)
            goto L_0x023c
        L_0x023a:
            r38 = r107
        L_0x023c:
            r39 = r1 & 64
            if (r39 == 0) goto L_0x0245
            java.lang.String r39 = ""
            java.lang.CharSequence r39 = (java.lang.CharSequence) r39
            goto L_0x0247
        L_0x0245:
            r39 = r108
        L_0x0247:
            r9 = r1 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x024d
            r9 = 0
            goto L_0x024f
        L_0x024d:
            r9 = r109
        L_0x024f:
            r40 = r9
            r9 = r1 & 256(0x100, float:3.59E-43)
            r41 = 0
            if (r9 == 0) goto L_0x025a
            r9 = r41
            goto L_0x025c
        L_0x025a:
            r9 = r110
        L_0x025c:
            r42 = r9
            r9 = r1 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x0265
            r9 = r41
            goto L_0x0267
        L_0x0265:
            r9 = r111
        L_0x0267:
            r43 = r9
            r9 = r1 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0270
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
            goto L_0x0272
        L_0x0270:
            r9 = r112
        L_0x0272:
            r44 = r9
            r9 = r1 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x027b
            r9 = 90
            goto L_0x027d
        L_0x027b:
            r9 = r113
        L_0x027d:
            r45 = r9
            r9 = r1 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0285
            r9 = 0
            goto L_0x0287
        L_0x0285:
            r9 = r114
        L_0x0287:
            r46 = r9
            r9 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x028f
            r9 = 0
            goto L_0x0291
        L_0x028f:
            r9 = r115
        L_0x0291:
            r47 = r9
            r9 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x029a
            com.canhub.cropper.CropImageView$RequestSizeOptions r9 = com.canhub.cropper.CropImageView.RequestSizeOptions.NONE
            goto L_0x029c
        L_0x029a:
            r9 = r116
        L_0x029c:
            r17 = r1 & r17
            if (r17 == 0) goto L_0x02a3
            r17 = 0
            goto L_0x02a5
        L_0x02a3:
            r17 = r117
        L_0x02a5:
            r48 = 65536(0x10000, float:9.18355E-41)
            r48 = r1 & r48
            if (r48 == 0) goto L_0x02ae
            r48 = r41
            goto L_0x02b0
        L_0x02ae:
            r48 = r118
        L_0x02b0:
            r49 = 131072(0x20000, float:1.83671E-40)
            r49 = r1 & r49
            if (r49 == 0) goto L_0x02b9
            r49 = -1
            goto L_0x02bb
        L_0x02b9:
            r49 = r119
        L_0x02bb:
            r50 = 262144(0x40000, float:3.67342E-40)
            r50 = r1 & r50
            if (r50 == 0) goto L_0x02c4
            r50 = 1
            goto L_0x02c6
        L_0x02c4:
            r50 = r120
        L_0x02c6:
            r51 = 524288(0x80000, float:7.34684E-40)
            r51 = r1 & r51
            if (r51 == 0) goto L_0x02cf
            r51 = 1
            goto L_0x02d1
        L_0x02cf:
            r51 = r121
        L_0x02d1:
            r52 = 1048576(0x100000, float:1.469368E-39)
            r52 = r1 & r52
            if (r52 == 0) goto L_0x02da
            r52 = 0
            goto L_0x02dc
        L_0x02da:
            r52 = r122
        L_0x02dc:
            r53 = 2097152(0x200000, float:2.938736E-39)
            r53 = r1 & r53
            if (r53 == 0) goto L_0x02e5
            r53 = 90
            goto L_0x02e7
        L_0x02e5:
            r53 = r123
        L_0x02e7:
            r54 = 4194304(0x400000, float:5.877472E-39)
            r54 = r1 & r54
            if (r54 == 0) goto L_0x02f0
            r54 = 0
            goto L_0x02f2
        L_0x02f0:
            r54 = r124
        L_0x02f2:
            r55 = 8388608(0x800000, float:1.17549435E-38)
            r55 = r1 & r55
            if (r55 == 0) goto L_0x02fb
            r55 = 0
            goto L_0x02fd
        L_0x02fb:
            r55 = r125
        L_0x02fd:
            r56 = 16777216(0x1000000, float:2.3509887E-38)
            r56 = r1 & r56
            if (r56 == 0) goto L_0x0306
            r56 = r41
            goto L_0x0308
        L_0x0306:
            r56 = r126
        L_0x0308:
            r57 = 33554432(0x2000000, float:9.403955E-38)
            r57 = r1 & r57
            if (r57 == 0) goto L_0x0311
            r57 = 0
            goto L_0x0313
        L_0x0311:
            r57 = r127
        L_0x0313:
            r58 = 67108864(0x4000000, float:1.5046328E-36)
            r58 = r1 & r58
            if (r58 == 0) goto L_0x031c
            r58 = 0
            goto L_0x031e
        L_0x031c:
            r58 = r128
        L_0x031e:
            r59 = 134217728(0x8000000, float:3.85186E-34)
            r59 = r1 & r59
            if (r59 == 0) goto L_0x0327
            r59 = 0
            goto L_0x0329
        L_0x0327:
            r59 = r129
        L_0x0329:
            r60 = 268435456(0x10000000, float:2.5243549E-29)
            r60 = r1 & r60
            if (r60 == 0) goto L_0x0332
            r60 = r41
            goto L_0x0334
        L_0x0332:
            r60 = r130
        L_0x0334:
            r61 = 536870912(0x20000000, float:1.0842022E-19)
            r61 = r1 & r61
            if (r61 == 0) goto L_0x033f
            java.util.List r61 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0341
        L_0x033f:
            r61 = r131
        L_0x0341:
            r62 = 1073741824(0x40000000, float:2.0)
            r62 = r1 & r62
            if (r62 == 0) goto L_0x035d
            android.content.res.Resources r62 = android.content.res.Resources.getSystem()
            r63 = r9
            android.util.DisplayMetrics r9 = r62.getDisplayMetrics()
            r62 = r15
            r15 = 2
            r64 = r0
            r0 = 1101004800(0x41a00000, float:20.0)
            float r0 = android.util.TypedValue.applyDimension(r15, r0, r9)
            goto L_0x0365
        L_0x035d:
            r64 = r0
            r63 = r9
            r62 = r15
            r0 = r132
        L_0x0365:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x036c
            r1 = -1
            goto L_0x036e
        L_0x036c:
            r1 = r133
        L_0x036e:
            r9 = r142 & 1
            if (r9 == 0) goto L_0x0375
            java.lang.String r9 = ""
            goto L_0x0377
        L_0x0375:
            r9 = r134
        L_0x0377:
            r15 = r142 & 2
            if (r15 == 0) goto L_0x037d
            r15 = -1
            goto L_0x037f
        L_0x037d:
            r15 = r135
        L_0x037f:
            r65 = r142 & 4
            if (r65 == 0) goto L_0x0386
            r65 = r41
            goto L_0x0388
        L_0x0386:
            r65 = r136
        L_0x0388:
            r66 = r142 & 8
            if (r66 == 0) goto L_0x038f
            r66 = r41
            goto L_0x0391
        L_0x038f:
            r66 = r137
        L_0x0391:
            r67 = r142 & 16
            if (r67 == 0) goto L_0x0398
            r67 = r41
            goto L_0x039a
        L_0x0398:
            r67 = r138
        L_0x039a:
            r68 = r142 & 32
            if (r68 == 0) goto L_0x039f
            goto L_0x03a1
        L_0x039f:
            r41 = r139
        L_0x03a1:
            r70 = r69
            r71 = r2
            r72 = r4
            r73 = r5
            r74 = r6
            r75 = r7
            r76 = r8
            r77 = r10
            r78 = r11
            r79 = r12
            r80 = r13
            r81 = r14
            r82 = r27
            r83 = r25
            r84 = r16
            r85 = r26
            r86 = r18
            r87 = r19
            r88 = r20
            r89 = r21
            r90 = r22
            r91 = r23
            r92 = r24
            r93 = r29
            r94 = r28
            r95 = r30
            r96 = r31
            r97 = r34
            r98 = r33
            r99 = r32
            r100 = r3
            r101 = r35
            r102 = r140
            r103 = r143
            r104 = r64
            r105 = r62
            r106 = r36
            r107 = r37
            r108 = r38
            r109 = r39
            r110 = r40
            r111 = r42
            r112 = r43
            r113 = r44
            r114 = r45
            r115 = r46
            r116 = r47
            r117 = r63
            r118 = r17
            r119 = r48
            r120 = r49
            r121 = r50
            r122 = r51
            r123 = r52
            r124 = r53
            r125 = r54
            r126 = r55
            r127 = r56
            r128 = r57
            r129 = r58
            r130 = r59
            r131 = r60
            r132 = r61
            r133 = r0
            r134 = r1
            r135 = r9
            r136 = r15
            r137 = r65
            r138 = r66
            r139 = r67
            r140 = r41
            r70.<init>(r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageOptions.<init>(boolean, boolean, com.canhub.cropper.CropImageView$CropShape, com.canhub.cropper.CropImageView$CropCornerShape, float, float, float, com.canhub.cropper.CropImageView$Guidelines, com.canhub.cropper.CropImageView$ScaleType, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, int, float, boolean, int, int, float, int, float, float, float, int, int, float, int, int, int, int, int, int, int, int, java.lang.CharSequence, int, java.lang.Integer, android.net.Uri, android.graphics.Bitmap$CompressFormat, int, int, int, com.canhub.cropper.CropImageView$RequestSizeOptions, boolean, android.graphics.Rect, int, boolean, boolean, boolean, int, boolean, boolean, java.lang.CharSequence, int, boolean, boolean, java.lang.String, java.util.List, float, int, java.lang.String, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
