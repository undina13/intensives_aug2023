package ru.yandex.tasks;

import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        Stack<String>stack = new Stack<>();
        for (int i = 0; i < sequence.length(); i++) {
            String s = sequence.substring(i, i + 1);
            if(s.equals("(")||s.equals("[")||s.equals("{")){
                stack.push(s);
            }
            else {
                if(stack.empty()){
                    return false;
                }
                if(s.equals(")") &&!stack.pop().equals("(") ||s.equals("]") &&!stack.pop().equals("[")||
                        s.equals("}") &&!stack.pop().equals("{")){
                    return false;
                }
            }
        }
        if(!stack.empty()){
            return  false;
        }
        return true;
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }

    public static void main(String[] args) {
        System.out.println(checkBalance("[({})]{[]}"));
        System.out.println(checkBalance("{({})}{"));
    }
}
