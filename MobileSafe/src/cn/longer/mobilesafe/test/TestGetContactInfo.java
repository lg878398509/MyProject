package cn.longer.mobilesafe.test;

import java.util.List;

import android.test.AndroidTestCase;
import cn.longer.mobilesafe.domain.ContactInfo;
import cn.longer.mobilesafe.engine.ContactInfoService;

public class TestGetContactInfo extends AndroidTestCase {

	public void testGetContacts() throws Exception{
		ContactInfoService service = new ContactInfoService(getContext());
		List<ContactInfo> infos =  service.getContactInfos();
		for(ContactInfo info : infos ){
			System.out.println(info.getName());
			System.out.println(info.getPhone());
			
		}
	}
}
