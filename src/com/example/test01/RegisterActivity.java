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

public class RegisterActivity extends Activity{
	private ArrayList<String> usernamelList;
	private Button btnThree,btnFour;
	private UserService uService = null;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {//����ʵ��activistת����������ȡ�����أ�����ע�����ע����Ϣ��Ȼ��ص���һҳ
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		btnThree = (Button) findViewById(R.id.btnThree);
		btnFour = (Button) findViewById(R.id.btnFour);
		uService = new UserService(RegisterActivity.this);
        usernamelList = uService.getAll();
		btnThree.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if("".equals(((EditText) findViewById (R.id.registerTwo)).getText().toString())){//�ǵ���ӱȶ����ݵķ�����δ��ɣ�
					Toast.makeText(getApplicationContext(), "û�������û���", Toast.LENGTH_SHORT).show();
	            }
				else if("".equals(((EditText) findViewById (R.id.registerFour)).getText().toString())){
					Toast.makeText(getApplicationContext(), "û����������", Toast.LENGTH_SHORT).show();
				}
				else if("".equals(((EditText) findViewById (R.id.registerSix)).getText().toString())){
					Toast.makeText(getApplicationContext(), "û���ٴ���������", Toast.LENGTH_SHORT).show();
				}
				else if(!(((EditText) findViewById (R.id.registerFour)).getText().toString()).equals(((EditText) findViewById (R.id.registerSix)).getText().toString())){
					Toast.makeText(getApplicationContext(), "�����������벻һ��", Toast.LENGTH_SHORT).show();
				}
				else{
					Intent intent = new Intent(RegisterActivity.this, RegisterActivity_1.class); 
					String name=((EditText) findViewById (R.id.registerTwo)).getText().toString();

	                String pass=((EditText) findViewById (R.id.registerSix)).getText().toString();
	                UserService uService=new UserService(RegisterActivity.this);
	                User user=new User();
	                user.setUsername(name);
	                user.setPassword(pass);
	                boolean x = uService.register(user);       
	                if(x&&!usernamelList.equals(name))
	                	startActivity(intent); 
	                else
	                	Toast.makeText(getApplicationContext(), "����û����Ѿ���ע�����", Toast.LENGTH_SHORT).show();
	            }
	       }
		});
	   	btnFour.setOnClickListener(new OnClickListener() {
	   		public void onClick(View v) {
	   			Intent intent = new Intent(RegisterActivity.this, LoginActivity.class); 
                startActivity(intent); 
	   		}
	   	});			
	}

}

