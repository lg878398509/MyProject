package cn.longer.mobilesafe.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.util.Log;

public class BootCompleteReceiver extends BroadcastReceiver {
	private static final String TAG = "BootCompleteReceiver";
	private SharedPreferences sp;
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(TAG,"重启完毕");
		// 判断手机是否处于保护状态
		sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
		boolean isprotecting = sp.getBoolean("isprotecting", false);
		if(isprotecting){
			TelephonyManager manager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
			String currentsim =  manager.getSimSerialNumber();
			String realsim = sp.getString("sim", "");
			if(!currentsim.equals(realsim)){ //sim 卡串号不同
				// 发送报警短信
				Log.i(TAG,"发送报警短信");
				SmsManager smsmanager = SmsManager.getDefault();
			    String destinationAddress =	sp.getString("safenumber", "");
				smsmanager.sendTextMessage(destinationAddress, null, "sim卡发生了改变,手机可能被盗", null, null);
			}
		}

	}

}
