/*
 * Задан целочисленный список ArrayList. Найти минимальное,
 * максимальное и среднее арифметическое из этого списка.
 * Collections.max()
 */

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list1 = createList(10, 0, 20);
        System.out.println(list1);
        System.out.println(findMin(list1));
        System.out.println(findMax(list1));
        System.out.println(arithmeticMean(list1));
        
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static int findMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    static double arithmeticMean(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double arithmetic = (double) sum / list.size();
        return arithmetic;
    }

}
