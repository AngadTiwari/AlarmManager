package com.angtwr31.synsoft.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by android on 30/1/15.
 */
public class StartAlarmOnReboot extends BroadcastReceiver{
    public void onReceive(Context arg0, Intent arg1)
    {
        Intent intent = new Intent(arg0,ServiceClass.class);
        arg0.startService(intent);
        Log.i("Testing", "Service Again Started After Reboot");
    }
}
