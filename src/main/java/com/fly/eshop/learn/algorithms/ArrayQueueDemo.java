package com.fly.eshop.learn.algorithms;

/**
 * 数组实现队列
 *
 * @author zhaohuayu
 * @Date 2020/3/24 16:11
 * @since 1.0
 */
public class ArrayQueueDemo<T> {
    private T[] array;
    //queue容量
    private Integer capacity;
    //头指针
    private Integer head;
    //尾指针
    private Integer tail;

    public ArrayQueueDemo(Integer capacity){
        this.array =  (T[])new Object[capacity];
        this.capacity = capacity;
        this.head = 0;
        this.tail = 0;
    }

    public boolean enqueue(T element){
        if(tail == capacity){
            if(head == 0){
                //真的满了
                return false;
            }
            for(int i = head; i < tail; i ++){
                array[i - head] = array[i];
            }
            tail = tail - head;
            head = 0;
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
        ArrayQueueDemo<Integer> queueDemo = new ArrayQueueDemo<>(5);
        queueDemo.enqueue(95);
        queueDemo.enqueue(96);
        queueDemo.enqueue(97);
        System.out.println(queueDemo.dequeue());
        queueDemo.enqueue(98);
        queueDemo.enqueue(99);
        System.out.println(queueDemo.dequeue());
        queueDemo.enqueue(100);
        System.out.println(queueDemo.dequeue());
        queueDemo.enqueue(101);
        System.out.println(queueDemo.dequeue());
        queueDemo.enqueue(102);
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
    }
}
