package com.multithreading;

public class Demo {
    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread[] activeThreads = new Thread[system.activeCount()];
        system.enumerate(activeThreads);
        for (Thread thread : activeThreads) {
            System.out.println(thread.getName() + "....." + thread.isDaemon());
        }

    }
}
