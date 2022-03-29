package com.aliendroid.alienads;

import android.app.Activity;

import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AlienGDPR {
    public static ConsentInformation consentInformation;
    public static ConsentDebugSettings debugSettings;
    public static ConsentRequestParameters params;
    public static void loadGdpr(Activity activity, String selectAds, boolean childDirected) {

    }

    public static void loadForm(Activity activity) {

    }

    public static final String md5(final String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = MessageDigest
                    .getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                String h = Integer.toHexString(0xFF & messageDigest[i]);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            //Logger.logStackTrace(TAG,e);
        }
        return "";
    }


}
