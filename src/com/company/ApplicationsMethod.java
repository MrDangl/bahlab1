package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ApplicationsMethod {
    public ArrayList<Double> buffer1 = new ArrayList<>();
    public ArrayList<Double> buffer2 = new ArrayList<>();
    public int count =0;
    int buff2count = 0;
    int buff1count =0;
    private int generatenumb()
    {
        Random rand = new Random();
        int temp;
        temp = 1+rand.nextInt(49);
        return temp;
    }
    public synchronized void Add()
    {
        while(buffer1.size() >= 3){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer1.add((double) 1/generatenumb());
        buff1count++;
            System.out.println("Поток 1 сгенерированно число " + (buff1count) + " с значением " + buffer1.get(buffer1.size()-1));
            notify();
    }
    public synchronized void Transfer()
    {
        while (buffer1.isEmpty()|| buffer2.size()>=3)
        {
            try {
                wait();
            } catch (InterruptedException e)
            {e.printStackTrace();
                System.out.println("wrf");
            }
        }
        buffer2.add(Math.sqrt(buffer1.get(buffer1.size()-1)));
        buffer1.remove(buffer1.size()-1);
        buff2count++;
        System.out.println("Поток 2 число " +(buff1count - buffer2.size()+1) + " переведенно в буффер 2 с значением " +buffer2.get(buffer2.size()-1)+" под номером "+ (buffer2.size()));
        notify();
    }
    //Метод для работы с 3 потоком
    public synchronized void Print()
    {
        double temp;//временная переменная для хранения значения функции 1/х
        while (buffer2.isEmpty())
        {
            try{
                wait();
            } catch (InterruptedException e){e.printStackTrace();}
        }
        temp = 1/buffer2.get(0);
        System.out.println("Поток 3 число "+ (buff2count-buffer2.size()+1) + " выведенно на экран со значением " + temp);
        buffer2.remove(0);
        notify();
    }
}
