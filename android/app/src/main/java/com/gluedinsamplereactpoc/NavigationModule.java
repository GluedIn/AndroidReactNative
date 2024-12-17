package com.gluedinsamplereactpoc;

import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.app.usecase.constants.GluedInConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.gluedin.GluedInInitializer;
import com.gluedin.config.login.GluedInSDKCallBack;
import com.gluedin.config.login.GluedInSdkException;
import com.gluedin.domain.entities.config.ShareData;
import com.gluedin.domain.entities.feed.VideoInfo;
import com.gluedin.domain.entities.feed.ads.AdsRequestParams;
import com.gluedin.domain.entities.feed.ads.AdsType;

import java.util.Map;

import kotlin.Unit;

public class NavigationModule  extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;
    private Intent intent;

    private String API_KEY = "put_your_api_key";
    private String SECRET_KEY = "put_your_secret_key";

    NavigationModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @NonNull
    @Override
    public String getName() {
        return "NavigationModule";
    } //The name of the component when it is called in the RN code

    @ReactMethod
    public void navigateToNative(){
        ReactApplicationContext context = getReactApplicationContext();
        intent = new Intent(); //Intent of the screen or activity

        // SDK must be called in Main UI Thread
        context.runOnUiQueueThread(() -> {
            GluedInSDKCallBack callBack = new GluedInSDKCallBack() {

                @Nullable
                @Override
                public Fragment onAdsRequest(@NonNull AdsType adsType, @NonNull AdsRequestParams adsRequestParams) {
                    return null;
                }

                @Override
                public void onUserProfileClick(@NonNull String s) {

                }

                @Override
                public void onProductCTAClicked(@NonNull String s, int i) {

                }

                @Override
                public void onGluedInShareAction(@NonNull ShareData shareData) {

                }

                @Override
                public void onSdkExit() {

                }

                @Override
                public void onSdkLogout() {

                }

                @Override
                public void onLoginRegistrationRequired(@Nullable VideoInfo videoInfo, boolean b) {

                }

                @Override
                public void onAppAuthSuccess(boolean b, @Nullable GluedInSdkException e) {

                }

                @Override
                public void onSdkInitSuccess(boolean b, @Nullable GluedInSdkException e) {

                }
            };

            GluedInInitializer.Configurations gluedInConfigurations = new GluedInInitializer.Configurations.Builder()
                    .setLogEnabled(true, Log.DEBUG)
                    .setApiKey(API_KEY)
                    .setSecretKey(SECRET_KEY)
                    .setSdkCallback(callBack)
                    .setHttpLogEnabled(true, 3)
                    .setFeedType(GluedInInitializer.Configurations.FeedType.VERTICAL)
                    .create();
            gluedInConfigurations.validateAndLaunchGluedInSDK(
                    context,
                    GluedInConstants.LaunchType.APP,
                    intent
            );
        });
    }

    @ReactMethod
    public void navigateToNativeArabic(){
        ReactApplicationContext context = getReactApplicationContext();
        intent = new Intent(); //Intent of the screen or activity

        // SDK must be called in Main UI Thread
        context.runOnUiQueueThread(() -> {
            GluedInSDKCallBack callBack = new GluedInSDKCallBack() {

                @Nullable
                @Override
                public Fragment onAdsRequest(@NonNull AdsType adsType, @NonNull AdsRequestParams adsRequestParams) {
                    return null;
                }

                @Override
                public void onUserProfileClick(@NonNull String s) {

                }

                @Override
                public void onProductCTAClicked(@NonNull String s, int i) {

                }

                @Override
                public void onGluedInShareAction(@NonNull ShareData shareData) {

                }

                @Override
                public void onSdkExit() {

                }

                @Override
                public void onSdkLogout() {

                }

                @Override
                public void onLoginRegistrationRequired(@Nullable VideoInfo videoInfo, boolean b) {

                }

                @Override
                public void onAppAuthSuccess(boolean b, @Nullable GluedInSdkException e) {

                }

                @Override
                public void onSdkInitSuccess(boolean b, @Nullable GluedInSdkException e) {

                }
            };

            GluedInInitializer.Configurations gluedInConfigurations = new GluedInInitializer.Configurations.Builder()
                    .setLogEnabled(true, Log.DEBUG)
                    .setApiKey(API_KEY)
                    .setSecretKey(SECRET_KEY)
                    .setSdkCallback(callBack)
                    .setHttpLogEnabled(true, 3)
                    .setFeedType(GluedInInitializer.Configurations.FeedType.VERTICAL)
                    .setPreferredLanguage("ar")
                    .create();
            gluedInConfigurations.validateAndLaunchGluedInSDK(
                    context,
                    GluedInConstants.LaunchType.APP,
                    intent
            );
        });
    }
}
