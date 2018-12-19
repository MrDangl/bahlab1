package com.company;

public class FirstThread extends Thread {
    ApplicationsMethod method = null;
    //Конструктор в котором задается ссылка на класс application method
    public FirstThread(ApplicationsMethod method)
    {
        this.method = method;
    }
    @Override
    public void run()
    {
        for(method.count = 0; method.count <50; method.count++)
        {method.Add();
        }
    }

}
