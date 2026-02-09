package com.chirag.RNMail;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.Html;
import androidx.core.content.FileProvider;
import androidx.core.net.MailTo;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

public class RNMailModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public String getName() {
        return "RNMail";
    }

    public RNMailModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private String[] readableArrayToStringArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = readableArray.getString(i);
        }
        return strArr;
    }

    @ReactMethod
    public void mail(ReadableMap readableMap, Callback callback) {
        int i;
        Uri uri;
        ReadableMap readableMap2 = readableMap;
        Callback callback2 = callback;
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setSelector(new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME)));
        if (readableMap2.hasKey("subject") && !readableMap2.isNull("subject")) {
            intent.putExtra("android.intent.extra.SUBJECT", readableMap2.getString("subject"));
        }
        if (readableMap2.hasKey(SDKConstants.PARAM_A2U_BODY) && !readableMap2.isNull(SDKConstants.PARAM_A2U_BODY)) {
            String string = readableMap2.getString(SDKConstants.PARAM_A2U_BODY);
            if (!readableMap2.hasKey("isHTML") || !readableMap2.getBoolean("isHTML")) {
                intent.putExtra("android.intent.extra.TEXT", string);
            } else {
                intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(string));
            }
        }
        if (readableMap2.hasKey("recipients") && !readableMap2.isNull("recipients")) {
            intent.putExtra("android.intent.extra.EMAIL", readableArrayToStringArray(readableMap2.getArray("recipients")));
        }
        if (readableMap2.hasKey("ccRecipients") && !readableMap2.isNull("ccRecipients")) {
            intent.putExtra("android.intent.extra.CC", readableArrayToStringArray(readableMap2.getArray("ccRecipients")));
        }
        if (readableMap2.hasKey("bccRecipients") && !readableMap2.isNull("bccRecipients")) {
            intent.putExtra("android.intent.extra.BCC", readableArrayToStringArray(readableMap2.getArray("bccRecipients")));
        }
        if (!readableMap2.hasKey("attachments") || readableMap2.isNull("attachments")) {
            i = 0;
        } else {
            ReadableArray array = readableMap2.getArray("attachments");
            int size = array.size();
            String str = this.reactContext.getApplicationContext().getPackageName() + ".rnmail.provider";
            List<ResolveInfo> queryIntentActivities = this.reactContext.getPackageManager().queryIntentActivities(intent, 65536);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                ReadableMap map = array.getMap(i2);
                if (map.hasKey(ClientCookie.PATH_ATTR) && !map.isNull(ClientCookie.PATH_ATTR)) {
                    uri = FileProvider.getUriForFile(this.reactContext, str, new File(map.getString(ClientCookie.PATH_ATTR)));
                } else if (!map.hasKey("uri") || map.isNull("uri")) {
                    callback2.invoke("not_found");
                    return;
                } else {
                    uri = Uri.parse(map.getString("uri"));
                }
                arrayList.add(uri);
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    this.reactContext.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
                }
            }
            i = 0;
            intent.addFlags(1);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        List<ResolveInfo> queryIntentActivities2 = this.reactContext.getPackageManager().queryIntentActivities(intent, i);
        if (queryIntentActivities2 == null || queryIntentActivities2.size() == 0) {
            callback2.invoke("not_available");
        } else if (queryIntentActivities2.size() == 1) {
            intent.addFlags(268435456);
            try {
                this.reactContext.startActivity(intent);
            } catch (Exception unused) {
                callback2.invoke("error");
            }
        } else {
            Intent createChooser = Intent.createChooser(intent, (!readableMap2.hasKey("customChooserTitle") || readableMap2.isNull("customChooserTitle")) ? "Send Mail" : readableMap2.getString("customChooserTitle"));
            createChooser.setFlags(268435456);
            try {
                this.reactContext.startActivity(createChooser);
            } catch (Exception unused2) {
                callback2.invoke("error");
            }
        }
    }
}
