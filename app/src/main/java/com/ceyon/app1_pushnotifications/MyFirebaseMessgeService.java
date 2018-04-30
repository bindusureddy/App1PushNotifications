package com.ceyon.app1_pushnotifications;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by DELL on 12-04-2018.
 */

public class MyFirebaseMessgeService extends FirebaseMessagingService {

    private static final String TAG = "FCM";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage){
        Log.d(TAG,"From:" + remoteMessage.getFrom());
        Log.d(TAG,"Notification message:"+ remoteMessage.getNotification().getBody());
    }
















}
