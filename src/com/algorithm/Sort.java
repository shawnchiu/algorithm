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
                    swap(array, i, j);
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param array
     */
    public static void sortSelection(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            if (i != index) {
                swap(array, i, index);
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
