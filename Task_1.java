/*
 * Пусть дан произвольный список целых чисел, удалить
 * из него четные числа.
 */

import java.util.ArrayList;
import java.util.List;

 public class Task_1 {

    public static void main(String[] args) {
        List<Integer> list1 = createList(20, 0, 100);
        System.out.println(list1);
        oddNumbers(list1);
        System.out.println(list1);
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static void oddNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
}