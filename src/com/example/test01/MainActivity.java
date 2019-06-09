package com.example.test01;

import java.util.Timer;
import java.util.TimerTask;

import com.reduce.ly.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;



public class MainActivity extends Activity {

    private static final long DELAY = 2000;
    private TimerTask task;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        final Intent localIntent=new Intent(this,LoginActivity.class);
        Timer timer=new Timer();        
        TimerTask tast=new TimerTask() {            
        	public void run(){                
        		startActivity(localIntent);
        		finish();
        		}        
        	};        
        timer.schedule(tast,DELAY);	
        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
