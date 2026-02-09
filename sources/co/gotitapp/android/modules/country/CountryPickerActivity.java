package co.gotitapp.android.modules.country;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.gotitapp.android.R;
import in.myinnos.alphabetsindexfastscrollrecycler.IndexFastScrollRecyclerView;
import java.util.List;

public class CountryPickerActivity extends AppCompatActivity {
    public static final String BACK_BUTTON_ACCESSIBILITY_LABEL = "back";
    public static final String COUNTRY_PICKER_CODE_EXTRA = "code";
    public static final String COUNTRY_PICKER_DIAL_CODE_EXTRA = "dialCode";
    public static final String COUNTRY_PICKER_NAME_EXTRA = "name";
    public static final String COUNTRY_PICKER_TITLE_EXTRA = "title";
    /* access modifiers changed from: private */
    public List<CountryCode> countryCodes;
    private IndexFastScrollRecyclerView recyclerView;
    /* access modifiers changed from: private */
    public List<Integer> sessionPositions;
    /* access modifiers changed from: private */
    public String[] sessions;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_country_picker);
        configureActionBar();
        this.recyclerView = (IndexFastScrollRecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.recyclerView.getContext(), linearLayoutManager.getOrientation());
        dividerItemDecoration.setDrawable(getDrawable(R.drawable.item_country_picker_divider));
        this.recyclerView.addItemDecoration(dividerItemDecoration);
        loadData();
        this.recyclerView.setAdapter(new CountryCodeAdapter());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    private void configureActionBar() {
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayShowCustomEnabled(true);
        supportActionBar.setDisplayShowTitleEnabled(false);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setHomeActionContentDescription((CharSequence) BACK_BUTTON_ACCESSIBILITY_LABEL);
        supportActionBar.setCustomView((int) R.layout.custom_action_bar);
        ((TextView) supportActionBar.getCustomView().findViewById(R.id.title)).setText(getIntent().getExtras().getString("title"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
        if (r1 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        if (r1 == null) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadData() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.sessionPositions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.countryCodes = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.res.Resources r2 = r8.getResources()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r3 = 2131755010(0x7f100002, float:1.9140887E38)
            java.io.InputStream r1 = r2.openRawResource(r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r1, r4)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r2.beginArray()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r3 = 0
            r4 = r3
        L_0x0030:
            boolean r5 = r2.hasNext()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            if (r5 == 0) goto L_0x00a1
            r2.beginObject()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            co.gotitapp.android.modules.country.CountryCode r5 = new co.gotitapp.android.modules.country.CountryCode     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r5.<init>()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
        L_0x003e:
            boolean r6 = r2.hasNext()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            if (r6 == 0) goto L_0x0096
            java.lang.String r6 = r2.nextName()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            java.lang.String r7 = "name"
            boolean r7 = r7.equals(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            if (r7 == 0) goto L_0x0076
            java.lang.String r6 = r2.nextString()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r5.setName(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            char r6 = r6.charAt(r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            java.lang.String r6 = r6.toUpperCase()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            boolean r7 = r0.contains(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            if (r7 != 0) goto L_0x003e
            r0.add(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            java.util.List<java.lang.Integer> r6 = r8.sessionPositions     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r6.add(r7)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            goto L_0x003e
        L_0x0076:
            java.lang.String r7 = "dial_code"
            boolean r7 = r7.equals(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            if (r7 == 0) goto L_0x0086
            java.lang.String r6 = r2.nextString()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r5.setDialCode(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            goto L_0x003e
        L_0x0086:
            java.lang.String r7 = "code"
            boolean r6 = r7.equals(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            if (r6 == 0) goto L_0x003e
            java.lang.String r6 = r2.nextString()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r5.setCode(r6)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            goto L_0x003e
        L_0x0096:
            java.util.List<co.gotitapp.android.modules.country.CountryCode> r6 = r8.countryCodes     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r6.add(r5)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            r2.endObject()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            int r4 = r4 + 1
            goto L_0x0030
        L_0x00a1:
            r2.endArray()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
            if (r1 == 0) goto L_0x00b4
        L_0x00a6:
            r1.close()     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00b4
        L_0x00aa:
            r0 = move-exception
            if (r1 == 0) goto L_0x00b0
            r1.close()     // Catch:{ Exception -> 0x00b0 }
        L_0x00b0:
            throw r0
        L_0x00b1:
            if (r1 == 0) goto L_0x00b4
            goto L_0x00a6
        L_0x00b4:
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r8.sessions = r1
            r0.toArray(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.gotitapp.android.modules.country.CountryPickerActivity.loadData():void");
    }

    /* access modifiers changed from: private */
    public void selectCountryCode(CountryCode countryCode) {
        Intent intent = new Intent();
        intent.putExtra("name", countryCode.getName());
        intent.putExtra(COUNTRY_PICKER_DIAL_CODE_EXTRA, countryCode.getDialCode());
        intent.putExtra(COUNTRY_PICKER_CODE_EXTRA, countryCode.getCode());
        setResult(-1, intent);
        finish();
    }

    private class CountryCodeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private CountryCode countryCode;
        private TextView dialCodeTextView;
        private TextView nameTextView;

        public CountryCodeViewHolder(View view) {
            super(view);
            view.setOnClickListener(this);
            this.nameTextView = (TextView) view.findViewById(R.id.name_text_view);
            this.dialCodeTextView = (TextView) view.findViewById(R.id.dial_code_text_view);
        }

        public void setCountryCode(CountryCode countryCode2) {
            this.countryCode = countryCode2;
            this.nameTextView.setText(countryCode2.getName());
            this.dialCodeTextView.setText(countryCode2.getDisplayDialCode());
        }

        public void onClick(View view) {
            CountryPickerActivity.this.selectCountryCode(this.countryCode);
        }
    }

    private class CountryCodeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements SectionIndexer {
        public int getSectionForPosition(int i) {
            return 0;
        }

        public CountryCodeAdapter() {
        }

        public int getItemCount() {
            return CountryPickerActivity.this.countryCodes.size();
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new CountryCodeViewHolder(CountryPickerActivity.this.getLayoutInflater().inflate(R.layout.item_country_picker, viewGroup, false));
        }

        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ((CountryCodeViewHolder) viewHolder).setCountryCode((CountryCode) CountryPickerActivity.this.countryCodes.get(i));
        }

        public Object[] getSections() {
            return CountryPickerActivity.this.sessions;
        }

        public int getPositionForSection(int i) {
            return ((Integer) CountryPickerActivity.this.sessionPositions.get(i)).intValue();
        }
    }
}
