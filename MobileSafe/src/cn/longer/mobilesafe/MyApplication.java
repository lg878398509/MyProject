package cn.longer.mobilesafe;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import cn.longer.mobilesafe.domain.TaskInfo;
import cn.longer.mobilesafe.receiver.LockScreenReceiver;

public class MyApplication extends Application {
	public TaskInfo taskinfo;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_OFF);
        filter.setPriority(1000);
        LockScreenReceiver recevier = new LockScreenReceiver();
        registerReceiver(recevier, filter);
	}
	
	
}
