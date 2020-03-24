package com.fly.eshop.learn.algorithms;

/**
 * 数组实现栈
 *
 * @author zhaohuayu
 * @Date 2020/3/23 20:29
 * @since 1.0
 */
public class ArrayStack<T> {

    private Integer length;

    private Integer offset;

    private T[] array;

    public ArrayStack(int count){
        this.length = count;
        array = (T[])new Object[count];
        offset = 0;
    }

    public void push(T element){
        if(offset > length -1){
            return ;
        }else{
            array[offset] = element;
            offset ++;
        }
    }

    public T pop(){
        if(offset > 0){
            T element = array[offset - 1];
            offset --;
            return element;
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(5);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Integer num1 = stack.pop();
        Integer num2 = stack.pop();
        Integer num3 = stack.pop();
        Integer num4 = stack.pop();
        Integer num5 = stack.pop();
        Integer num6 = stack.pop();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }
}
