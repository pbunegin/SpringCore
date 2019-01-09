package org.shop.myAnnotation;

public class TestInjectRandomInt {
    @InjectRandomInt(max = 2, min = 10)
    private int testRandInt;

    public int initAndGetTestRandomInt(){
        return testRandInt;
    }
}
