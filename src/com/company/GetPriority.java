package com.company;

public class GetPriority extends Thread {
    public void run(){
        System.out.println("running thread name is :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        GetPriority p1 =new GetPriority();
        GetPriority p2 =new GetPriority();
        System.out.println("p1 priority:"+p1.getPriority());
        System.out.println("p2 priority:"+p2.getPriority());
        p1.start();
        p2.start();
    }
}
