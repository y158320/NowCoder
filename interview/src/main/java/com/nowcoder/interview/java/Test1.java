package com.nowcoder.interview.java;

import org.junit.Test;

public class Test1 {

    int a(int tab){
        int n=tab-1;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        return n;
    }

    @Test
    public void say()
    {
        System.out.println(a(666));
    }

}
