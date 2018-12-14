package com.company;

import java.util.Random;

public class ApplicationsMethod {
    Random rand = new Random();
    int temp;
    public double changenumb(int i)
    {
        return 1/i;
    }
    public double changenumb (double i)
    {
        return 1/i;
    }
    public int generatenumb()
    {
        temp = 1+rand.nextInt(49);
        return temp;
    }
}
