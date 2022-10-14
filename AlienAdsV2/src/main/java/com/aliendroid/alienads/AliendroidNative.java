package com.aliendroid.alienads;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAdmob;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAlien;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesApplovinMax;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesFacebook;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesStartApp;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesAdmob;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesAlien;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesApplovinMax;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesFacebook;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesStartApp;
import com.aliendroid.sdkads.interfaces.OnLoadNative;
import com.aliendroid.sdkads.type.mediation.AlienMediationAds;
import com.aliendroid.sdkads.type.view.AlienViewAds;
import com.applovin.adview.AppLovinAdView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AliendroidNative {
    public static AppLovinAdView adViewDiscovery;
    private static MaxNativeAdLoader nativeAdLoader;
    private static MaxNativeAdView nativeAdView;
    private static MaxAd nativeAdMax;

    public static OnLoadSmallNativesAdmob onLoadSmallNativesAdmob;
    public static OnLoadSmallNativesApplovinMax onLoadSmallNativesApplovinMax;
    public static OnLoadSmallNativesFacebook onLoadSmallNativesFacebook;
    public static OnLoadSmallNativesStartApp onLoadSmallNativesStartApp;
    public static OnLoadSmallNativesAlien onLoadSmallNativesAlien;

    public static OnLoadMediumNativesAdmob onLoadMediumNativesAdmob;
    public static OnLoadMediumNativesApplovinMax onLoadMediumNativesApplovinMax;
    public static OnLoadMediumNativesFacebook onLoadMediumNativesFacebook;
    public static OnLoadMediumNativesStartApp onLoadMediumNativesStartApp;
    public static OnLoadMediumNativesAlien onLoadMediumNativesAlien;

    public static void SmallNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
    }

    public static void SmallNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

        MaxNativeAdViewBinder binder = new MaxNativeAdViewBinder.Builder(R.layout.max_small_native)
                .setTitleTextViewId(R.id.title_text_view)
                .setBodyTextViewId(R.id.body_text_view)
                .setAdvertiserTextViewId(R.id.advertiser_textView)
                .setIconImageViewId(R.id.icon_image_view)
                .setMediaContentViewGroupId(R.id.media_view_container)
                .setOptionsContentViewGroupId(R.id.ad_options_view)
                .setCallToActionButtonId(R.id.cta_button)
                .build();
        nativeAdView = new MaxNativeAdView(binder, activity);

        nativeAdLoader = new MaxNativeAdLoader(nativeId, activity);
        nativeAdLoader.setRevenueListener(new MaxAdRevenueListener() {
            @Override
            public void onAdRevenuePaid(MaxAd ad) {

            }
        });
        nativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
            @Override
            public void onNativeAdLoaded(final MaxNativeAdView nativeAdView, final MaxAd ad) {
                if (onLoadSmallNativesApplovinMax !=null){
                    onLoadSmallNativesApplovinMax.onNativeAdLoaded();
                }

                if (nativeAdMax != null) {
                    nativeAdLoader.destroy(nativeAdMax);
                }
                nativeAdMax = ad;
                layNative.removeAllViews();
                layNative.addView(nativeAdView);
            }

            @Override
            public void onNativeAdLoadFailed(final String adUnitId, final MaxError error) {
                if (onLoadSmallNativesApplovinMax !=null){
                    onLoadSmallNativesApplovinMax.onNativeAdLoadFailed("");
                }
            }

            @Override
            public void onNativeAdClicked(final MaxAd ad) {
                if (onLoadSmallNativesApplovinMax !=null){
                    onLoadSmallNativesApplovinMax.onNativeAdClicked();
                }
            }
        });

        nativeAdLoader.loadAd(nativeAdView);
    }


    public static void SmallNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void SmallNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

    }

    public static void MediumNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

        MaxNativeAdViewBinder binder = new MaxNativeAdViewBinder.Builder(R.layout.max_big_native)
                .setTitleTextViewId(R.id.title_text_view)
                .setBodyTextViewId(R.id.body_text_view)
                .setAdvertiserTextViewId(R.id.advertiser_textView)
                .setIconImageViewId(R.id.icon_image_view)
                .setMediaContentViewGroupId(R.id.media_view_container)
                .setOptionsContentViewGroupId(R.id.ad_options_view)
                .setCallToActionButtonId(R.id.cta_button)
                .build();
        nativeAdView = new MaxNativeAdView(binder, activity);

        nativeAdLoader = new MaxNativeAdLoader(nativeId, activity);
        nativeAdLoader.setRevenueListener(new MaxAdRevenueListener() {
            @Override
            public void onAdRevenuePaid(MaxAd ad) {

            }
        });
        nativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
            @Override
            public void onNativeAdLoaded(final MaxNativeAdView nativeAdView, final MaxAd ad) {
                if (onLoadMediumNativesApplovinMax!=null){
                    onLoadMediumNativesApplovinMax.onNativeAdLoaded();
                }
                if (nativeAdMax != null) {
                    nativeAdLoader.destroy(nativeAdMax);
                }
                nativeAdMax = ad;
                layNative.removeAllViews();
                layNative.addView(nativeAdView);
            }

            @Override
            public void onNativeAdLoadFailed(final String adUnitId, final MaxError error) {
                if (onLoadMediumNativesApplovinMax!=null){
                    onLoadMediumNativesApplovinMax.onNativeAdLoadFailed("");
                }
            }

            @Override
            public void onNativeAdClicked(final MaxAd ad) {
                if (onLoadMediumNativesApplovinMax!=null){
                    onLoadMediumNativesApplovinMax.onNativeAdClicked();
                }
            }
        });
        nativeAdLoader.loadAd(nativeAdView);

    }

    public static void MediumNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void SmallNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

}
