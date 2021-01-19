package com.cg.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @create 2021-01-18 22:53
 */
public class TemplatesTest {

    //1. main    psvm
    public static void main(String[] args) {
        
        // 2.  sout  soutp(形参)   soutm(方法)   soutv(变量)   XXX.sout
        System.out.println("hi");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num = 0;
        System.out.println("num = " + num);
        System.out.println(num);
        
        //3. fori   iter     itar
        String[] arr = new String[]{"yi","er","san"};
        for (int i = 0; i < arr.length; i++) {

        }
        for (String s : arr) {

        }
        for (int i = 0; i < arr.length; i++) {

        }

        //4 list.for   list.fori   list.forr(倒序)
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        // 5. ifn(是否为空)   inn(不为空)   XXX.nn   xxx.null
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }




    }

    //6. prsf
    private static final Customer cust = new Customer();

    //7. psf
    public static final int number = 1;
    //psfi
    public static final int number2 = 2;
    //psfs
    public static final String nation = "china";

}
