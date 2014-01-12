package cn.lame.longer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LameActivity extends Activity {
	private EditText et_wav;
	private EditText et_mp3;
	private native void convertMp3(String wav,String mp3);
	static{
		System.loadLibrary("Hello");
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		et_wav = (EditText) this.findViewById(R.id.editText1);
		et_mp3 = (EditText) this.findViewById(R.id.editText2);
	}
	
	public void convert(View view){
		final String mp3name = et_mp3.getText().toString().trim();
    	final String wavname = et_wav.getText().toString().trim();
    	if("".equals(mp3name)||"".equals(wavname)){
    		Toast.makeText(this, "路径不能为空", 1).show();
    		return;
    	}
    	
    	convertMp3(wavname,mp3name);
	}

}
