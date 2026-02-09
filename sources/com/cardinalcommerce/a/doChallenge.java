package com.cardinalcommerce.a;

import com.cardinalcommerce.a.ChallengeNativeView;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.setCCAOnTouchListener;
import com.cardinalcommerce.a.setCCAText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public final class doChallenge implements Serializable {
    private int Cardinal;
    private boolean CardinalError;
    int cca_continue;
    private setId cleanup;
    private transient setVisibility configure;
    private final List<setOnTouchListener> getInstance;
    private Map<Integer, LinkedList<setId>> getSDKVersion;
    private Map<Integer, setId> getWarnings;
    private final int init;
    private Stack<setId> onCReqSuccess;
    private List<setId> onValidated;

    doChallenge(doChallenge dochallenge, byte[] bArr, byte[] bArr2, setCCAOnTouchListener setccaontouchlistener) {
        this.configure = dochallenge.configure;
        this.init = dochallenge.init;
        this.Cardinal = dochallenge.Cardinal;
        this.cleanup = dochallenge.cleanup;
        ArrayList arrayList = new ArrayList();
        this.onValidated = arrayList;
        arrayList.addAll(dochallenge.onValidated);
        this.getSDKVersion = dochallenge.getSDKVersion;
        Stack<setId> stack = new Stack<>();
        this.onCReqSuccess = stack;
        stack.addAll(dochallenge.onCReqSuccess);
        this.getInstance = dochallenge.getInstance;
        this.getWarnings = new TreeMap(dochallenge.getWarnings);
        this.cca_continue = dochallenge.cca_continue;
        Cardinal(bArr, bArr2, setccaontouchlistener);
        dochallenge.CardinalError = true;
    }

    private doChallenge(setVisibility setvisibility, int i, int i2) {
        this.configure = setvisibility;
        this.init = i;
        this.Cardinal = i2;
        if (i2 <= i && i2 >= 2) {
            int i3 = i - i2;
            if (i3 % 2 == 0) {
                this.onValidated = new ArrayList();
                this.getSDKVersion = new TreeMap();
                this.onCReqSuccess = new Stack<>();
                this.getInstance = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    this.getInstance.add(new setOnTouchListener(i4));
                }
                this.getWarnings = new TreeMap();
                this.cca_continue = 0;
                this.CardinalError = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    doChallenge(setFocusableInTouchMode setfocusableintouchmode, int i) {
        this(setfocusableintouchmode.getInstance, setfocusableintouchmode.cca_continue, setfocusableintouchmode.Cardinal);
        this.cca_continue = i;
        this.CardinalError = true;
    }

    doChallenge(setFocusableInTouchMode setfocusableintouchmode, byte[] bArr, byte[] bArr2, setCCAOnTouchListener setccaontouchlistener) {
        this(setfocusableintouchmode.getInstance, setfocusableintouchmode.cca_continue, setfocusableintouchmode.Cardinal);
        cca_continue(bArr, bArr2, setccaontouchlistener);
    }

    doChallenge(setFocusableInTouchMode setfocusableintouchmode, byte[] bArr, byte[] bArr2, setCCAOnTouchListener setccaontouchlistener, int i) {
        this(setfocusableintouchmode.getInstance, setfocusableintouchmode.cca_continue, setfocusableintouchmode.Cardinal);
        cca_continue(bArr, bArr2, setccaontouchlistener);
        while (this.cca_continue < i) {
            Cardinal(bArr, bArr2, setccaontouchlistener);
            this.CardinalError = false;
        }
    }

    public doChallenge(doChallenge dochallenge, IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
        this.configure = new setVisibility(new setCheckState(eCIESwithAESCBC));
        int i = dochallenge.init;
        this.init = i;
        this.Cardinal = dochallenge.Cardinal;
        this.cleanup = dochallenge.cleanup;
        ArrayList arrayList = new ArrayList();
        this.onValidated = arrayList;
        arrayList.addAll(dochallenge.onValidated);
        this.getSDKVersion = dochallenge.getSDKVersion;
        Stack<setId> stack = new Stack<>();
        this.onCReqSuccess = stack;
        stack.addAll(dochallenge.onCReqSuccess);
        List<setOnTouchListener> list = dochallenge.getInstance;
        this.getInstance = list;
        this.getWarnings = new TreeMap(dochallenge.getWarnings);
        int i2 = dochallenge.cca_continue;
        this.cca_continue = i2;
        this.CardinalError = dochallenge.CardinalError;
        if (this.onValidated == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.getSDKVersion == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.onCReqSuccess == null) {
            throw new IllegalStateException("stack == null");
        } else if (list != null) {
            long j = (long) i2;
            if (j >= 0) {
                if (!(j < (1 << i))) {
                    throw new IllegalStateException("index in BDS state out of bounds");
                }
                return;
            }
            throw new IllegalStateException("index must not be negative");
        } else {
            throw new IllegalStateException("treeHashInstances == null");
        }
    }

    private void cca_continue(byte[] bArr, byte[] bArr2, setCCAOnTouchListener setccaontouchlistener) {
        if (setccaontouchlistener != null) {
            setCCAText setccatext = new setCCAText((setCCAText.init) ((setCCAText.init) new setCCAText.init().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings), (byte) 0);
            setCCAText setccatext2 = setccatext;
            ChallengeNativeView challengeNativeView = new ChallengeNativeView((ChallengeNativeView.cca_continue) ((ChallengeNativeView.cca_continue) new ChallengeNativeView.cca_continue().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings), (byte) 0);
            ChallengeNativeView challengeNativeView2 = challengeNativeView;
            int i = 0;
            while (i < (1 << this.init)) {
                setCCAOnTouchListener.getInstance getinstance = (setCCAOnTouchListener.getInstance) ((setCCAOnTouchListener.getInstance) new setCCAOnTouchListener.getInstance().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings);
                getinstance.getInstance = i;
                getinstance.cca_continue = setccaontouchlistener.cca_continue;
                getinstance.configure = setccaontouchlistener.init;
                setCCAOnTouchListener setccaontouchlistener2 = new setCCAOnTouchListener((setCCAOnTouchListener.getInstance) getinstance.init(setccaontouchlistener.cleanup), (byte) 0);
                setCCAOnTouchListener setccaontouchlistener3 = setccaontouchlistener2;
                setVisibility setvisibility = this.configure;
                setvisibility.configure(setvisibility.getInstance(bArr2, setccaontouchlistener2), bArr);
                setElevation cca_continue2 = this.configure.cca_continue(setccaontouchlistener2);
                setCCAText.init init2 = (setCCAText.init) ((setCCAText.init) new setCCAText.init().cca_continue(setccatext.configure)).getInstance(setccatext.getWarnings);
                init2.init = i;
                init2.configure = setccatext.getInstance;
                init2.Cardinal = setccatext.init;
                setCCAText setccatext3 = new setCCAText((setCCAText.init) init2.init(setccatext.cleanup), (byte) 0);
                setCCAText setccatext4 = setccatext3;
                setId instance = setCCAElevation.getInstance(this.configure, cca_continue2, setccatext3);
                ChallengeNativeView.cca_continue cca_continue3 = (ChallengeNativeView.cca_continue) ((ChallengeNativeView.cca_continue) new ChallengeNativeView.cca_continue().cca_continue(challengeNativeView.configure)).getInstance(challengeNativeView.getWarnings);
                cca_continue3.cca_continue = i;
                challengeNativeView = new ChallengeNativeView((ChallengeNativeView.cca_continue) cca_continue3.init(challengeNativeView.cleanup), (byte) 0);
                ChallengeNativeView challengeNativeView3 = challengeNativeView;
                while (!this.onCReqSuccess.isEmpty() && this.onCReqSuccess.peek().cca_continue == instance.cca_continue) {
                    int i2 = i / (1 << instance.cca_continue);
                    if (i2 == 1) {
                        this.onValidated.add(instance.configure());
                    }
                    if (i2 == 3 && instance.cca_continue < this.init - this.Cardinal) {
                        setOnTouchListener setontouchlistener = this.getInstance.get(instance.cca_continue);
                        setId configure2 = instance.configure();
                        setontouchlistener.configure = configure2;
                        setontouchlistener.Cardinal = configure2.cca_continue;
                        if (setontouchlistener.Cardinal == setontouchlistener.getInstance) {
                            setontouchlistener.cleanup = true;
                        }
                    }
                    if (i2 >= 3 && (i2 & 1) == 1 && instance.cca_continue >= this.init - this.Cardinal && instance.cca_continue <= this.init - 2) {
                        if (this.getSDKVersion.get(Integer.valueOf(instance.cca_continue)) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(instance.configure());
                            this.getSDKVersion.put(Integer.valueOf(instance.cca_continue), linkedList);
                        } else {
                            this.getSDKVersion.get(Integer.valueOf(instance.cca_continue)).add(instance.configure());
                        }
                    }
                    ChallengeNativeView.cca_continue cca_continue4 = (ChallengeNativeView.cca_continue) ((ChallengeNativeView.cca_continue) new ChallengeNativeView.cca_continue().cca_continue(challengeNativeView.configure)).getInstance(challengeNativeView.getWarnings);
                    cca_continue4.init = challengeNativeView.cca_continue;
                    cca_continue4.cca_continue = (challengeNativeView.Cardinal - 1) / 2;
                    ChallengeNativeView challengeNativeView4 = new ChallengeNativeView((ChallengeNativeView.cca_continue) cca_continue4.init(challengeNativeView.cleanup), (byte) 0);
                    ChallengeNativeView challengeNativeView5 = challengeNativeView4;
                    setId instance2 = setCCAElevation.getInstance(this.configure, this.onCReqSuccess.pop(), instance, challengeNativeView4);
                    int i3 = instance2.cca_continue + 1;
                    byte[] bArr3 = instance2.Cardinal;
                    if (bArr3 != null) {
                        byte[] bArr4 = new byte[bArr3.length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        setId setid = new setId(i3, bArr4);
                        ChallengeNativeView.cca_continue cca_continue5 = (ChallengeNativeView.cca_continue) ((ChallengeNativeView.cca_continue) new ChallengeNativeView.cca_continue().cca_continue(challengeNativeView4.configure)).getInstance(challengeNativeView4.getWarnings);
                        cca_continue5.init = challengeNativeView4.cca_continue + 1;
                        cca_continue5.cca_continue = challengeNativeView4.Cardinal;
                        challengeNativeView = new ChallengeNativeView((ChallengeNativeView.cca_continue) cca_continue5.init(challengeNativeView4.cleanup), (byte) 0);
                        ChallengeNativeView challengeNativeView6 = challengeNativeView;
                        instance = setid;
                    } else {
                        throw new NullPointerException("in == null");
                    }
                }
                this.onCReqSuccess.push(instance);
                i++;
                setccaontouchlistener = setccaontouchlistener2;
                setccatext = setccatext3;
            }
            this.cleanup = this.onCReqSuccess.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void Cardinal(byte[] bArr, byte[] bArr2, setCCAOnTouchListener setccaontouchlistener) {
        Object obj;
        List<setId> list;
        if (setccaontouchlistener == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (!this.CardinalError) {
            int i = this.cca_continue;
            int i2 = this.init;
            if (i <= (1 << i2) - 2) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = 0;
                        break;
                    } else if (((i >> i3) & 1) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (((this.cca_continue >> (i3 + 1)) & 1) == 0 && i3 < this.init - 1) {
                    this.getWarnings.put(Integer.valueOf(i3), this.onValidated.get(i3).configure());
                }
                setCCAText setccatext = new setCCAText((setCCAText.init) ((setCCAText.init) new setCCAText.init().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings), (byte) 0);
                setCCAText setccatext2 = setccatext;
                ChallengeNativeView challengeNativeView = new ChallengeNativeView((ChallengeNativeView.cca_continue) ((ChallengeNativeView.cca_continue) new ChallengeNativeView.cca_continue().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings), (byte) 0);
                ChallengeNativeView challengeNativeView2 = challengeNativeView;
                if (i3 == 0) {
                    setCCAOnTouchListener.getInstance getinstance = (setCCAOnTouchListener.getInstance) ((setCCAOnTouchListener.getInstance) new setCCAOnTouchListener.getInstance().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings);
                    getinstance.getInstance = this.cca_continue;
                    getinstance.cca_continue = setccaontouchlistener.cca_continue;
                    getinstance.configure = setccaontouchlistener.init;
                    setCCAOnTouchListener setccaontouchlistener2 = new setCCAOnTouchListener((setCCAOnTouchListener.getInstance) getinstance.init(setccaontouchlistener.cleanup), (byte) 0);
                    setCCAOnTouchListener setccaontouchlistener3 = setccaontouchlistener2;
                    setVisibility setvisibility = this.configure;
                    setvisibility.configure(setvisibility.getInstance(bArr2, setccaontouchlistener2), bArr);
                    setElevation cca_continue2 = this.configure.cca_continue(setccaontouchlistener2);
                    setCCAText.init init2 = (setCCAText.init) ((setCCAText.init) new setCCAText.init().cca_continue(setccatext.configure)).getInstance(setccatext.getWarnings);
                    init2.init = this.cca_continue;
                    init2.configure = setccatext.getInstance;
                    init2.Cardinal = setccatext.init;
                    setCCAText setccatext3 = new setCCAText((setCCAText.init) init2.init(setccatext.cleanup), (byte) 0);
                    setCCAText setccatext4 = setccatext3;
                    this.onValidated.set(0, setCCAElevation.getInstance(this.configure, cca_continue2, setccatext3));
                    setccaontouchlistener = setccaontouchlistener2;
                } else {
                    ChallengeNativeView.cca_continue cca_continue3 = (ChallengeNativeView.cca_continue) ((ChallengeNativeView.cca_continue) new ChallengeNativeView.cca_continue().cca_continue(challengeNativeView.configure)).getInstance(challengeNativeView.getWarnings);
                    int i4 = i3 - 1;
                    cca_continue3.init = i4;
                    cca_continue3.cca_continue = this.cca_continue >> i3;
                    ChallengeNativeView challengeNativeView3 = new ChallengeNativeView((ChallengeNativeView.cca_continue) cca_continue3.init(challengeNativeView.cleanup), (byte) 0);
                    ChallengeNativeView challengeNativeView4 = challengeNativeView3;
                    setVisibility setvisibility2 = this.configure;
                    setvisibility2.configure(setvisibility2.getInstance(bArr2, setccaontouchlistener), bArr);
                    setId instance = setCCAElevation.getInstance(this.configure, this.onValidated.get(i4), this.getWarnings.get(Integer.valueOf(i4)), challengeNativeView3);
                    int i5 = instance.cca_continue + 1;
                    byte[] bArr3 = instance.Cardinal;
                    if (bArr3 != null) {
                        byte[] bArr4 = new byte[bArr3.length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        this.onValidated.set(i3, new setId(i5, bArr4));
                        this.getWarnings.remove(Integer.valueOf(i4));
                        for (int i6 = 0; i6 < i3; i6++) {
                            if (i6 < this.init - this.Cardinal) {
                                list = this.onValidated;
                                obj = this.getInstance.get(i6).Cardinal();
                            } else {
                                list = this.onValidated;
                                obj = this.getSDKVersion.get(Integer.valueOf(i6)).removeFirst();
                            }
                            list.set(i6, obj);
                        }
                        int min = Math.min(i3, this.init - this.Cardinal);
                        for (int i7 = 0; i7 < min; i7++) {
                            int i8 = this.cca_continue + 1 + ((1 << i7) * 3);
                            if (i8 < (1 << this.init)) {
                                setOnTouchListener setontouchlistener = this.getInstance.get(i7);
                                setontouchlistener.configure = null;
                                setontouchlistener.Cardinal = setontouchlistener.getInstance;
                                setontouchlistener.cca_continue = i8;
                                setontouchlistener.init = true;
                                setontouchlistener.cleanup = false;
                            }
                        }
                    } else {
                        throw new NullPointerException("in == null");
                    }
                }
                for (int i9 = 0; i9 < ((this.init - this.Cardinal) >> 1); i9++) {
                    setOnTouchListener Cardinal2 = Cardinal();
                    if (Cardinal2 != null) {
                        Cardinal2.getInstance(this.onCReqSuccess, this.configure, bArr, bArr2, setccaontouchlistener);
                    }
                }
                this.cca_continue++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        } else {
            throw new IllegalStateException("index already used");
        }
    }

    private setOnTouchListener Cardinal() {
        setOnTouchListener setontouchlistener = null;
        for (setOnTouchListener next : this.getInstance) {
            if (!next.cleanup && next.init) {
                if (setontouchlistener != null) {
                    int i = Integer.MAX_VALUE;
                    if (((!next.init || next.cleanup) ? Integer.MAX_VALUE : next.Cardinal) >= ((!setontouchlistener.init || setontouchlistener.cleanup) ? Integer.MAX_VALUE : setontouchlistener.Cardinal)) {
                        int i2 = (!next.init || next.cleanup) ? Integer.MAX_VALUE : next.Cardinal;
                        if (setontouchlistener.init && !setontouchlistener.cleanup) {
                            i = setontouchlistener.Cardinal;
                        }
                        if (i2 == i) {
                            if (next.cca_continue >= setontouchlistener.cca_continue) {
                            }
                        }
                    }
                }
                setontouchlistener = next;
            }
        }
        return setontouchlistener;
    }
}
