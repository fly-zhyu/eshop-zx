package com.fly.eshop.learn.algorithms;

import java.util.ArrayList;

/**
 * 数组实现队列(一次性队列版本)
 *
 * @author zhaohuayu
 * @Date 2020/3/24 15:52
 * @since 1.0
 */
public class ArrayQueue<T> {
    private T[] array;
    //queue容量
    private Integer capacity;
    //头指针
    private Integer head;
    //尾指针
    private Integer tail;

    public ArrayQueue(Integer capacity){
        this.array =  (T[])new Object[capacity];
        this.capacity = capacity;
        this.head = 0;
        this.tail = 0;
    }

    public boolean enqueue(T element){
        if(tail == capacity){
            return false;
        }
        array[tail] = element;
        tail ++;
        return true;
    }

    public T dequeue(){
        if(head == tail){
            return null;
        }
        T result = array[head];
        head ++ ;
        return result;
    }


    public static void main(String[] args) {
        ArrayQueue<Integer> integerArrayQueue = new ArrayQueue<>(5);
        integerArrayQueue.enqueue(95);
        integerArrayQueue.enqueue(96);
        integerArrayQueue.enqueue(97);
        integerArrayQueue.enqueue(98);
        integerArrayQueue.enqueue(99);
        integerArrayQueue.enqueue(100);
        System.out.println(integerArrayQueue.dequeue());
        System.out.println(integerArrayQueue.dequeue());
        System.out.println(integerArrayQueue.dequeue());
        System.out.println(integerArrayQueue.dequeue());
        System.out.println(integerArrayQueue.dequeue());
        System.out.println(integerArrayQueue.dequeue());
        System.out.println(integerArrayQueue.dequeue());

    }
}
