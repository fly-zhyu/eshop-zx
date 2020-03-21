package com.fly.eshop.learn.heima.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 线程demo2
 *
 * @author zhaohuayu
 * @Date 2020/3/17 19:22
 * @since 1.0
 */
@Slf4j
public class ThreadDemo2 {

    public static void main(String[] args) {

        subDemo demo = new subDemo();
        for(int i = 0; i <= 1; i++){
            new Thread(() -> demo.method1(), "线程" + (i+1)).start();
        }
    }

    public void method1(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            method2(list);
            method3(list);
        }
        System.out.println("==================");
        System.out.println("最终结果: " + list);
        System.out.println("==================");
    }

    public void method2(List<Integer> list){
        log.info("method2开始");
        list.add(0);
        log.info("method2结束");
        System.out.println(Thread.currentThread().getName() + "-方法2:" +list);
    }

    public void method3(List<Integer> list){
        log.info("method3开始");
        list.remove(0);
        log.info("method3结束");
        System.out.println(Thread.currentThread().getName() + "-方法3:" +list);
    }

}
@Slf4j
class subDemo extends ThreadDemo2{
    @Override
    public void method3(List<Integer> list) {
        new Thread(() -> {
            log.info("method3开始");
            list.remove(0);
            log.info("method3结束");
            System.out.println(Thread.currentThread().getName() + "-方法3:" +list);
        }).start();
    }
}
