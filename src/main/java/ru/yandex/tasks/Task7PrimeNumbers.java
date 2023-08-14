package ru.yandex.tasks;

import java.util.*;

public class Task7PrimeNumbers {
    public static int[] findPrimes (int N) {
        Set<Integer> res = new TreeSet<>();
        for (int i = 2; i <=N ; i++) {
            res.add(i);
        }
        int sq = (int) Math.sqrt(N) + 1;
        for (int i = 2; i < sq; i++) {
            for (int j = i+1; j <N/i ; j++) {
                res.remove(i*j);
            }
        }
//        for (int i = 2; i < sq; i++) {
//            for (int j = i + 1; j <= N; j++) {
//                if(j%i ==0){
//                    res.remove(j);
//                }
//            }
      //  }

        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        return res.stream().mapToInt(Integer::intValue).peek(value -> System.out.print(value + " ")).toArray();
    }



    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }

    public static void main(String[] args) {
findPrimes(25);
    }
}
