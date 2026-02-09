package com.braintreepayments.api;

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/GraphQLQueryHelper;", "", "()V", "getQuery", "", "context", "Landroid/content/Context;", "queryResource", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: GraphQLQueryHelper.kt */
public final class GraphQLQueryHelper {
    public static final GraphQLQueryHelper INSTANCE = new GraphQLQueryHelper();

    private GraphQLQueryHelper() {
    }

    @JvmStatic
    public static final String getQuery(Context context, int i) throws Resources.NotFoundException, IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().openRawResource(i);
            return StreamHelper.getString(inputStream);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
