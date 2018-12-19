package com.company;

import java.util.ArrayList;

/*
Created by Gleb Danilov
    7.	Значения констант и реализуемые потоками функции:
    o	N=3
    o	Первый поток - генерирует в первый буфер 50 чисел из ряда 1/х, где х при-нимает значения от 1 до 50.
    o	Второй поток - извлекает числа из первого буфера, начиная с последнего в буфере, извлекает из него корень и помещает его во второй буфер.
    o	Третий поток - извлекает из второго буфера первое число, вычисляет значе-ние функции 1/х, где х - извлечённое число, и выводит это значение на экран. Третий по-ток завершает своё выполнение по окончании чисел во втором буфере.

*/
public class Main {
     static ApplicationsMethod method = new ApplicationsMethod();
    public static FirstThread firstThread = new FirstThread(method);
    public static SecondTheard secondTheard = new SecondTheard(method);
    public static ThirdTheard thirdTheard = new ThirdTheard(method);
    public static void main(String[] args)
    {
        firstThread.start();
        secondTheard.start();
        thirdTheard.start();
        try {
            firstThread.join();
            secondTheard.join();
            thirdTheard.join();

        } catch (InterruptedException e)
        {e.printStackTrace();
        }
	// write your code here
    }
}
