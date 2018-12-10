package com.company;



public class Buffer
{
    public  Buffer(int n)
    {
        buffsize = new double[n];
        this.n=n;
    }
    int n;
    double[] buffsize;

    public void GenerateNumb()
    {
            for (int i = 0; i < n; i++)
            {
                if(buffsize[i]==0)
                {
                buffsize[i] = 1 / (1 + (int) Math.random());
                }
            }
    }
/*    private boolean changenumb()
    {
        //if(buffsize.)
    }
    public double RetBuff()
    {
       // if()
     //return this.buffsize ;

    }*/
}
