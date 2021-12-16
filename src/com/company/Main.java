package com.company;


import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Input a number: ");

        String name = null; //читаем строку с клавиатуры
        try {
            name = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert name != null;
        long quantityAttempt = Long.parseLong(name);
        ArrayList <Integer> basketCoins = new ArrayList<>();

        long quantityOrel = 0;
        long quantityReshka = 0;

        for (long i = 0; i < quantityAttempt; i++) {
            if (Math.random() < 0.5) {
                quantityReshka++;
                basketCoins.add(0);
            } else {
                quantityOrel++;
                basketCoins.add(1);
            }
        }
        double probabilityOrel = (double) quantityOrel / quantityAttempt;
        double probabilityReshka = (double) quantityReshka / quantityAttempt;
        String formattedDoubleOrel = String.format("%.2f", probabilityOrel);
        String formattedDoubleReshka = String.format("%.2f", probabilityReshka);
        int count = 1;
        int max = 1;
        int maxCoin = 1;
        for (int i = 0; i < basketCoins.size() - 1; i++) {
            if (basketCoins.get(i).equals(basketCoins.get(i + 1))) {
                count++;

                if (max < count) {
                    max = count;
                    maxCoin = i;
                }
            } else
                count = 1;
        }


            System.out.println("Массив");
            System.out.println(basketCoins);
            System.out.println((quantityOrel + quantityReshka) + " - Количество бросков ");
            System.out.println(quantityOrel + " - Количество Орлов. " + "Фактическая вероятность " + formattedDoubleOrel);
            System.out.println(quantityReshka + " - Количество Решек. " + "Фактическая вероятность " + formattedDoubleReshka);
            System.out.println(max +" - Самая длинная последовательность одинаковых результатов");

            if(maxCoin == 0){
                System.out.println("Самая длинная последовательность состоит из решек");
            } else {
                System.out.println("Самая длинная последовательность состоит из орлов");
            }





        }


    }

