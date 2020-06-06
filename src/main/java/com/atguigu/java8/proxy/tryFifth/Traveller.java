package com.atguigu.java8.proxy.tryFifth;

public interface Traveller {
    void buyTicket();
    void fly();

    static void system() {
        System.out.println("系统维护!");
    }
}
