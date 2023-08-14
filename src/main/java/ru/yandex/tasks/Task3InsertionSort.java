package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        for (int j = 1; j < numbers.size(); j++) {
            int current = numbers.get(j);
            int i = j-1;
            while ((i > -1) && (numbers.get(i) > current)) {
                numbers.set(i+1, numbers.get(i));
                i--;
            }
             numbers.set(i+1, current);
        }
        System.out.println(numbers);
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой вставками!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }

    public static void main(String[] args) {
        sort(new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1)));
        selfCheck();
    }
}
