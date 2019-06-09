package com.example.test01;

import java.text.DecimalFormat;
import java.util.*;

import com.reduce.ly.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.*;

import android.widget.*;

@SuppressLint("NewApi") 
public class Main extends Activity{
	private ListView msgListView;	
	private EditText inputText;	
	private Button add;
	private Button min;
	private Button equal;
	private MsgAdapter adapter; 	
	private List<Msg> msgList = new ArrayList<Msg>();
	private String content = "";
	private double totalcal,tep;
	@Override
	protected void onCreate(Bundle savedInstanceState) {


		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		initMsgs(); 
		// ��ʼ����Ϣ����	
		adapter = new MsgAdapter(Main.this, R.layout.msg_item, msgList);	
		add = (Button) findViewById(R.id.add);	
		msgListView = (ListView) findViewById(R.id.msg_list);	
		msgListView.setAdapter(adapter);	
		add.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				PopupMenu popup = new PopupMenu(Main.this,add);
                popup.getMenuInflater().inflate(R.menu.main, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.add_food_1:	                          	
                            	Context nContext = Main.this;
                            	AlertDialog.Builder builder = new AlertDialog.Builder(nContext);
                                builder.setTitle("������ʳ�����");
                                // ͨ��LayoutInflater������һ��xml�Ĳ����ļ���Ϊһ��View����
                                final LayoutInflater inflater = Main.this.getLayoutInflater();
                                View view = inflater.inflate(R.layout.outpop, null,false);
                                // ���������Լ�����Ĳ����ļ���Ϊ�������Content
                                builder.setView(view);
                                final EditText username = (EditText) view
                                        .findViewById(R.id.outPop);                               
                                builder.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                //ȷ������������
                                            	content = (String)Main.this.getResources().getText(R.string.food_1);	
                                                content += " " + username.getText().toString();
                                                content += "��"; 
                                                tep = 0;
                                                tep = Double.parseDouble(username.getText().toString());
                                                totalcal += (tep/97)*43;
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged(); 
                                                // ��������Ϣʱ��ˢ��ListView�е���ʾ			
                                                msgListView.setSelection(msgList.size()); 
                                                // ��ListView��λ�����һ��	
                                            }
                                        });
                                builder.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {

                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog = builder.create();       //�����Ի���
                                dialog.setCanceledOnTouchOutside(false);    //���öԻ���ʧȥ���㲻����Ϣ
                                dialog.show();   
                                break;
                            case R.id.add_food_2:
                            	Context nContext_1 = Main.this;
                            	AlertDialog.Builder builder_1 = new AlertDialog.Builder(nContext_1);
                                builder_1.setTitle("������ʳ�����");
                                final LayoutInflater inflater_1 = Main.this.getLayoutInflater();
                                View view_1 = inflater_1.inflate(R.layout.outpop, null,false);
                                builder_1.setView(view_1);
                                final EditText username_1 = (EditText) view_1
                                        .findViewById(R.id.outPop);                               
                                builder_1.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_1.getText().toString());
                                                totalcal += (tep/88)*449;
                                            	content = (String)Main.this.getResources().getText(R.string.food_2);	
                                                content += " " + username_1.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_1.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_1 = builder_1.create();    
                                dialog_1.setCanceledOnTouchOutside(false);    
                                dialog_1.show(); 
                                break;
                            case R.id.add_food_3:
                            	Context nContext_2 = Main.this;
                            	AlertDialog.Builder builder_2 = new AlertDialog.Builder(nContext_2);
                                builder_2.setTitle("������ʳ�����");
                                final LayoutInflater inflater_2 = Main.this.getLayoutInflater();
                                View view_2 = inflater_2.inflate(R.layout.outpop, null,false);
                                builder_2.setView(view_2);
                                final EditText username_2 = (EditText) view_2
                                        .findViewById(R.id.outPop);                               
                                builder_2.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_2.getText().toString());
                                                totalcal += (tep/100)*102;
                                            	content = (String)Main.this.getResources().getText(R.string.food_3);	
                                                content += " " + username_2.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_2.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_2 = builder_2.create();    
                                dialog_2.setCanceledOnTouchOutside(false);    
                                dialog_2.show(); 
                                break;
                            case R.id.add_food_4:
                            	Context nContext_3 = Main.this;
                            	AlertDialog.Builder builder_3 = new AlertDialog.Builder(nContext_3);
                                builder_3.setTitle("������ʳ�����");
                                final LayoutInflater inflater_3 = Main.this.getLayoutInflater();
                                View view_3 = inflater_3.inflate(R.layout.outpop, null,false);
                                builder_3.setView(view_3);
                                final EditText username_3 = (EditText) view_3
                                        .findViewById(R.id.outPop);                               
                                builder_3.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_3.getText().toString());
                                                totalcal += (tep/100)*395;
                                            	content = (String)Main.this.getResources().getText(R.string.food_4);	
                                                content += " " + username_3.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_3.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_3 = builder_3.create();    
                                dialog_3.setCanceledOnTouchOutside(false);    
                                dialog_3.show(); 
                                break;
                            case R.id.add_food_5:
                            	Context nContext_4 = Main.this;
                            	AlertDialog.Builder builder_4 = new AlertDialog.Builder(nContext_4);
                                builder_4.setTitle("������ʳ�����");
                                final LayoutInflater inflater_4 = Main.this.getLayoutInflater();
                                View view_4 = inflater_4.inflate(R.layout.outpop, null,false);
                                builder_4.setView(view_4);
                                final EditText username_4 = (EditText) view_4
                                        .findViewById(R.id.outPop);                               
                                builder_4.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_4.getText().toString());
                                                totalcal += (tep/72)*278;
                                            	content = (String)Main.this.getResources().getText(R.string.food_5);	
                                                content += " " + username_4.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_4.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_4 = builder_4.create();    
                                dialog_4.setCanceledOnTouchOutside(false);    
                                dialog_4.show(); 
                                break;
                            case R.id.add_food_6:
                            	Context nContext_5 = Main.this;
                            	AlertDialog.Builder builder_5 = new AlertDialog.Builder(nContext_5);
                                builder_5.setTitle("������ʳ�����");
                                final LayoutInflater inflater_5 = Main.this.getLayoutInflater();
                                View view_5 = inflater_5.inflate(R.layout.outpop, null,false);
                                builder_5.setView(view_5);
                                final EditText username_5 = (EditText) view_5
                                        .findViewById(R.id.outPop);                               
                                builder_5.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_5.getText().toString());
                                                totalcal += (tep/90)*198;
                                            	content = (String)Main.this.getResources().getText(R.string.food_6);	
                                                content += " " + username_5.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_5.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_5 = builder_5.create();    
                                dialog_5.setCanceledOnTouchOutside(false);    
                                dialog_5.show(); 
                                break;
                            case R.id.add_food_7:
                            	Context nContext_6 = Main.this;
                            	AlertDialog.Builder builder_6 = new AlertDialog.Builder(nContext_6);
                                builder_6.setTitle("������ʳ�����");
                                final LayoutInflater inflater_6 = Main.this.getLayoutInflater();
                                View view_6 = inflater_6.inflate(R.layout.outpop, null,false);
                                builder_6.setView(view_6);
                                final EditText username_6 = (EditText) view_6
                                        .findViewById(R.id.outPop);                               
                                builder_6.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_6.getText().toString());
                                                totalcal += (tep/100)*212;
                                            	content = (String)Main.this.getResources().getText(R.string.food_7);	
                                                content += " " + username_6.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_6.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_6 = builder_6.create();    
                                dialog_6.setCanceledOnTouchOutside(false);    
                                dialog_6.show(); 
                                break; 
                            case R.id.add_food_8:
                            	Context nContext_7 = Main.this;
                            	AlertDialog.Builder builder_7 = new AlertDialog.Builder(nContext_7);
                                builder_7.setTitle("������ʳ�����");
                                final LayoutInflater inflater_7 = Main.this.getLayoutInflater();
                                View view_7 = inflater_7.inflate(R.layout.outpop, null,false);
                                builder_7.setView(view_7);
                                final EditText username_7 = (EditText) view_7
                                        .findViewById(R.id.outPop);                               
                                builder_7.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_7.getText().toString());
                                                totalcal += (tep/58)*112;
                                            	content = (String)Main.this.getResources().getText(R.string.food_8);	
                                                content += " " + username_7.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_7.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_7 = builder_7.create();    
                                dialog_7.setCanceledOnTouchOutside(false);    
                                dialog_7.show(); 
                                break;  
                            case R.id.add_food_9:
                            	Context nContext_8 = Main.this;
                            	AlertDialog.Builder builder_8 = new AlertDialog.Builder(nContext_8);
                                builder_8.setTitle("������ʳ�����");
                                final LayoutInflater inflater_8 = Main.this.getLayoutInflater();
                                View view_8 = inflater_8.inflate(R.layout.outpop, null,false);
                                builder_8.setView(view_8);
                                final EditText username_8 = (EditText) view_8
                                        .findViewById(R.id.outPop);                               
                                builder_8.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_8.getText().toString());
                                                totalcal += (tep/85)*57;
                                            	content = (String)Main.this.getResources().getText(R.string.food_9);	
                                                content += " " + username_8.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_8.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_8 = builder_8.create();    
                                dialog_8.setCanceledOnTouchOutside(false);    
                                dialog_8.show(); 
                                break;     
                            case R.id.add_food_10:
                            	Context nContext_9 = Main.this;
                            	AlertDialog.Builder builder_9 = new AlertDialog.Builder(nContext_9);
                                builder_9.setTitle("������ʳ�����");
                                final LayoutInflater inflater_9 = Main.this.getLayoutInflater();
                                View view_9 = inflater_9.inflate(R.layout.outpop, null,false);
                                builder_9.setView(view_9);
                                final EditText username_9 = (EditText) view_9
                                        .findViewById(R.id.outPop);                               
                                builder_9.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_9.getText().toString());
                                                totalcal += (tep/79)*46;
                                            	content = (String)Main.this.getResources().getText(R.string.food_10);	
                                                content += " " + username_9.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_9.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_9 = builder_9.create();    
                                dialog_9.setCanceledOnTouchOutside(false);    
                                dialog_9.show(); 
                                break;
                            case R.id.add_food_11:
                            	Context nContext_10 = Main.this;
                            	AlertDialog.Builder builder_10 = new AlertDialog.Builder(nContext_10);
                                builder_10.setTitle("������ʳ�����");
                                final LayoutInflater inflater_10 = Main.this.getLayoutInflater();
                                View view_10 = inflater_10.inflate(R.layout.outpop, null,false);
                                builder_10.setView(view_10);
                                final EditText username_10 = (EditText) view_10
                                        .findViewById(R.id.outPop);                               
                                builder_10.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_10.getText().toString());
                                                totalcal += (tep/59)*91;
                                            	content = (String)Main.this.getResources().getText(R.string.food_11);	
                                                content += " " + username_10.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_10.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_10 = builder_10.create();    
                                dialog_10.setCanceledOnTouchOutside(false);    
                                dialog_10.show(); 
                                break;
                            case R.id.add_food_12:
                            	Context nContext_11 = Main.this;
                            	AlertDialog.Builder builder_11 = new AlertDialog.Builder(nContext_11);
                                builder_11.setTitle("������ʳ�����");
                                final LayoutInflater inflater_11 = Main.this.getLayoutInflater();
                                View view_11 = inflater_11.inflate(R.layout.outpop, null,false);
                                builder_11.setView(view_11);
                                final EditText username_11 = (EditText) view_11
                                        .findViewById(R.id.outPop);                               
                                builder_11.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_11.getText().toString());
                                                totalcal += (tep/93)*54;
                                            	content = (String)Main.this.getResources().getText(R.string.food_12);	
                                                content += " " + username_11.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_11.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_11 = builder_11.create();    
                                dialog_11.setCanceledOnTouchOutside(false);    
                                dialog_11.show(); 
                                break;
                            case R.id.add_food_13:
                            	Context nContext_12 = Main.this;
                            	AlertDialog.Builder builder_12 = new AlertDialog.Builder(nContext_12);
                                builder_12.setTitle("������ʳ�����");
                                final LayoutInflater inflater_12 = Main.this.getLayoutInflater();
                                View view_12 = inflater_12.inflate(R.layout.outpop, null,false);
                                builder_12.setView(view_12);
                                final EditText username_12 = (EditText) view_12
                                        .findViewById(R.id.outPop);                               
                                builder_12.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_12.getText().toString());
                                                totalcal += (tep/52)*616;
                                            	content = (String)Main.this.getResources().getText(R.string.food_13);	
                                                content += " " + username_12.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_12.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_12 = builder_12.create();    
                                dialog_12.setCanceledOnTouchOutside(false);    
                                dialog_12.show(); 
                                break;
                            case R.id.add_food_14:
                            	Context nContext_13 = Main.this;
                            	AlertDialog.Builder builder_13 = new AlertDialog.Builder(nContext_13);
                                builder_13.setTitle("������ʳ�����");
                                final LayoutInflater inflater_13 = Main.this.getLayoutInflater();
                                View view_13 = inflater_13.inflate(R.layout.outpop, null,false);
                                builder_13.setView(view_13);
                                final EditText username_13 = (EditText) view_13
                                        .findViewById(R.id.outPop);                               
                                builder_13.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_13.getText().toString());
                                                totalcal += (tep/100)*563;
                                            	content = (String)Main.this.getResources().getText(R.string.food_14);	
                                                content += " " + username_13.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_13.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_13 = builder_13.create();    
                                dialog_13.setCanceledOnTouchOutside(false);    
                                dialog_13.show(); 
                                break;
                            case R.id.add_food_15:
                            	Context nContext_14 = Main.this;
                            	AlertDialog.Builder builder_14 = new AlertDialog.Builder(nContext_14);
                                builder_14.setTitle("������ʳ�����");
                                final LayoutInflater inflater_14 = Main.this.getLayoutInflater();
                                View view_14 = inflater_14.inflate(R.layout.outpop, null,false);
                                builder_14.setView(view_14);
                                final EditText username_14 = (EditText) view_14
                                        .findViewById(R.id.outPop);                               
                                builder_14.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_14.getText().toString());
                                                totalcal += (tep/100)*54;
                                            	content = (String)Main.this.getResources().getText(R.string.food_15);	
                                                content += " " + username_14.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_14.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_14 = builder_14.create();    
                                dialog_14.setCanceledOnTouchOutside(false);    
                                dialog_14.show(); 
                                break;
                            case R.id.add_food_16:
                            	Context nContext_15 = Main.this;
                            	AlertDialog.Builder builder_15 = new AlertDialog.Builder(nContext_15);
                                builder_15.setTitle("������ʳ�����");
                                final LayoutInflater inflater_15 = Main.this.getLayoutInflater();
                                View view_15 = inflater_15.inflate(R.layout.outpop, null,false);
                                builder_15.setView(view_15);
                                final EditText username_15 = (EditText) view_15
                                        .findViewById(R.id.outPop);                               
                                builder_15.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_15.getText().toString());
                                                totalcal += (tep/100)*59;
                                            	content = (String)Main.this.getResources().getText(R.string.food_16);	
                                                content += " " + username_15.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_15.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_15 = builder_15.create();    
                                dialog_15.setCanceledOnTouchOutside(false);    
                                dialog_15.show(); 
                                break;
                            case R.id.add_food_17:
                            	Context nContext_16 = Main.this;
                            	AlertDialog.Builder builder_16 = new AlertDialog.Builder(nContext_16);
                                builder_16.setTitle("������ʳ�����");
                                final LayoutInflater inflater_16 = Main.this.getLayoutInflater();
                                View view_16 = inflater_16.inflate(R.layout.outpop, null,false);
                                builder_16.setView(view_16);
                                final EditText username_16 = (EditText) view_16
                                        .findViewById(R.id.outPop);                               
                                builder_16.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_16.getText().toString());
                                                totalcal += (tep/100)*13;
                                            	content = (String)Main.this.getResources().getText(R.string.food_17);	
                                                content += " " + username_16.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_16.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_16 = builder_16.create();    
                                dialog_16.setCanceledOnTouchOutside(false);    
                                dialog_16.show(); 
                                break;
                            case R.id.add_food_18:
                            	Context nContext_17 = Main.this;
                            	AlertDialog.Builder builder_17 = new AlertDialog.Builder(nContext_17);
                                builder_17.setTitle("������ʳ�����");
                                final LayoutInflater inflater_17 = Main.this.getLayoutInflater();
                                View view_17 = inflater_17.inflate(R.layout.outpop, null,false);
                                builder_17.setView(view_17);
                                final EditText username_17 = (EditText) view_17
                                        .findViewById(R.id.outPop);                               
                                builder_17.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_17.getText().toString());
                                                totalcal += (tep/62)*14;
                                            	content = (String)Main.this.getResources().getText(R.string.food_18);	
                                                content += " " + username_17.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_17.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_17 = builder_17.create();    
                                dialog_17.setCanceledOnTouchOutside(false);    
                                dialog_17.show(); 
                                break;
                            case R.id.add_food_19:
                            	Context nContext_18 = Main.this;
                            	AlertDialog.Builder builder_18 = new AlertDialog.Builder(nContext_18);
                                builder_18.setTitle("������ʳ�����");
                                final LayoutInflater inflater_18 = Main.this.getLayoutInflater();
                                View view_18 = inflater_18.inflate(R.layout.outpop, null,false);
                                builder_18.setView(view_18);
                                final EditText username_18 = (EditText) view_18
                                        .findViewById(R.id.outPop);                               
                                builder_18.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_18.getText().toString());
                                                totalcal += (tep/22)*85;
                                            	content = (String)Main.this.getResources().getText(R.string.food_19);	
                                                content += " " + username_18.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_18.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_18 = builder_18.create();    
                                dialog_18.setCanceledOnTouchOutside(false);    
                                dialog_18.show(); 
                                break;
                            case R.id.add_food_20:
                            	Context nContext_19 = Main.this;
                            	AlertDialog.Builder builder_19 = new AlertDialog.Builder(nContext_19);
                                builder_19.setTitle("������ʳ�����");
                                final LayoutInflater inflater_19 = Main.this.getLayoutInflater();
                                View view_19 = inflater_19.inflate(R.layout.outpop, null,false);
                                builder_19.setView(view_19);
                                final EditText username_19 = (EditText) view_19
                                        .findViewById(R.id.outPop);                               
                                builder_19.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_19.getText().toString());
                                                totalcal += (tep/97)*19;
                                            	content = (String)Main.this.getResources().getText(R.string.food_20);	
                                                content += " " + username_19.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_19.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_19 = builder_19.create();    
                                dialog_19.setCanceledOnTouchOutside(false);    
                                dialog_19.show(); 
                                break;
                            case R.id.add_food_21:
                            	Context nContext_20 = Main.this;
                            	AlertDialog.Builder builder_20 = new AlertDialog.Builder(nContext_20);
                                builder_20.setTitle("������ʳ�����");
                                final LayoutInflater inflater_20 = Main.this.getLayoutInflater();
                                View view_20 = inflater_20.inflate(R.layout.outpop, null,false);
                                builder_20.setView(view_20);
                                final EditText username_20 = (EditText) view_20
                                        .findViewById(R.id.outPop);                               
                                builder_20.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_20.getText().toString());
                                                totalcal += (tep/94)*76;
                                            	content = (String)Main.this.getResources().getText(R.string.food_21);	
                                                content += " " + username_20.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_20.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_20 = builder_20.create();    
                                dialog_20.setCanceledOnTouchOutside(false);    
                                dialog_20.show(); 
                                break;
                            case R.id.add_food_22:
                            	Context nContext_21 = Main.this;
                            	AlertDialog.Builder builder_21 = new AlertDialog.Builder(nContext_21);
                                builder_21.setTitle("������ʳ�����");
                                final LayoutInflater inflater_21 = Main.this.getLayoutInflater();
                                View view_21 = inflater_21.inflate(R.layout.outpop, null,false);
                                builder_21.setView(view_21);
                                final EditText username_21 = (EditText) view_21
                                        .findViewById(R.id.outPop);                               
                                builder_21.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_21.getText().toString());
                                                totalcal += (tep/100)*115;
                                            	content = (String)Main.this.getResources().getText(R.string.food_22);	
                                                content += " " + username_21.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_21.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_21 = builder_21.create();    
                                dialog_21.setCanceledOnTouchOutside(false);    
                                dialog_21.show(); 
                                break;
                            case R.id.add_food_23:
                            	Context nContext_22 = Main.this;
                            	AlertDialog.Builder builder_22 = new AlertDialog.Builder(nContext_22);
                                builder_22.setTitle("������ʳ�����");
                                final LayoutInflater inflater_22 = Main.this.getLayoutInflater();
                                View view_22 = inflater_22.inflate(R.layout.outpop, null,false);
                                builder_22.setView(view_22);
                                final EditText username_22 = (EditText) view_22
                                        .findViewById(R.id.outPop);                               
                                builder_22.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_22.getText().toString());
                                                totalcal += (tep/100)*312;
                                            	content = (String)Main.this.getResources().getText(R.string.food_23);	
                                                content += " " + username_22.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_22.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_22 = builder_22.create();    
                                dialog_22.setCanceledOnTouchOutside(false);    
                                dialog_22.show(); 
                                break;
                            case R.id.add_food_24:
                            	Context nContext_23 = Main.this;
                            	AlertDialog.Builder builder_23 = new AlertDialog.Builder(nContext_23);
                                builder_23.setTitle("������ʳ�����");
                                final LayoutInflater inflater_23 = Main.this.getLayoutInflater();
                                View view_23 = inflater_23.inflate(R.layout.outpop, null,false);
                                builder_23.setView(view_23);
                                final EditText username_23 = (EditText) view_23
                                        .findViewById(R.id.outPop);                               
                                builder_23.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            	tep = 0;
                                                tep = Double.parseDouble(username_23.getText().toString());
                                                totalcal += (tep/100)*898;
                                            	content = (String)Main.this.getResources().getText(R.string.food_24);	
                                                content += " " + username_23.getText().toString();
                                                content += "��"; 
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged();			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_23.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog_23 = builder_23.create();    
                                dialog_23.setCanceledOnTouchOutside(false);    
                                dialog_23.show(); 
                                break;
                        }
                        return true;
                    }
                });
                popup.show();
            }
        });
		min = (Button) findViewById(R.id.min);	
		min.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				PopupMenu popup = new PopupMenu(Main.this,min);
                popup.getMenuInflater().inflate(R.menu.main_1, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.min_sport_1:	                          	
                            	Context nContext = Main.this;
                            	AlertDialog.Builder builder = new AlertDialog.Builder(nContext);
                                builder.setTitle("�������˶�ʱ��");
                                // ͨ��LayoutInflater������һ��xml�Ĳ����ļ���Ϊһ��View����
                                final LayoutInflater inflater = Main.this.getLayoutInflater();
                                View view = inflater.inflate(R.layout.outpop, null,false);
                                // ���������Լ�����Ĳ����ļ���Ϊ�������Content
                                builder.setView(view);
                                final EditText username = (EditText) view
                                        .findViewById(R.id.outPop);                               
                                builder.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                //ȷ������������
                                            	content = (String)Main.this.getResources().getText(R.string.sport_1);	
                                                content += " " + username.getText().toString();
                                                content += "����"; 
                                                tep = 0;
                                                tep = Double.parseDouble(username.getText().toString());
                                                totalcal -= (tep/60)*450;
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged(); 
                                                // ��������Ϣʱ��ˢ��ListView�е���ʾ			
                                                msgListView.setSelection(msgList.size()); 
                                                // ��ListView��λ�����һ��	
                                            }
                                        });
                                builder.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {

                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog = builder.create();       //�����Ի���
                                dialog.setCanceledOnTouchOutside(false);    //���öԻ���ʧȥ���㲻����Ϣ
                                dialog.show();   
                                break;
                            case R.id.min_sport_2:	                          	
                            	Context nContext_1 = Main.this;
                            	AlertDialog.Builder builder_1 = new AlertDialog.Builder(nContext_1);
                                builder_1.setTitle("�������˶�ʱ��");
                                final LayoutInflater inflater_1 = Main.this.getLayoutInflater();
                                View view_1 = inflater_1.inflate(R.layout.outpop, null,false);
                                builder_1.setView(view_1);
                                final EditText username_1 = (EditText) view_1
                                        .findViewById(R.id.outPop);                               
                                builder_1.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog_1, int which) {
                                            	content = (String)Main.this.getResources().getText(R.string.sport_2);	
                                                content += " " + username_1.getText().toString();
                                                content += "����"; 
                                                tep = 0;
                                                tep = Double.parseDouble(username_1.getText().toString());
                                                totalcal -= (tep/60)*500;
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged(); 			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_1.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {

                                            @Override
                                            public void onClick(DialogInterface dialog_1, int which) {
                                            }
                                        });
                                AlertDialog dialog_1 = builder_1.create();       //�����Ի���
                                dialog_1.setCanceledOnTouchOutside(false);    //���öԻ���ʧȥ���㲻����Ϣ
                                dialog_1.show();   
                                break;
                            case R.id.min_sport_3:	                          	
                            	Context nContext_2 = Main.this;
                            	AlertDialog.Builder builder_2 = new AlertDialog.Builder(nContext_2);
                                builder_2.setTitle("�������˶�ʱ��");
                                final LayoutInflater inflater_2 = Main.this.getLayoutInflater();
                                View view_2 = inflater_2.inflate(R.layout.outpop, null,false);
                                builder_2.setView(view_2);
                                final EditText username_2 = (EditText) view_2
                                        .findViewById(R.id.outPop);                               
                                builder_2.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog_2, int which) {
                                            	content = (String)Main.this.getResources().getText(R.string.sport_3);	
                                                content += " " + username_2.getText().toString();
                                                content += "����"; 
                                                tep = 0;
                                                tep = Double.parseDouble(username_2.getText().toString());
                                                totalcal -= (tep/60)*469;
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged(); 			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_2.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {

                                            @Override
                                            public void onClick(DialogInterface dialog_2, int which) {
                                            }
                                        });
                                AlertDialog dialog_2 = builder_2.create();       //�����Ի���
                                dialog_2.setCanceledOnTouchOutside(false);    //���öԻ���ʧȥ���㲻����Ϣ
                                dialog_2.show();   
                                break;
                            case R.id.min_sport_4:	                          	
                            	Context nContext_3 = Main.this;
                            	AlertDialog.Builder builder_3 = new AlertDialog.Builder(nContext_3);
                                builder_3.setTitle("�������˶�ʱ��");
                                final LayoutInflater inflater_3 = Main.this.getLayoutInflater();
                                View view_3 = inflater_3.inflate(R.layout.outpop, null,false);
                                builder_3.setView(view_3);
                                final EditText username_3 = (EditText) view_3
                                        .findViewById(R.id.outPop);                               
                                builder_3.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog_3, int which) {
                                            	content = (String)Main.this.getResources().getText(R.string.sport_4);	
                                                content += " " + username_3.getText().toString();
                                                content += "����"; 
                                                tep = 0;
                                                tep = Double.parseDouble(username_3.getText().toString());
                                                totalcal -= (tep/60)*400;
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged(); 			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_3.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {

                                            @Override
                                            public void onClick(DialogInterface dialog_3, int which) {
                                            }
                                        });
                                AlertDialog dialog_3 = builder_3.create();       //�����Ի���
                                dialog_3.setCanceledOnTouchOutside(false);    //���öԻ���ʧȥ���㲻����Ϣ
                                dialog_3.show();   
                                break;
                            case R.id.min_sport_5:	                          	
                            	Context nContext_4 = Main.this;
                            	AlertDialog.Builder builder_4 = new AlertDialog.Builder(nContext_4);
                                builder_4.setTitle("�������˶�ʱ��");
                                final LayoutInflater inflater_4 = Main.this.getLayoutInflater();
                                View view_4 = inflater_4.inflate(R.layout.outpop, null,false);
                                builder_4.setView(view_4);
                                final EditText username_4 = (EditText) view_4
                                        .findViewById(R.id.outPop);                               
                                builder_4.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog_4, int which) {
                                            	content = (String)Main.this.getResources().getText(R.string.sport_5);	
                                                content += " " + username_4.getText().toString();
                                                content += "����"; 
                                                tep = 0;
                                                tep = Double.parseDouble(username_4.getText().toString());
                                                totalcal -= (tep/60)*425;
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged(); 			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_4.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {

                                            @Override
                                            public void onClick(DialogInterface dialog_4, int which) {
                                            }
                                        });
                                AlertDialog dialog_4 = builder_4.create();       //�����Ի���
                                dialog_4.setCanceledOnTouchOutside(false);    //���öԻ���ʧȥ���㲻����Ϣ
                                dialog_4.show();   
                                break;
                            case R.id.min_sport_6:	                          	
                            	Context nContext_5 = Main.this;
                            	AlertDialog.Builder builder_5 = new AlertDialog.Builder(nContext_5);
                                builder_5.setTitle("�������˶�ʱ��");
                                final LayoutInflater inflater_5 = Main.this.getLayoutInflater();
                                View view_5 = inflater_5.inflate(R.layout.outpop, null,false);
                                builder_5.setView(view_5);
                                final EditText username_5 = (EditText) view_5
                                        .findViewById(R.id.outPop);                               
                                builder_5.setPositiveButton("ȷ��",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog_5, int which) {
                                            	content = (String)Main.this.getResources().getText(R.string.sport_6);	
                                                content += " " + username_5.getText().toString();
                                                content += "����"; 
                                                tep = 0;
                                                tep = Double.parseDouble(username_5.getText().toString());
                                                totalcal -= (tep/60)*450;
                                                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                                                adapter.notifyDataSetChanged(); 			
                                                msgListView.setSelection(msgList.size()); 
                                            }
                                        });
                                builder_5.setNegativeButton("����",
                                        new DialogInterface.OnClickListener() {

                                            @Override
                                            public void onClick(DialogInterface dialog_5, int which) {
                                            }
                                        });
                                AlertDialog dialog_5 = builder_5.create();       //�����Ի���
                                dialog_5.setCanceledOnTouchOutside(false);    //���öԻ���ʧȥ���㲻����Ϣ
                                dialog_5.show();   
                                break;
                        		}
                                return true;
                        }
                    });
                    popup.show();
                }
            });
		equal = (Button) findViewById(R.id.equal);	
		final DecimalFormat df = new DecimalFormat( "0.00");  
		equal.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                content = "��ĿǰΪֹ�Ŀ�·�����ĺ������ܺ�Ϊ" + df.format(totalcal) +" ��"; 
                msgList.add(new Msg(content, Msg.TYPE_SENT));			
                adapter.notifyDataSetChanged(); 			
                msgListView.setSelection(msgList.size()); 
            }
        });
	}
	private void initMsgs() {	
		Msg msg1 = new Msg("��ӭʹ�ü�����һ���¼��·�����������Ǽ���������������˶����Ļ���������ļӺţ�" +
				"			�Ϳ���ѡ�����ʲô�ˣ�Ҫ���˶��ˣ��͵�����ļ��ţ��Ϳ���ѡ���˶��������ˣ�" +
				"			����ѡ���ˣ��͵�һ�µ��ںţ��Ϳ���֪������Ŀ�·���ܺ�����", Msg.TYPE_RECEIVED);	
		msgList.add(msg1);	
		}
}
	


