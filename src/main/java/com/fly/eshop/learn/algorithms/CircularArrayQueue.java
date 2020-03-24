package com.fly.eshop.learn.algorithms;

/**
 * 环形数组队列
 * 环形队列会浪费一个数组空间
 * head=tail   队列为空
 * (tail + 1) % capacity = head  队列满
 *
 * @author zhaohuayu
 * @Date 2020/3/24 16:43
 * @since 1.0
 */
public class CircularArrayQueue<T> {

    private T[] array;
    //queue容量
    private Integer capacity;
    //头指针
    private Integer head;
    //尾指针
    private Integer tail;

    public CircularArrayQueue(Integer capacity){
        this.array =  (T[])new Object[capacity];
        this.capacity = capacity;
        this.head = 0;
        this.tail = 0;
    }

    public boolean enqueue(T element){
        if((tail + 1) % capacity ==  head){
            return false;
        }
        array[tail] = element;
        tail = (tail + 1) % capacity;
        return true;
    }

    public T dequeue(){
        if(head == tail){
           return null;
        }
        T result = array[head];
        head = (head + 1) % capacity ;
        return result;
    }

    public static void main(String[] args) {
        CircularArrayQueue<Integer> queue = new CircularArrayQueue<>(5);
        System.out.println(queue.enqueue(85));
        System.out.println(queue.enqueue(86));
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue(87));
        System.out.println(queue.enqueue(88));
        System.out.println(queue.enqueue(89));
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue(90));
        System.out.println(queue.enqueue(91));
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue(92));
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue(93));
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue(94));
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue(95));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
