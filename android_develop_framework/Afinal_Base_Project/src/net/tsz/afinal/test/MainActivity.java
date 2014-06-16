package net.tsz.afinal.test;

import net.tsz.afinal.FinalHttp;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends Activity {

	private String url;
	private FinalHttp finalHttp;
	private Handler handler;
	private TextView tv;
	private Context context = MainActivity.this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
}
