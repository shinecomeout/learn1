package com.cg.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {



    public static void main(String[] args){
        System.out.println("hello world");


        ArrayList l = new ArrayList();

        l.size();
         l.add(0,12);
        for(int i=0;i<4;i++){
            System.out.println(i);
        }

        new Date();

    }


    public static int test(){

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis2 = new FileInputStream(new File("t"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return 1;
    }
}
