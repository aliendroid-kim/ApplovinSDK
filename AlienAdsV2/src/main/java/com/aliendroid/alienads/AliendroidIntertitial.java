package com.aliendroid.alienads;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.aliendroid.alienads.interfaces.interstitial.admob.OnFullScreenContentCallbackAdmob;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialAdmob;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialAlienMediation;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialAlienView;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialApplovinDiscovery;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialApplovinMax;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialFacebook;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialGoogle;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialIronSource;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialStartApp;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialAdmob;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialAlienMediation;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialAlienView;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialApplovinDiscovery;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialApplovinMax;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialFacebook;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialGoogle;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialIronSource;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialStartApp;
import com.aliendroid.sdkads.interfaces.OnLoadInterstitialMediation;
import com.aliendroid.sdkads.interfaces.OnLoadInterstitialView;
import com.aliendroid.sdkads.interfaces.OnShowInterstitial;
import com.aliendroid.sdkads.interfaces.OnShowInterstitialView;
import com.aliendroid.sdkads.type.mediation.AlienMediationAds;
import com.aliendroid.sdkads.type.view.AlienViewAds;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;

public class AliendroidIntertitial {
    public static MaxInterstitialAd interstitialAd;
    public static int counter = 0;
    public static AppLovinInterstitialAdDialog interstitialAdlovin;
    public static AppLovinAd loadedAd;
    public static boolean irininter = false;
    public static boolean SHOW_ALIEN_VIEW=false;
    public static OnLoadInterstitialAdmob onLoadInterstitialAdmob;
    public static OnShowInterstitialAdmob onShowInterstitialAdmob;

    public static OnShowInterstitialGoogle onShowInterstitialGoogle;
    public static OnLoadInterstitialGoogle onLoadInterstitialGoogle;

    public static OnLoadInterstitialFacebook onLoadInterstitialFacebook;
    public static OnShowInterstitialFacebook onShowInterstitialFacebook;

    public static OnLoadInterstitialApplovinDiscovery onLoadInterstitialApplovinDiscovery;
    public static OnShowInterstitialApplovinDiscovery onShowInterstitialApplovinDiscovery;

    public static OnLoadInterstitialApplovinMax onLoadInterstitialApplovinMax;
    public static OnShowInterstitialApplovinMax onShowInterstitialApplovinMax;

    public static OnLoadInterstitialIronSource onLoadInterstitialIronSource;
    public static OnShowInterstitialIronSource onShowInterstitialIronSource;

    public static OnLoadInterstitialStartApp onLoadInterstitialStartApp;
    public static OnShowInterstitialStartApp onShowInterstitialStartApp;

    public static OnLoadInterstitialAlienMediation onLoadInterstitialAlienMediation;
    public static OnLoadInterstitialAlienView onLoadInterstitialAlienView;

    public static OnShowInterstitialAlienMediation onShowInterstitialAlienMediation;
    public static OnShowInterstitialAlienView onShowInterstitialAlienView;

    public static OnFullScreenContentCallbackAdmob onFullScreenContentCallbackAdmob;

    public static void LoadIntertitialUnity(Activity activity, String selectAds, String idIntertitial, String idBackupIntertitial) {

    }


    public static void LoadIntertitialAdmob(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup, String Hpk1,
                                            String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
    }

    public static void LoadIntertitialGoogleAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialFAN(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialApplovinDis(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup
    ) {

        Bundle interstitialExtras = new Bundle();
        interstitialExtras.putString("zone_id", idIntertitial);
        AppLovinSdk.getInstance(activity).getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, new AppLovinAdLoadListener() {
            @Override
            public void adReceived(AppLovinAd ad) {
                loadedAd = ad;
                if (onLoadInterstitialApplovinDiscovery != null) {
                    onLoadInterstitialApplovinDiscovery.adReceived();
                }
            }

            @Override
            public void failedToReceiveAd(int errorCode) {
                if (onLoadInterstitialApplovinDiscovery != null) {
                    onLoadInterstitialApplovinDiscovery.failedToReceiveAd("");
                }
            }
        });
        interstitialAdlovin = AppLovinInterstitialAd.create(AppLovinSdk.getInstance(activity), activity);

    }

    public static void LoadIntertitialApplovinDisHPK(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     String HPK1,
                                                     String HPK2, String HPK3, String HPK4, String HPK5
    ) {

        Bundle interstitialExtras = new Bundle();
        interstitialExtras.putString("zone_id", idIntertitial);
        AppLovinSdk.getInstance(activity).getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, new AppLovinAdLoadListener() {
            @Override
            public void adReceived(AppLovinAd ad) {
                loadedAd = ad;
                if (onLoadInterstitialApplovinDiscovery != null) {
                    onLoadInterstitialApplovinDiscovery.adReceived();
                }
            }

            @Override
            public void failedToReceiveAd(int errorCode) {
                if (onLoadInterstitialApplovinDiscovery != null) {
                    onLoadInterstitialApplovinDiscovery.failedToReceiveAd("");
                }
            }
        });
        interstitialAdlovin = AppLovinInterstitialAd.create(AppLovinSdk.getInstance(activity), activity);

    }

    public static void LoadIntertitialApplovinMax(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
        interstitialAd = new MaxInterstitialAd(idIntertitial, activity);
        interstitialAd.loadAd();

    }

    public static void LoadIntertitialIron(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialMopub(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialStartApp(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialAlienView(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialAlienMediation(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void ShowIntertitialAdmob(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval, String Hpk1,
                                            String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
    }

    public static void ShowIntertitialGoogleAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                int interval) {
    }

    public static void ShowIntertitialApplovinDis(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                  int interval) {
        if (counter >= interval) {
            if (interstitialAdlovin != null) {
                AppLovinAdDisplayListener listener = new AppLovinAdDisplayListener() {
                    @Override
                    public void adDisplayed(AppLovinAd ad) {
                        if (onShowInterstitialApplovinDiscovery != null) {
                            onShowInterstitialApplovinDiscovery.onAdSuccess();
                        }
                    }

                    @Override
                    public void adHidden(AppLovinAd ad) {
                        if (onShowInterstitialApplovinDiscovery != null) {
                            onShowInterstitialApplovinDiscovery.onAdFailedShow();
                        }
                        LoadIntertitialApplovinDis(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
                    }
                };
                interstitialAdlovin.setAdDisplayListener(listener);
                interstitialAdlovin.showAndRender(loadedAd);
                LoadIntertitialApplovinDis(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
            }
            counter = 0;
        } else {
            counter++;
        }

    }

    public static void ShowIntertitialApplovinDisHPK(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     int interval, String HPK1,
                                                     String HPK2, String HPK3, String HPK4, String HPK5) {
        if (counter >= interval) {
            if (interstitialAdlovin != null) {
                AppLovinAdDisplayListener listener = new AppLovinAdDisplayListener() {
                    @Override
                    public void adDisplayed(AppLovinAd ad) {
                        if (onShowInterstitialApplovinDiscovery != null) {
                            onShowInterstitialApplovinDiscovery.onAdSuccess();
                        }
                    }

                    @Override
                    public void adHidden(AppLovinAd ad) {
                        if (onShowInterstitialApplovinDiscovery != null) {
                            onShowInterstitialApplovinDiscovery.onAdFailedShow();
                        }
                        LoadIntertitialApplovinDisHPK(activity, selectAdsBackup, idIntertitial, idIntertitialBackup, HPK1,
                                HPK2, HPK3, HPK4, HPK5);
                    }
                };
                interstitialAdlovin.setAdDisplayListener(listener);
                interstitialAdlovin.showAndRender(loadedAd);
                LoadIntertitialApplovinDisHPK(activity, selectAdsBackup, idIntertitial, idIntertitialBackup, HPK1,
                        HPK2, HPK3, HPK4, HPK5);
            }

            counter = 0;
        } else {
            counter++;
        }

    }

    public static void ShowIntertitialApplovinMax(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                  int interval) {
        if (counter >= interval) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                LoadIntertitialApplovinMax(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
                if (onShowInterstitialApplovinMax != null) {
                    onShowInterstitialApplovinMax.onAdSuccess();
                }
            } else {
                if (onShowInterstitialApplovinMax != null) {
                    onShowInterstitialApplovinMax.onAdFailedShow();
                }
                interstitialAd.loadAd();
            }
            LoadIntertitialApplovinMax(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
            counter = 0;
        } else {
            counter++;
        }

    }

    public static void ShowIntertitialIron(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                           int interval) {
    }

    public static void ShowIntertitialMopub(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval) {
    }


    public static void ShowIntertitialSartApp(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                              int interval) {
    }


    public static void ShowIntertitialFAN(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                          int interval) {
    }

    public static void ShowIntertitialUnity(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval) {

    }

    public static void ShowIntertitialAlienView(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                int interval) {
    }

    public static void ShowIntertitialAlienMediation(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     int interval) {

    }
}
