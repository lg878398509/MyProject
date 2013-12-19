package cn.longer.mobilesafe.test;

import java.util.List;

import android.test.AndroidTestCase;
import cn.longer.mobilesafe.domain.SmsInfo;
import cn.longer.mobilesafe.engine.SmsInfoService;

public class TestSmsInfoService extends AndroidTestCase {

	
	public void testGetSmsInfos() throws Exception{
		SmsInfoService service  = new SmsInfoService(getContext());
		List<SmsInfo>  smsinfos = service.getSmsInfos();
		assertEquals(5, smsinfos.size());
	}
}
