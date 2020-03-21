package com.fly.eshop.learn.heima.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程demo1
 *
 * @author zhaohuayu
 * @Date 2020/3/17 10:07
 * @since 1.0
 */
@Slf4j
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread("线程1") {
            @Override
            public void run() {
                log.info(this.getName() + " 起来了");
            }
        };
        thread1.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log.info(Thread.currentThread().getName() + "实现runnable");
            }
        };
        new Thread(runnable, "线程2").start();

        new Thread(() -> {
            log.info("lambda表达式创建线程3");
        }, "线程3").start();

        FutureTask<ThreadDemo1> task4 = new FutureTask<>(() -> {
            log.info("futureTask方式创建!");
            return new ThreadDemo1();
        });
        new Thread(task4, "线程4").start();

        try {
            task4.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
@Slf4j
class Number{
    public static synchronized void a() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.debug("1");
    }
    public synchronized void b() {
        log.debug("2");
    }

    public static void main(String[] args) {
        Number n1 = new Number();
        new Thread(()->{ n1.a(); }).start();
        new Thread(()->{ n1.b(); }).start();
    }
}
