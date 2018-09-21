package com.murugans.souce.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


/**
 * All Network Level utilities are defined here
 */

public class NetworkUtils {

    private NetworkUtils() {
        // This utility class is not publicly instantiable
    }

    /**
     * @param context Application Context
     * @return <code>true</code> if Connected, <code>false</code> if not connected
     */

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        assert cm != null;
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }




}
