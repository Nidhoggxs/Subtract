package com.example.test01;

import java.util.Timer;
import java.util.TimerTask;

import com.reduce.ly.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

public class RegisterActivity_1 extends Activity {
	private static final long DELAY = 2000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_1);
		
		final Intent localIntent=new Intent(RegisterActivity_1.this,LoginActivity.class);
        Timer timer=new Timer();        
        TimerTask tast=new TimerTask() {            
        	public void run(){
        		//((EditText) findViewById (R.id.loginFive)).setText(((EditText) findViewById (R.id.registerTwo)).getText().toString());
        		//上行原打算实现注册信息传递，但是存在未知bug，导致无法传递，现打算使用sqlite。
        		startActivity(localIntent);
        		finish();
        		}        
        	};        
        timer.schedule(tast,DELAY);	
        }
	
	
}
