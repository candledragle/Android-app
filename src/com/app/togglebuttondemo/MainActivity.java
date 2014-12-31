package com.app.togglebuttondemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener {
	private ToggleButton tButton;
	private  ImageView  image;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		//初始化变量
		tButton=(ToggleButton) findViewById(R.id.ToggleButton);
		image=(ImageView) findViewById(R.id.ImageView);
		//设置监听器
		tButton.setOnCheckedChangeListener(this);
	}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		image.setBackgroundResource(isChecked?R.drawable.nan:R.drawable.meinv);
	}
	//增加一句话
	//user增加另一句话

}
