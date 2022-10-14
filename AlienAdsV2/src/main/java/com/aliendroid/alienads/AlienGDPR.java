package com.aliendroid.alienads;

import android.app.Activity;
import android.provider.Settings;

import androidx.annotation.Nullable;

import com.applovin.sdk.AppLovinPrivacySettings;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AlienGDPR {


    public static void loadGdpr(Activity activity, String selectAds, boolean childDirected) {
        switch (selectAds) {
            case "ADMOB":
                break;
            case "STARTAPP":
                break;
            case "IRON":
                break;
            case "APPLOVIN-M":
                /*
                AppLovinSdk.initializeSdk( activity, new AppLovinSdk.SdkInitializationListener() {
                    @Override
                    public void onSdkInitialized(final AppLovinSdkConfiguration configuration)
                    {
                        if ( configuration.getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES )
                        {
                            // Show user consent dialog
                        }
                        else if ( configuration.getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY )
                        {
                            // No need to show consent dialog, proceed with initialization
                        }
                        else
                        {
                            // Consent dialog state is unknown. Proceed with initialization, but check if the consent
                            // dialog should be shown on the next application initialization
                        }
                    }
                } );
                AppLovinPrivacySettings.setHasUserConsent( true, activity );

                 */
                AppLovinPrivacySettings.setIsAgeRestrictedUser( childDirected, activity );
                break;
            case "APPLOVIN-D":
                AppLovinPrivacySettings.setIsAgeRestrictedUser( childDirected, activity );
                //AppLovinPrivacySettings.setHasUserConsent( true, activity );
                break;
            case "ALIEN-M":
                break;

        }
    }

}
