package com;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        List list = new List();
        int size = 10000;
        long milisecondsStart, milisecondsFinish;
        while (size < 30000) {

            milisecondsStart = System.nanoTime();
            for (int i = 0; i < size; i++)
                list.addhowstack(i, (int) (Math.random() * 10));

            milisecondsFinish = System.nanoTime();
            float elapsed = milisecondsFinish - milisecondsStart;
            System.out.println("Сreate " + size + " elements takes: " + elapsed / 1000000 + " milisecons");

            milisecondsStart = System.nanoTime();
            for (int i = 0; i < size; i++)
                list.removeAt(i);
            milisecondsFinish = System.nanoTime();
            elapsed = milisecondsFinish - milisecondsStart;
            System.out.println("Delete " + size + " elements takes: " + elapsed / 1000000 + " milisecons");
            System.out.println();

            size += 5000;
        }

        list.print();
        list.emptylist();
        size = 10000;
        Stack st = new Stack();

        while (size < 30000) {

            milisecondsStart = System.nanoTime();
            for (int i = 0; i < size; i++)
                st.push((int) (Math.random() * 10));

            milisecondsFinish = System.nanoTime();
            float elapsed1 = milisecondsFinish - milisecondsStart;
            System.out.println("Сreate " + size + " elements takes: " + elapsed1 / 1000000 + " milisecons");

            milisecondsStart = System.nanoTime();
            for (int i = 0; i < size; i++)
                st.pop();
            milisecondsFinish = System.nanoTime();
            elapsed1 = milisecondsFinish - milisecondsStart;
            System.out.println("Delete " + size + " elements takes: " + elapsed1 / 1000000 + " milisecons");
            System.out.println();

            size += 5000;
        }
    }
}
