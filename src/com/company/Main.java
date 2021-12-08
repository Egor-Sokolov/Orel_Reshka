package com.company;


import java.io.*;


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

        long quantityOrel = 0;
        long quantityReshka = 0;

        for(long i = 0; i < quantityAttempt; i++){
            if(Math.random() < 0.5) {
                quantityReshka++;
            } else quantityOrel++;

        }
       double probabilityOrel =(double) quantityOrel/quantityAttempt;
        double probabilityReshka = (double) quantityReshka/quantityAttempt;
        String formattedDoubleOrel = String.format("%.2f", probabilityOrel);
        String formattedDoubleReshka = String.format("%.2f", probabilityReshka);


        System.out.println((quantityOrel + quantityReshka)  + " - Количество бросков ");
        System.out.println(quantityOrel +" - Количество Орлов. " +  "Фактическая вероятность " + formattedDoubleOrel);
        System.out.println(quantityReshka +" - Количество Решек. "  +  "Фактическая вероятность " + formattedDoubleReshka);
    }


}
