package com.atguigu.java8.proxy;

public class Wangmeili implements Girl{

    @Override
    public void date() {
        System.out.println("和你约会好开心呀！");
    }

    @Override
    public void watchMovie() {
        System.out.println("我不喜欢看这个电影");
    }
}
