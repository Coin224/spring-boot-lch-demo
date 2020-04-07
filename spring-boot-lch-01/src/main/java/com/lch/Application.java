package com.lch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//声明入口类
@SpringBootApplication
public class Application {
    //主方法
    public static void main(String[] args) {
        //想要启动程序要用SpringApplication类中的静态方法 启动spring boot程序
        //run方法两个参数   程序的入口类 主方法的参数
        SpringApplication.run(Application.class,args);
    }
}
