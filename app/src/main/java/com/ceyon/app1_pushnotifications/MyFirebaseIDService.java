package com.ceyon.app1_pushnotifications;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by DELL on 12-04-2018.
 */

public class MyFirebaseIDService extends FirebaseInstanceIdService {

    private static String TAG = "INSTANCEID";

    @Override
    public void onTokenRefresh(){
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"Refreshed Token:"+refreshedToken);

        sendRegistrationToServer(refreshedToken);

    }
    private void sendRegistrationToServer(String token){

    }






}
