package cn.longer.mobilesafe.test;

import android.test.AndroidTestCase;
import cn.longer.mobilesafe.R;
import cn.longer.mobilesafe.domain.UpdataInfo;
import cn.longer.mobilesafe.engine.UpdataInfoService;

public class TestGetUpdataInfo extends AndroidTestCase {

	
	public void testGetInfo() throws Exception{
		UpdataInfoService service = new UpdataInfoService(getContext());
		UpdataInfo  info = service.getUpdataInfo(R.string.updataurl);
		assertEquals("2.0", info.getVersion());
	}
}
