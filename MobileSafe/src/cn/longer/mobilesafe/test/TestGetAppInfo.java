package cn.longer.mobilesafe.test;

import android.test.AndroidTestCase;
import cn.longer.mobilesafe.engine.AppInfoProvider;

public class TestGetAppInfo extends AndroidTestCase {
	public void getApps() throws Exception{
		AppInfoProvider provider = new AppInfoProvider(getContext());
		provider.getAllApps();
	}
}
