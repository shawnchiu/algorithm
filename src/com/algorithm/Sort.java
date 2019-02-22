package com.algorithm;

/**
 * @author shawnchiu
 * @date 2019/2/22
 */
public class Sort {

    /**
     * 冒泡排序
     *
     * @param array
     */
    public static void sortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
