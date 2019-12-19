package com.cqc.test;

import java.io.File;

public class HeTest {
    public static void main(String[] args) {
       File file = new File("D:\\abc\\def\\ca");
       file.mkdirs();
       System.out.println(file.exists());
    }
}
