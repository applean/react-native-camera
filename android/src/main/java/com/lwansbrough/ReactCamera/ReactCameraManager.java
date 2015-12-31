package com.lwansbrough.ReactCamera;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.CatalystStylesDiffMap;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.views.image.ReactImageView;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.JavaScriptModule;

public class ReactCameraManager extends SimpleViewManager<ReactCameraView> {

  public static final String REACT_CLASS = "RCTCamera";

  // @ReactProp(ReactProp.Type.STRING)
  // public static final String PROP_SRC = "src";
  // @ReactProp(ReactProp.Type.NUMBER)
  // public static final String PROP_BORDER_RADIUS = "borderRadius";
  // @ReactProp(ReactProp.Type.STRING)
  // public static final String PROP_RESIZE_MODE = ViewProps.RESIZE_MODE;

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public ReactCameraView createViewInstance(ThemedReactContext context) {
    return new ReactCameraView(context);
  }
  
  // @Override
  // public void updateView(final ReactImageView view, final CatalystStylesDiffMap props) {
  //   super.updateView(view, props);

  //   if (props.hasKey(PROP_RESIZE_MODE)) {
  //     view.setScaleType(
  //       ImageResizeMode.toScaleType(props.getString(PROP_RESIZE_MODE)));
  //   }
  //   if (props.hasKey(PROP_SRC)) {
  //      view.setSource(props.getString(PROP_SRC));
  //   }
  //   if (props.hasKey(PROP_BORDER_RADIUS)) {
  //     view.setBorderRadius(props.getFloat(PROP_BORDER_RADIUS, 0.0f));
  //   }
  //   view.maybeUpdateView();
  // }
}
