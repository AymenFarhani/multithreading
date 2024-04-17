package com.multithreading;

public class Multithreading {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup I");
        System.out.println(threadGroup.getName());
        System.out.println(threadGroup.getParent().getName());
        System.out.println(threadGroup.getMaxPriority());
    }
}
