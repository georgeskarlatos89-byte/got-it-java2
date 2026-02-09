package com.braintreepayments.api;

import android.graphics.Color;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class NoticeOfCollectionHelper {
    private NoticeOfCollectionHelper() {
    }

    static void setNoticeOfCollectionText(TextView textView, String str) {
        textView.setText(Html.fromHtml(String.format("<a href=\"%s\">%s</a>", new Object[]{"https://www.paypal.com/us/legalhub/home", str}), 63));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(Integer.valueOf(Color.parseColor("#2489F6")).intValue());
    }
}
