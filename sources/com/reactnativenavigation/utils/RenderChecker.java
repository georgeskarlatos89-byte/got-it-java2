package com.reactnativenavigation.utils;

import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.Collection;

public class RenderChecker {
    public boolean areRendered(Collection<ViewController<?>> collection) {
        return CollectionUtils.reduce(collection, true, new RenderChecker$$ExternalSyntheticLambda0()).booleanValue();
    }
}
