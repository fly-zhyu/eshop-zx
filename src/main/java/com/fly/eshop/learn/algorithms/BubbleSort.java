package com.fly.eshop.learn.algorithms;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author zhaohuayu
 * @Date 2020/3/25 16:50
 * @since 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{4,5,6,3,2,1,13,22,34,13,79,34,23,54,2};
        int[] sort = new BubbleSort().sort(array);
        System.out.println(Arrays.toString(sort));
    }

    public int[] sort(int[] array){
        if(array.length == 1){
            return array;
        }
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

}
