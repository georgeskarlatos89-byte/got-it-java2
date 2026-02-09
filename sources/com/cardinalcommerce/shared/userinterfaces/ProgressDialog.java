package com.cardinalcommerce.shared.userinterfaces;

import android.app.Activity;
import android.app.Dialog;
import com.cardinalcommerce.cardinalmobilesdk.R;

public class ProgressDialog {
    private final Activity configure;
    /* access modifiers changed from: private */
    public final Dialog init;

    public ProgressDialog(Activity activity, String str) {
        this.configure = activity;
        Dialog dialog = new Dialog(activity);
        this.init = dialog;
        dialog.setContentView(R.layout.progress_view_2);
    }

    public void show() {
        this.configure.runOnUiThread(new Runnable() {
            public final void run() {
                ProgressDialog.this.init.show();
            }
        });
    }

    public void dismiss() {
        this.configure.runOnUiThread(new Runnable() {
            public final void run() {
                if (ProgressDialog.this.init != null && ProgressDialog.this.init.isShowing()) {
                    ProgressDialog.this.init.dismiss();
                }
            }
        });
    }

    public void cancel() {
        this.configure.runOnUiThread(new Runnable() {
            public final void run() {
                ProgressDialog.this.init.cancel();
            }
        });
    }
}
