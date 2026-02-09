package co.gotitapp.android.modules;

import co.gotitapp.android.modules.braintree.BraintreeModule;
import co.gotitapp.android.modules.country.CountryPickerModule;
import co.gotitapp.android.modules.exitApp.ExitAppModule;
import co.gotitapp.android.modules.hitView.HitViewManager;
import co.gotitapp.android.modules.photo.PhotoCropViewManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhotoStudyPackage implements ReactPackage {
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CountryPickerModule(reactApplicationContext));
        arrayList.add(new ExitAppModule(reactApplicationContext));
        arrayList.add(new BraintreeModule(reactApplicationContext));
        return arrayList;
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{new PhotoCropViewManager(reactApplicationContext), new HitViewManager()});
    }
}
