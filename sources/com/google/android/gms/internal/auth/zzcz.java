package com.google.android.gms.internal.auth;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public abstract class zzcz<T> {
    private static final Object zza = new Object();
    public static final /* synthetic */ int zzd = 0;
    @Nullable
    private static volatile zzcy zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference<Collection<zzcz<?>>> zzg = new AtomicReference<>();
    private static final zzdb zzh = new zzdb(zzcr.zza, (byte[]) null);
    private static final AtomicInteger zzi = new AtomicInteger();
    final zzcx zzb;
    final String zzc;
    private final T zzj;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;

    /* synthetic */ zzcz(zzcx zzcx, String str, Object obj, boolean z, zzct zzct) {
        if (zzcx.zzb != null) {
            this.zzb = zzcx;
            this.zzc = str;
            this.zzj = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    static void zzd() {
        zzi.incrementAndGet();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void zze(android.content.Context r3) {
        /*
            com.google.android.gms.internal.auth.zzcy r0 = zze
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = zza
            monitor-enter(r0)
            com.google.android.gms.internal.auth.zzcy r1 = zze     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.auth.zzcy r1 = zze     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.zza()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.google.android.gms.internal.auth.zzcg.zzd()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzda.zzc()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzcn.zze()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzcs r1 = new com.google.android.gms.internal.auth.zzcs     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzdg r1 = com.google.android.gms.internal.auth.zzdk.zza(r1)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzcd r2 = new com.google.android.gms.internal.auth.zzcd     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            zze = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = zzi     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.zze(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public abstract T zza(Object obj);

    public final String zzc() {
        String str = this.zzb.zzd;
        return this.zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T zzb() {
        /*
            r7 = this;
            boolean r0 = r7.zzm
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r7.zzc
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = zzi
            int r0 = r0.get()
            int r1 = r7.zzk
            if (r1 >= r0) goto L_0x0127
            monitor-enter(r7)
            int r1 = r7.zzk     // Catch:{ all -> 0x0124 }
            if (r1 >= r0) goto L_0x0122
            com.google.android.gms.internal.auth.zzcy r1 = zze     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x011c
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0124 }
            boolean r3 = r2.zzf     // Catch:{ all -> 0x0124 }
            boolean r2 = r2.zzg     // Catch:{ all -> 0x0124 }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzcn r2 = com.google.android.gms.internal.auth.zzcn.zza(r2)     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.zzb(r3)     // Catch:{ all -> 0x0124 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            java.util.regex.Pattern r4 = com.google.android.gms.internal.auth.zzcb.zzc     // Catch:{ all -> 0x0124 }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x0124 }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x0074
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x0072
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.zzc()     // Catch:{ all -> 0x0124 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0124 }
            int r6 = r5.length()     // Catch:{ all -> 0x0124 }
            if (r6 == 0) goto L_0x0069
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0124 }
            goto L_0x006f
        L_0x0069:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0124 }
            r5.<init>(r4)     // Catch:{ all -> 0x0124 }
            r4 = r5
        L_0x006f:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0124 }
        L_0x0072:
            r2 = r3
            goto L_0x00bb
        L_0x0074:
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0124 }
            android.net.Uri r2 = r2.zzb     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x009f
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzcx r4 = r7.zzb     // Catch:{ all -> 0x0124 }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x0124 }
            boolean r2 = com.google.android.gms.internal.auth.zzcp.zza(r2, r4)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x009d
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0124 }
            boolean r2 = r2.zzh     // Catch:{ all -> 0x0124 }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0124 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzcx r4 = r7.zzb     // Catch:{ all -> 0x0124 }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzcg r2 = com.google.android.gms.internal.auth.zzcg.zza(r2, r4)     // Catch:{ all -> 0x0124 }
            goto L_0x00ab
        L_0x009d:
            r2 = r3
            goto L_0x00ab
        L_0x009f:
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzcx r4 = r7.zzb     // Catch:{ all -> 0x0124 }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzda r2 = com.google.android.gms.internal.auth.zzda.zza(r2, r3)     // Catch:{ all -> 0x0124 }
        L_0x00ab:
            if (r2 == 0) goto L_0x0072
            java.lang.String r4 = r7.zzc()     // Catch:{ all -> 0x0124 }
            java.lang.Object r2 = r2.zzb(r4)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x0072
            java.lang.Object r2 = r7.zza(r2)     // Catch:{ all -> 0x0124 }
        L_0x00bb:
            if (r2 == 0) goto L_0x00be
            goto L_0x00ea
        L_0x00be:
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0124 }
            boolean r4 = r2.zze     // Catch:{ all -> 0x0124 }
            if (r4 != 0) goto L_0x00e5
            com.google.android.gms.internal.auth.zzdd<android.content.Context, java.lang.Boolean> r2 = r2.zzi     // Catch:{ all -> 0x0124 }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzcn r2 = com.google.android.gms.internal.auth.zzcn.zza(r2)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzcx r4 = r7.zzb     // Catch:{ all -> 0x0124 }
            boolean r5 = r4.zze     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x00d6
            r4 = r3
            goto L_0x00da
        L_0x00d6:
            java.lang.String r4 = r4.zzc     // Catch:{ all -> 0x0124 }
            java.lang.String r4 = r7.zzc     // Catch:{ all -> 0x0124 }
        L_0x00da:
            java.lang.String r2 = r2.zzb(r4)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00e5
            java.lang.Object r2 = r7.zza(r2)     // Catch:{ all -> 0x0124 }
            goto L_0x00e6
        L_0x00e5:
            r2 = r3
        L_0x00e6:
            if (r2 != 0) goto L_0x00ea
            T r2 = r7.zzj     // Catch:{ all -> 0x0124 }
        L_0x00ea:
            com.google.android.gms.internal.auth.zzdg r1 = r1.zzb()     // Catch:{ all -> 0x0124 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzde r1 = (com.google.android.gms.internal.auth.zzde) r1     // Catch:{ all -> 0x0124 }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x0117
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzco r1 = (com.google.android.gms.internal.auth.zzco) r1     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0124 }
            android.net.Uri r4 = r2.zzb     // Catch:{ all -> 0x0124 }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = r2.zzd     // Catch:{ all -> 0x0124 }
            java.lang.String r5 = r7.zzc     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r1.zza(r4, r3, r2, r5)     // Catch:{ all -> 0x0124 }
            if (r1 != 0) goto L_0x0113
            T r2 = r7.zzj     // Catch:{ all -> 0x0124 }
            goto L_0x0117
        L_0x0113:
            java.lang.Object r2 = r7.zza(r1)     // Catch:{ all -> 0x0124 }
        L_0x0117:
            r7.zzl = r2     // Catch:{ all -> 0x0124 }
            r7.zzk = r0     // Catch:{ all -> 0x0124 }
            goto L_0x0122
        L_0x011c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0124 }
            r0.<init>(r2)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x0122:
            monitor-exit(r7)     // Catch:{ all -> 0x0124 }
            goto L_0x0127
        L_0x0124:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0124 }
            throw r0
        L_0x0127:
            T r0 = r7.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.zzb():java.lang.Object");
    }
}
