package com.cardinalcommerce.a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class setTextBoxCustomization<T> extends setVerticalScrollbarThumbDrawable<T> {
    public static setVerticalScrollbarThumbDrawable<Integer[]> Cardinal = new setTextBoxCustomization<Integer[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List list = (List) obj;
            Integer[] numArr = new Integer[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Integer) {
                        numArr[i] = (Integer) next;
                    } else {
                        numArr[i] = Integer.valueOf(((Number) next).intValue());
                    }
                    i++;
                }
            }
            return numArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<boolean[]> CardinalEnvironment = new setTextBoxCustomization<boolean[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List<Boolean> list = (List) obj;
            boolean[] zArr = new boolean[list.size()];
            int i = 0;
            for (Boolean booleanValue : list) {
                zArr[i] = booleanValue.booleanValue();
                i++;
            }
            return zArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<double[]> CardinalError = new setTextBoxCustomization<double[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List<Number> list = (List) obj;
            double[] dArr = new double[list.size()];
            int i = 0;
            for (Number doubleValue : list) {
                dArr[i] = doubleValue.doubleValue();
                i++;
            }
            return dArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<Double[]> CardinalRenderType = new setTextBoxCustomization<Double[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List list = (List) obj;
            Double[] dArr = new Double[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Double) {
                        dArr[i] = (Double) next;
                    } else {
                        dArr[i] = Double.valueOf(((Number) next).doubleValue());
                    }
                    i++;
                }
            }
            return dArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<Byte[]> cca_continue = new setTextBoxCustomization<Byte[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List list = (List) obj;
            Byte[] bArr = new Byte[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Byte) {
                        bArr[i] = (Byte) next;
                    } else {
                        bArr[i] = Byte.valueOf(((Number) next).byteValue());
                    }
                    i++;
                }
            }
            return bArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<Float[]> cleanup = new setTextBoxCustomization<Float[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List list = (List) obj;
            Float[] fArr = new Float[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Float) {
                        fArr[i] = (Float) next;
                    } else {
                        fArr[i] = Float.valueOf(((Number) next).floatValue());
                    }
                    i++;
                }
            }
            return fArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<byte[]> configure = new setTextBoxCustomization<byte[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List<Number> list = (List) obj;
            byte[] bArr = new byte[list.size()];
            int i = 0;
            for (Number byteValue : list) {
                bArr[i] = byteValue.byteValue();
                i++;
            }
            return bArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<int[]> getInstance = new setTextBoxCustomization<int[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List<Number> list = (List) obj;
            int[] iArr = new int[list.size()];
            int i = 0;
            for (Number intValue : list) {
                iArr[i] = intValue.intValue();
                i++;
            }
            return iArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<Character[]> getSDKVersion = new setTextBoxCustomization<Character[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List list = (List) obj;
            Character[] chArr = new Character[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    chArr[i] = Character.valueOf(next.toString().charAt(0));
                    i++;
                }
            }
            return chArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<Long[]> getWarnings = new setTextBoxCustomization<Long[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List list = (List) obj;
            Long[] lArr = new Long[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Float) {
                        lArr[i] = (Long) next;
                    } else {
                        lArr[i] = Long.valueOf(((Number) next).longValue());
                    }
                    i++;
                }
            }
            return lArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<char[]> init = new setTextBoxCustomization<char[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List<Object> list = (List) obj;
            char[] cArr = new char[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                cArr[i] = obj2.toString().charAt(0);
                i++;
            }
            return cArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<float[]> onCReqSuccess = new setTextBoxCustomization<float[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List<Number> list = (List) obj;
            float[] fArr = new float[list.size()];
            int i = 0;
            for (Number floatValue : list) {
                fArr[i] = floatValue.floatValue();
                i++;
            }
            return fArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<long[]> onValidated = new setTextBoxCustomization<long[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List<Number> list = (List) obj;
            long[] jArr = new long[list.size()];
            int i = 0;
            for (Number intValue : list) {
                jArr[i] = (long) intValue.intValue();
                i++;
            }
            return jArr;
        }
    };
    public static setVerticalScrollbarThumbDrawable<Boolean[]> values = new setTextBoxCustomization<Boolean[]>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            List list = (List) obj;
            Boolean[] boolArr = new Boolean[list.size()];
            int i = 0;
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof Boolean) {
                        boolArr[i] = Boolean.valueOf(((Boolean) next).booleanValue());
                    } else if (next instanceof Number) {
                        boolArr[i] = Boolean.valueOf(((Number) next).intValue() != 0);
                    } else {
                        throw new RuntimeException(new StringBuilder("can not convert ").append(next).append(" toBoolean").toString());
                    }
                    i++;
                }
            }
            return boolArr;
        }
    };

    public T init(Object obj) {
        return obj;
    }

    public setTextBoxCustomization(setFadingEdgeLength setfadingedgelength) {
        super(setfadingedgelength);
    }

    public final Object cca_continue() {
        return new ArrayList();
    }

    public final void Cardinal(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    public static class cca_continue<T> extends setTextBoxCustomization<T> {
        private Class<?> CardinalActionCode;
        private setVerticalScrollbarThumbDrawable<?> CardinalChallengeObserver;

        public cca_continue(setFadingEdgeLength setfadingedgelength, Class<T> cls) {
            super(setfadingedgelength);
            this.CardinalActionCode = cls.getComponentType();
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [T, java.lang.Object[]] */
        public final T init(Object obj) {
            List<Object> list = (List) obj;
            ? r0 = (Object[]) Array.newInstance(this.CardinalActionCode, list.size());
            int i = 0;
            for (Object obj2 : list) {
                r0[i] = obj2;
                i++;
            }
            return r0;
        }

        public final setVerticalScrollbarThumbDrawable<?> configure(String str) {
            if (this.CardinalChallengeObserver == null) {
                this.CardinalChallengeObserver = this.valueOf.configure(this.CardinalActionCode);
            }
            return this.CardinalChallengeObserver;
        }

        public final setVerticalScrollbarThumbDrawable<?> init(String str) {
            if (this.CardinalChallengeObserver == null) {
                this.CardinalChallengeObserver = this.valueOf.configure(this.CardinalActionCode);
            }
            return this.CardinalChallengeObserver;
        }
    }

    static {
        new setTextBoxCustomization<short[]>((setFadingEdgeLength) null) {
            public final /* synthetic */ Object init(Object obj) {
                List<Number> list = (List) obj;
                short[] sArr = new short[list.size()];
                int i = 0;
                for (Number shortValue : list) {
                    sArr[i] = shortValue.shortValue();
                    i++;
                }
                return sArr;
            }
        };
        new setTextBoxCustomization<Short[]>((setFadingEdgeLength) null) {
            public final /* synthetic */ Object init(Object obj) {
                List list = (List) obj;
                Short[] shArr = new Short[list.size()];
                int i = 0;
                for (Object next : list) {
                    if (next != null) {
                        if (next instanceof Short) {
                            shArr[i] = (Short) next;
                        } else {
                            shArr[i] = Short.valueOf(((Number) next).shortValue());
                        }
                        i++;
                    }
                }
                return shArr;
            }
        };
    }
}
