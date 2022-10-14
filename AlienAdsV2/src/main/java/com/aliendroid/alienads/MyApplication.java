package com.aliendroid.alienads;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LifecycleObserver;

import com.aliendroid.sdkads.config.InitializeAlienAds;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryPerformance;


public class MyApplication extends Application {
    private static AlienOpenAds alienOpenAds;
    private static InitializeAlienAds sdkads;
    //Uranus
    @Override
    public void onCreate() {
        super.onCreate();
        AppLovinSdk.getInstance(MyApplication.this).setMediationProvider(AppLovinMediationProvider.MAX);
        AppLovinSdk.getInstance(MyApplication.this).initializeSdk(config -> {

        });

        new FlurryAgent.Builder()
                .withDataSaleOptOut(false)
                .withCaptureUncaughtExceptions(true)
                .withIncludeBackgroundSessionsInMetrics(true)
                .withLogLevel(Log.VERBOSE)
                .withPerformanceMetrics(FlurryPerformance.ALL)
                .build(this, "FDHBT868XRXTHVJFD322");

        sdkads = new InitializeAlienAds(this);
        alienOpenAds = new AlienOpenAds(this);


    }

}