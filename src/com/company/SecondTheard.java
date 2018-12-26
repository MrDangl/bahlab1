package com.company;

public class SecondTheard extends Thread {
    ApplicationsMethod method = null;
    //Конструктор в котором задается ссылка на класс application method
    public SecondTheard(ApplicationsMethod method)
    {
        this.method = method;
    }
    @Override
    public void run()
    {
        while (method.count<50 ||!method.buffer1.isEmpty())
        {
            method.Transfer();
        }
    }
}
