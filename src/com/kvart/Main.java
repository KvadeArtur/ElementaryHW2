package com.kvart;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IntList intList = new IntArrayList();

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        System.out.println("Обьект с добавленными елементами: \n" + intList);

        intList.add(2, 5);
        System.out.println("Обьект с добавленными елементами по индексу: \n" + intList);

        System.out.println("Обьект с вырезанными елементами по индексам: \n" + intList.subList(2, 4));

        System.out.println("Елемент обьекта по индексу: " + intList.get(2));

        intList.remove(2);
        System.out.println("Обьект с удаленным елементом по индексу: \n" + intList);

        intList.removeByValue(30);
        System.out.println("Обьект с удаленным елементом по значению: \n" + intList);

        intList.set(2, 25);
        System.out.println("Обьект с замененным елементом: \n" + intList);

        System.out.println("Длина обьекта: " + intList.size());

        System.out.println("Обьект пустой: " + intList.isEmpty());

        intList.clear();
        System.out.println("Очищенный обьект: \n" + intList);

        System.out.println("Обьект пустой: " + intList.isEmpty());

        System.out.println("Пытаемся удалить не существующий елемент: ");
        intList.remove(2);

    }
}
