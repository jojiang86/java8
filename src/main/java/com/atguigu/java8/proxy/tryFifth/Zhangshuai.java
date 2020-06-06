package com.atguigu.java8.proxy.tryFifth;

public class Zhangshuai implements Traveller {
    @Override
    public void buyTicket() {
        System.out.println("买到票啦！");
    }

    @Override
    public void fly() {
        System.out.println("起飞啦！");
    }
}
