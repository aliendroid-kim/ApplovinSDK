package com.aliendroid.alienads;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsAdmob;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsAlienView;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsApplovinDiscovery;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsApplovinMax;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsGoogle;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsIronSource;
import com.aliendroid.alienads.interfaces.rewards.load.OnLoadRewardsStartApp;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAdmob;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAlienMedition;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsAlienView;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsApplovinDiscovery;
import com.aliendroid.alienads.interfaces.rewards.show.OnShowRewardsGoogle;
import com.aliendroid.sdkads.interfaces.OnLoadRewardsMediation;
import com.aliendroid.sdkads.interfaces.OnLoadRewardsView;
import com.aliendroid.sdkads.interfaces.OnShowInterstitialView;
import com.aliendroid.sdkads.interfaces.OnShowRewards;
import com.aliendroid.sdkads.interfaces.OnShowRewardsView;
import com.aliendroid.sdkads.type.mediation.AlienMediationAds;
import com.aliendroid.sdkads.type.view.AlienViewAds;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinSdk;


import java.util.Map;

public class AliendroidReward {
    public static MaxRewardedAd rewardedAd;
    public static boolean unlockreward = false;
    public static AppLovinIncentivizedInterstitial incentivizedInterstitial;

    public static OnLoadRewardsAdmob onLoadRewardsAdmob;
    public static OnLoadRewardsStartApp onLoadRewardsStartApp;
    public static OnLoadRewardsGoogle onLoadRewardsGoogle;
    public static OnLoadRewardsApplovinDiscovery onLoadRewardsApplovinDiscovery;
    public static OnLoadRewardsApplovinMax onLoadRewardsApplovinMax;
    public static OnLoadRewardsIronSource onLoadRewardsIronSource;
    public static OnLoadRewardsMediation onLoadRewardsMediation;
    public static OnLoadRewardsAlienView onLoadRewardsAlienView;

    public static OnShowRewardsAdmob onShowRewardsAdmob;
    public static OnShowRewardsGoogle onShowRewardsGoogle;
    public static OnShowRewardsApplovinDiscovery onShowRewardsApplovinDiscovery;
    public static OnShowRewardsAlienMedition onShowRewardsAlienMedition;
    public static OnShowRewardsAlienView onShowRewardsAlienView;

    public static boolean SHOW_ALIEN_VIEW=false;
    public static void LoadRewardAdmob(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardAlienMediation(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardAlienView(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardUnity(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardGoogleAds(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }


    public static void LoadRewardApplovinMax(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
        try {
            rewardedAd = MaxRewardedAd.getInstance(idReward, activity);
            rewardedAd.loadAd();
            MaxRewardedAdListener maxRewardedAdListener = new MaxRewardedAdListener() {
                @Override
                public void onRewardedVideoStarted(MaxAd ad) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onRewardedVideoStarted();
                    }
                }

                @Override
                public void onRewardedVideoCompleted(MaxAd ad) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onRewardedVideoCompleted();
                    }
                    unlockreward = true;
                }

                @Override
                public void onUserRewarded(MaxAd ad, MaxReward reward) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onUserRewarded();
                    }
                }

                @Override
                public void onAdLoaded(MaxAd ad) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onAdLoaded();
                    }
                }

                @Override
                public void onAdDisplayed(MaxAd ad) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onAdDisplayed();
                    }
                }

                @Override
                public void onAdHidden(MaxAd ad) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onAdHidden();
                    }
                }

                @Override
                public void onAdClicked(MaxAd ad) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onAdClicked();
                    }
                }

                @Override
                public void onAdLoadFailed(String adUnitId, MaxError error) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onAdLoadFailed();
                    }
                }

                @Override
                public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                    if (onLoadRewardsApplovinMax!=null){
                        onLoadRewardsApplovinMax.onAdDisplayFailed();
                    }
                }
            };
            rewardedAd.setListener(maxRewardedAdListener);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void LoadRewardApplovinDis(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
        try {
            incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(idReward, AppLovinSdk.getInstance(activity));
            incentivizedInterstitial.preload(new AppLovinAdLoadListener() {
                @Override
                public void adReceived(AppLovinAd appLovinAd) {
                    if (onLoadRewardsApplovinDiscovery!=null){
                        onLoadRewardsApplovinDiscovery.adReceived();
                    }
                }

                @Override
                public void failedToReceiveAd(int errorCode) {
                    if (onLoadRewardsApplovinDiscovery!=null){
                        onLoadRewardsApplovinDiscovery.failedToReceiveAd("");
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void LoadRewardMopub(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardStartApp(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }


    public static void ShowRewardAdmob(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardGoogleAds(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardApplovinMax(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
        try {
            if (rewardedAd.isReady()) {
                rewardedAd.showAd();
                LoadRewardApplovinMax(activity, selecBackuptAds, idReward, idBackupReward);
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoadRewardApplovinMax(activity, selecBackuptAds, idReward, idBackupReward);
    }

    public static void ShowRewardApplovinDis(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
        try {
            if (incentivizedInterstitial != null) {
                incentivizedInterstitial.show(activity, new AppLovinAdRewardListener() {
                    @Override
                    public void userRewardVerified(AppLovinAd ad, Map<String, String> response) {
                        if (onShowRewardsApplovinDiscovery!=null){
                            onShowRewardsApplovinDiscovery.userRewardVerified();
                        }
                        unlockreward = true;
                    }

                    @Override
                    public void userOverQuota(AppLovinAd ad, Map<String, String> response) {
                        if (onShowRewardsApplovinDiscovery!=null){
                            onShowRewardsApplovinDiscovery.userOverQuota();
                        }
                    }

                    @Override
                    public void userRewardRejected(AppLovinAd ad, Map<String, String> response) {
                        if (onShowRewardsApplovinDiscovery!=null){
                            onShowRewardsApplovinDiscovery.userRewardRejected();
                        }
                    }

                    @Override
                    public void validationRequestFailed(AppLovinAd ad, int errorCode) {
                        if (onShowRewardsApplovinDiscovery!=null){
                            onShowRewardsApplovinDiscovery.validationRequestFailed();
                        }
                    }


                }, null, new AppLovinAdDisplayListener() {
                    @Override
                    public void adDisplayed(AppLovinAd appLovinAd) {

                    }

                    @Override
                    public void adHidden(AppLovinAd appLovinAd) {
                        incentivizedInterstitial.preload(null);
                    }
                });
                LoadRewardApplovinDis(activity, selecBackuptAds, idReward, idBackupReward);
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoadRewardApplovinDis(activity, selecBackuptAds, idReward, idBackupReward);
    }

    public static void ShowRewardMopub(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardUnity(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardStartApp(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardAlienView(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardAlienMediation(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }
}
