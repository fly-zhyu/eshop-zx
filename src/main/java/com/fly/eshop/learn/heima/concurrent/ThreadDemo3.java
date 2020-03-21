package com.fly.eshop.learn.heima.concurrent;

import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * concurrentHashmap并发测试
 *
 * @author zhaohuayu
 * @Date 2020/3/18 9:19
 * @since 1.0
 */
public class ThreadDemo3 {
    static ConcurrentMap<String, AtomicInteger> valueMap = new ConcurrentHashMap<>();
    static {
        ValueCache vc = new ValueCache();
        valueMap.put("num", new AtomicInteger(0));
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo3 demo = new ThreadDemo3();
        Thread thread1 = new Thread(() -> demo.test(), "thread1");
        Thread thread2 = new Thread(() -> demo.test(), "thread2");
        Thread thread3 = new Thread(() -> demo.test(), "thread3");
        thread1.start();thread2.start();thread3.start();
        //thread1.join();thread2.join();thread3.join();
        Thread.sleep(3000);
        System.out.println(valueMap.get("num"));
    }
    public void test(){
        for(int i = 1; i <= 300; i++){
            increment(valueMap);
        }
    }
    public void increment(ConcurrentMap<String, AtomicInteger> valueMap){
        valueMap.put("num", new AtomicInteger(valueMap.get("num").incrementAndGet()));
    }
    /*public void decrement(ConcurrentMap<String, ValueCache> valueMap){
        ValueCache valueCache = valueMap.get("num");
        valueCache.setNum(valueCache.getNum() - 1);
    }*/
}
@Data
class ValueCache{
    private AtomicInteger num;
}
