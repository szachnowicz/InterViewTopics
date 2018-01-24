package com.szachnowicz.threadSafety;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SomeTestsTest {


    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);// false
        System.out.println("s1 == s2 is:" + s1.equals(s2));//true

    }


    @Test
    void test2() {
        String s3 = "JournalDev";
        int start = 1;
        char end = 5;
        System.out.println(start + end); // 6
        System.out.println(s3.substring(start, end)); // ourna
    }

    @Test
    void test3() {
        HashSet shortSet = new HashSet();
        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }
        System.out.println(shortSet.size());
    }

    @Test
    void test4() {
        try {
            boolean flag=true;
            if (flag) {
                while (true) {
                }
            } else {
                System.exit(1);
            }
        } finally {
            System.out.println("In Finally");
        }

    }

    @Test
    void test5() {
        String str = null;
        String str1="abc";
        System.out.println(str1.equals("abc") || str.equals(null));

    }

    @Test
    void test7() {
        try {
            throw new IOException("Hello");
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void test6() {
        String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.print(x);

    }

    @Test
    void test8() {

        int x = 10*10-10;

        System.out.println(x);
    }
}