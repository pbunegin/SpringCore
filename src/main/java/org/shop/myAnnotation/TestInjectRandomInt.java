package org.shop.myAnnotation;

public class TestInjectRandomInt {
    @InjectRandomInt(max = 10, min = 2)
    private int testRandInt;

    @Override
    public String toString() {
        return "TestInjectRandomInt{" +
                "testRandInt=" + testRandInt +
                '}';
    }
}