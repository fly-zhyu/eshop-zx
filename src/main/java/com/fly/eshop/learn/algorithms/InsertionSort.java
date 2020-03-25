package com.fly.eshop.learn.algorithms;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author zhaohuayu
 * @Date 2020/3/25 18:46
 * @since 1.0
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{4,5,6,3,2,1,13,22,34,13,79,34,23,54,2};
        int[] sort = new BubbleSort().sort(array);
        System.out.println(Arrays.toString(sort));
    }

    public int[] sort(int[] array){
        if(array.length == 1){
            return array;
        }
        for(int i = 1; i < array.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(array[j] > array[i]){
                    array[j+1] = array[j];
                }else{
                    array[j+1] = array[i];
                    break;
                }
            }
        }
        return array;
    }
}
