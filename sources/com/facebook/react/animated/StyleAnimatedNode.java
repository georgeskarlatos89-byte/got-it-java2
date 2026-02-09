package com.facebook.react.animated;

import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

class StyleAnimatedNode extends AnimatedNode {
    private final NativeAnimatedNodesManager mNativeAnimatedNodesManager;
    private final Map<String, Integer> mPropMapping = new HashMap();

    StyleAnimatedNode(ReadableMap readableMap, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        ReadableMap map = readableMap.getMap(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.mPropMapping.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.mNativeAnimatedNodesManager = nativeAnimatedNodesManager;
    }

    public void collectViewUpdates(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry next : this.mPropMapping.entrySet()) {
            AnimatedNode nodeById = this.mNativeAnimatedNodesManager.getNodeById(((Integer) next.getValue()).intValue());
            if (nodeById == null) {
                throw new IllegalArgumentException("Mapped style node does not exists");
            } else if (nodeById instanceof TransformAnimatedNode) {
                ((TransformAnimatedNode) nodeById).collectViewUpdates(javaOnlyMap);
            } else if (nodeById instanceof ValueAnimatedNode) {
                ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                Object animatedObject = valueAnimatedNode.getAnimatedObject();
                if (animatedObject instanceof Integer) {
                    javaOnlyMap.putInt((String) next.getKey(), ((Integer) animatedObject).intValue());
                } else if (animatedObject instanceof String) {
                    javaOnlyMap.putString((String) next.getKey(), (String) animatedObject);
                } else {
                    javaOnlyMap.putDouble((String) next.getKey(), valueAnimatedNode.getValue());
                }
            } else if (nodeById instanceof ColorAnimatedNode) {
                javaOnlyMap.putInt((String) next.getKey(), ((ColorAnimatedNode) nodeById).getColor());
            } else {
                throw new IllegalArgumentException("Unsupported type of node used in property node " + nodeById.getClass());
            }
        }
    }

    public String prettyPrint() {
        StringBuilder append = new StringBuilder("StyleAnimatedNode[").append(this.mTag).append("] mPropMapping: ");
        Map<String, Integer> map = this.mPropMapping;
        return append.append(map != null ? map.toString() : ThreeDSStrings.NULL_STRING).toString();
    }
}
