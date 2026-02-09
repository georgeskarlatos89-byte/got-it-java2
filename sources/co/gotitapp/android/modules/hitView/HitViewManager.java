package co.gotitapp.android.modules.hitView;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Map;

public class HitViewManager extends ReactViewManager {
    public static final String REACT_CLASS = "RCTHitView";

    public String getName() {
        return REACT_CLASS;
    }

    public ReactViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new HitView(themedReactContext);
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().put("onTouch", MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onHit"))).build();
    }
}
