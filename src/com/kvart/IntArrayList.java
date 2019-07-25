package com.kvart;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] arr = new int[10];
    private int size = 0;

    @Override
    public void add(int element) {
        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[size] = element;
        size++;
    }

    @Override
    public boolean add(int index, int element) {
        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        System.arraycopy(arr, index - 1, arr, index, arr.length - index);
        arr[index - 1] = element;
        size++;
        return true;
    }

    @Override
    public void clear() {
        arr = new int[10];
        size = 0;
    }

    @Override
    public int get(int index) {
        return arr[index - 1];
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(int index) {
        try {
            System.arraycopy(arr, index, arr, index - 1, arr.length - index);
            arr[size - 1] = 0;
            size--;
        } catch (Exception e) {
            System.out.println("Такого елемента не существует");
        }
        return true;
    }

    @Override
    public boolean removeByValue(int value) {
        for (int i = 0; i < size; i++)
            if (arr[i] == value) {
                try {
                System.arraycopy(arr, i + 1, arr, i, arr.length - i - 1);
                arr[size - 1] = 0;
                size--;
                } catch (Exception e) {
                    System.out.println("Такого елемента не существует");
                }
            }
        return true;
    }

    @Override
    public boolean set(int index, int element) {
        arr[index - 1] = element;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        IntList intList = new IntArrayList();
        for (int i = fromIndex - 1; i < toIndex; i++) {
            intList.add(arr[i]);
        }
        return intList;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        System.arraycopy(arr, 0, result, 0, size);
        return result;
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "arr=" + Arrays.toString(toArray()) +
                '}';
    }
}
