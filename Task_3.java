/*
 * Заполнить список названиями планет Солнечной системы в
 * произвольном порядке с повторениями. Вывести название
 * каждой планеты и количество его повторений в списке.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<String> list_planet = new ArrayList<>(Arrays.asList("Меркурий",
        "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"));
        random_planet_list(list_planet, 30);

    }


    static void random_planet_list(List<String> list, int size) {
        List<String> random_planet = new ArrayList<>(size);
        List<Integer> number_planet = new ArrayList<>(list.size());
        int index;
        int count = 0;
        for (int i = 0; i < size; i++) {
            index = (int) (8 * Math.random());
            random_planet.add(list.get(index));
        }
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < size; j++) {
                if (list.get(i).equals(random_planet.get(j))) {
                    count++;
                }
            }
            number_planet.add(i, count);
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Планета " + list.get(i) + " встречается " + number_planet.get(i) + " раз(а).");
        }
    }
}
