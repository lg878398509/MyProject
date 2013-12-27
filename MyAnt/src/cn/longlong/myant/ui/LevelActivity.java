package cn.longlong.myant.ui;

import cn.longlong.myant.R;
import cn.longlong.myant.utils.Logger;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Gallery;

public class LevelActivity extends Activity {
	
	private static final String TAG = "LevelActivity";
	
	private Gallery level_select_gallery;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Logger.i(TAG, "LevelActivity start");
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	      requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.level);
		level_select_gallery = (Gallery) this.findViewById(R.id.level_select_gallery);
	}
	
	
	
	private class LevelGalleryAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
