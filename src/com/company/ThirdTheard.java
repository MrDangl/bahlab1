package com.company;

import java.lang.reflect.Method;

public class ThirdTheard extends  Thread {
    ApplicationsMethod method = null;
    //Конструктор в котором задается ссылка на класс application method
    public ThirdTheard(ApplicationsMethod method)
    {
        this.method = method;
    }
    @Override
    public void run()
    {
        while (!method.buffer2.isEmpty()||method.count<50)
        {method.Print();}
    }
}
