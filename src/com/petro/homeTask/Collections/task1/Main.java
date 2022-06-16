package com.petro.homeTask.Collections.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 Необходимо реализовать алгоритм, который принимает на вход две коллекции
 целых чисел и возвращает отсортированную коллекцию, содержащую общие элементы.
 Пример:
 [6,4,6,8,1,100,-100], [3,8,76544, -42, 100,1]
 Результат:
 [1,8,100]
*/
 public class Main {

    public static void main(String[] args) {
        List<Integer> collection1 = new ArrayList<>();
        List<Integer> collection2 = new ArrayList<>();
        List<Integer> similarList = new ArrayList<>();

        collection1.add(6);
        collection1.add(4);
        collection1.add(6);
        collection1.add(8);
        collection1.add(1);
        collection1.add(100);
        collection1.add(-100);

        collection2.add(3);
        collection2.add(8);
        collection2.add(76554);
        collection2.add(-42);
        collection2.add(100);
        collection2.add(1);

        Collections.sort(collection1);
        Collections.sort(collection2);

        System.out.println(collection1);
        System.out.println(collection2);

        for (int i = 0; i < collection1.size(); i++) {
            for (int j = 0; j < collection2.size(); j++) {
                if (collection1.get(i).equals(collection2.get(j)) == true) {
                    similarList.add(collection1.get(i));
                }
            }
        }
        System.out.println("Результат общих значений");
        System.out.println(similarList);
    }


}


