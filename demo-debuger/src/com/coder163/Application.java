package com.coder163;

import com.coder163.domain.User;
import com.coder163.service.IUserService;
import com.coder163.service.impl.UserServiceImpl;

public class Application {

    //行断点
    public static void line(){
        System.out.println("line");
    }

    //可直接详细设置的断点方式
    public static void detaiLine(){
        System.out.println("detaiLine");
    }

    //方法断点|接口会直接跳转至具体的实现类
    public static void method(){

        System.out.println("method");
        IUserService us=new UserServiceImpl();

        us.showMessage();
    }

    //异常断点 | 哪有异常停那里
    public static void exception(){

        Object obj = null;

        obj.toString();

        System.out.println("exception");

    }

    //字段断点 | 读写全监控

    public static void field(){
        System.out.println("field");

        User user = new User();

        user.setUname("小黑");

        System.out.println(user.getUname());
    }

    //后退,Frames drop frame,
    public static void backWithFrame(){
        System.out.println("back");
        System.out.println("frame");
    }

    //设置值
    public static void isAge2Big(int age) {

        if (age > 20) {
            System.out.println("20");

            return;
        }

        System.out.println("小于20");
    }

    //条件断点
    public static void clause(){

        for (int i = 0; i < 100; i++) {

            //当i的值是50的时候停下来
            System.out.println(i);
            if (i < 51) {
                System.out.println("clause");
            }
        }
    }

    //监视变量 | 表达式的值:ALT+F8
    public static  void watchVar(int a,int b){

        if (a < b) {

        }

        User user = new User();

        user.setUname("小黑");

        if ("".equals(user.getUname())) {
            System.out.println("watchVar");
        }
    }

    //加载变化
    public static  void loadChange(){

        //断点过程中修改了User类的代码，Run--->Load Changed Classes
        User user = new User();
    }
    public static void main(String[] args) {
        loadChange();
    }
}
