package com.example.test01;




import java.io.Serializable;

//������һ��User����ʵ�����л��ӿڡ����л�Serizableһ�����ڽ�����Ķ���־û����洢�豸���Ա�ϵͳͣ��֮��ָ���

public class User implements Serializable{

    //�ں����³�Ա������

    private int id;

    private String username;

    private String password;

    public User() {

        super();

        // TODO Auto-generated constructor stub

    }



    //�Զ��幹�캯����

    public User(String username, String password) {

        super();

        this.username = username;

        this.password = password;

    }



    //��ʵ��get��set������

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getUsername() {

        return username;

    }

    public void setUsername(String username) {

        this.username = username;

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    //�ö�����д��Object���toString()������

    @Override

    public String toString() {

        return "User [id=" + id + ", username=" + username + ", password="

                + password + "]";

    }



}
