package com.cardinalcommerce.dependencies.internal.bouncycastle.util.io.pem;

import com.cardinalcommerce.a.ProgressDialog;
import com.cardinalcommerce.a.show;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PemObject implements show {
    private static final List Cardinal = Collections.unmodifiableList(new ArrayList());
    public byte[] cca_continue;
    public String getInstance;
    public List init;

    public PemObject(String str, List list, byte[] bArr) {
        this.getInstance = str;
        this.init = Collections.unmodifiableList(list);
        this.cca_continue = bArr;
    }

    public PemObject(String str, byte[] bArr) {
        this(str, Cardinal, bArr);
    }

    public final PemObject Cardinal() throws ProgressDialog {
        return this;
    }
}
