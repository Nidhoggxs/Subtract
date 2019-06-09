package com.example.test01;

import java.util.ArrayList;

import com.reduce.ly.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity{
	private ArrayList<String> usernamelList;
	private UserService uService = null;
	private long exitTime = 0;
	private Button btnOne,btnTwo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		uService = new UserService(LoginActivity.this);
        usernamelList = uService.getAll();
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnOne.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if("".equals(((EditText) findViewById (R.id.loginFive)).getText().toString())){//记得添加比对数据的方法（未完成）
                	Toast.makeText(getApplicationContext(), "没有输入用户名", Toast.LENGTH_SHORT).show();
                }
                else if("".equals(((EditText) findViewById (R.id.loginFour)).getText().toString())){
                	Toast.makeText(getApplicationContext(), "没有输入密码", Toast.LENGTH_SHORT).show();
                }
                else{
                	Intent intent = new Intent(LoginActivity.this, Main.class);
                	String name=((EditText) findViewById (R.id.loginFive)).getText().toString();
                    String pass=((EditText) findViewById (R.id.loginFour)).getText().toString();
                    boolean flag=uService.login(name, pass);
                    if(flag)
                    	startActivity(intent); 
                    else
                    	Toast.makeText(getApplicationContext(), "用户名或密码输入错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnTwo.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent = new Intent(LoginActivity.this, RegisterActivity.class); 
                startActivity(intent); 
        	}
        });
	}
	public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
    public void exit() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次退出程序",
                    Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            finish();
            System.exit(0);
        }
    }
	protected void onResume() {
        super.onResume();
        usernamelList.clear();      //从注册返回时清除usernamelList
        usernamelList = uService.getAll(); //更新注册的内容
}
	
}
