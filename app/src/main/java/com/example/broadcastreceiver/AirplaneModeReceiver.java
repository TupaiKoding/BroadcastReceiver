package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (IsAirplaneModeOn(context.getApplicationContext())) {
            Toast.makeText(context, "Airplane mode is on", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Airplane mode is off", Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean IsAirplaneModeOn (Context c) {
        return Settings.System.getInt(c.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;
    }
}
