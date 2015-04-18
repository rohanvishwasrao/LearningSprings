package com.rohan.www.mywebapp;

/**
 * Created by rvishwasrao on 4/18/15.
 */
public class MathOperations {

    private MathOperations ops;


//    MathOperations(MathOperations operations)
//    {
//        this.ops = operations;
//    }

    public < N extends Integer> Integer addOperations(N val1, N val2)
    {
        //N result = val1 + val2;
        return val1.intValue() + val2.intValue();
    }

    public < N extends Integer> Integer multiplyOperations(N val1, N val2)
    {
        return val1.intValue() * val2.intValue();
    }

}
