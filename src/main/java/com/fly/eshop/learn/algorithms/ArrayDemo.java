package com.fly.eshop.learn.algorithms;

import org.apache.ibatis.reflection.ArrayUtil;

import java.util.Arrays;

/**
 * 说明
 *
 * @author zhaohuayu
 * @Date 2020/3/18 19:45
 * @since 1.0
 */
public class ArrayDemo {
    public static void main(String[] args) {
        /*ArrayDemo arrayDemo = new ArrayDemo();
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = arrayDemo.removeDuplicates(arr, 0);
        System.out.println(i);
        System.out.println(Arrays.toString(arr));*/
        boolean[] arr = new boolean[5];
        //arr[0] = 1;
        System.out.println(Arrays.toString(arr));
    }

    public int removeDuplicates(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }
}
