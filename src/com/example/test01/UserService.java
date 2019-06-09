package com.example.test01;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UserService {
	   private ArrayList<String> usernameList = new ArrayList<String>();
	    private DatabaseHelper dbHelper;
	    private String s = null;

	    public UserService(Context context){
	        dbHelper=new DatabaseHelper(context);
	    }

	    //��¼��
	    public boolean login(String username,String password){
	        SQLiteDatabase sdb=dbHelper.getReadableDatabase();
	        String sql="select * from user where username=? and password=?";
	        Cursor cursor=sdb.rawQuery(sql, new String[]{username,password});
	        if(cursor.moveToFirst()==true){
	            cursor.close();
	            return true;
	        }
	        return false;
	    }

	    //ע����
	    public boolean register(User user){
	        //��getReadable��getWriteable�����Դ������ߴ�һ�����ݿⲢ����һ���ɶ����ݿ���ж�д�����Ķ��󣬵����ݿ���R����ֻ����W�ᱨ��
	        SQLiteDatabase sdb=dbHelper.getReadableDatabase();
	        String sql="insert into user(username,password) values(?,?)";
	        Object obj[]={user.getUsername(),user.getPassword()};
	        sdb.execSQL(sql, obj);
	        return true;
	    }

	    public ArrayList<String> getAll() {
	        SQLiteDatabase sdb=dbHelper.getReadableDatabase();
	        //��ѯ����α�
	        Cursor cursor = sdb.query ("user",null,null,null,null,null,null);
	        //�ж��α��Ƿ�Ϊ��
	        if(cursor.moveToFirst()) {
	            //�����α�
	            do{
	                //����û���
	                usernameList.add(cursor.getString(1));
	            }while(cursor.moveToNext());
	            cursor.close();
	        }
	        return usernameList;
	    }

}
