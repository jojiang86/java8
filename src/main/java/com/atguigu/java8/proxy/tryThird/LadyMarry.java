package com.atguigu.java8.proxy.tryThird;

public class LadyMarry implements Girl{

    @Override
    public void date() {
        System.out.println("和你约会真有意思！");
    }

    @Override
    public void watchMovie() {
        System.out.println("我不喜欢这电影！");
    }
}
