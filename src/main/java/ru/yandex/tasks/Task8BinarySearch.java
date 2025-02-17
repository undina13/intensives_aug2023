package ru.yandex.tasks;

public class Task8BinarySearch {
    public static int find(int number, int[] sortedList) {
        int index = -1;
 int low = 0;
 int high = sortedList.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedList[mid] < number) {
                low = mid + 1;
            } else if (sortedList[mid] > number) {
                high = mid - 1;
            } else if (sortedList[mid] == number) {
                index = mid;
                break;
            }
        }
        return index;
        /*
         * number: целое число, -10^5 <= number <= 10^5
         * numbers: массив целых чисел, 0 <= numbers.length <= 10^5 (числа не повторяются)
         * Выход: i, где numbers[i] = number, -1, если такого i нет
         * Если таких i несколько, вывести наибольший
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

    }

    public static void selfCheck() {
        int[] input = {1, 3, 5, 7, 9};

        for (int i = 0; i < input.length; i++) {
            assert (find(input[i], input) == i);
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 5, 7, 9};
        System.out.println(find(3, input));
    }
}
