package com.twelve;

import android.view.View;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

public class NativeUI extends ViewManager {
    public NativeUI (Object ob1) {
    }

    @NonNull
    @Override
    public String getName() {
        return "NativeUI";
    }

    @Override
    public Class getShadowNodeClass() {
        return null;
    }

    @NonNull
    @Override
    protected View createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return null;
    }

    @Override
    public void updateExtraData(@NonNull View view, Object o) {

    }
}
