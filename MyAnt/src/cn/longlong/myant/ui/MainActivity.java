package cn.longlong.myant.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import cn.longlong.myant.R;

public class MainActivity extends Activity implements OnClickListener{
	private ImageView start_btn;
	private ImageView help_btn;
	private ImageView setting_btn;
	private ImageView exit_btn;
	private ImageButton about_btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		start_btn = (ImageView) this.findViewById(R.id.start_btn);
		help_btn = (ImageView) this.findViewById(R.id.help_btn);
		setting_btn = (ImageView) this.findViewById(R.id.setting_btn);
		exit_btn = (ImageView) this.findViewById(R.id.exit_btn);
		about_btn = (ImageButton) this.findViewById(R.id.about_btn);
		
		start_btn.setOnClickListener(this);
		help_btn.setOnClickListener(this);
		setting_btn.setOnClickListener(this);
		exit_btn.setOnClickListener(this);
		about_btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.start_btn:
			
			break;
		case R.id.help_btn:
			
			break;
		case R.id.setting_btn:
			
			break;
		case R.id.exit_btn:
			
			break;
		case R.id.about_btn:
			showDialogAboutInfo();
			break;

		}
	}
	
	/**
	 * 显示关于信息
	 */
	private void showDialogAboutInfo() {
		AlertDialog.Builder builder = new Builder(this);
		builder.setIcon(R.drawable.icon);
		builder.setTitle(getResources().getString(R.string.app_name));
		builder.setMessage(getResources().getString(R.string.developer));
		builder.show().setCanceledOnTouchOutside(true);
	}
}
