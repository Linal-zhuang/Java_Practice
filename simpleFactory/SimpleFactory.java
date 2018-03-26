package com.example.simpleFactory;

/**
 * Created by ZLX on 2018/3/23.
 */

public class SimpleFactory {

    public static Human makeHuman(String sex) {
        if (sex.equals("man")) {
            Human man = new Man();
            return man;
        } else if (sex.equals("woman")) {
            Human woman = new Woman();
            return woman;
        } else {
            System.out.print("make Human Failed.\n");
            return null;
        }
    }
}
