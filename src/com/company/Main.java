package com.company;

public class Main {

    //3.
    // Blimps value er Baffle

    //4.
    // ik
    //rattle
    //ping zoop
    //boo-wa-ha-ha

    //6
    public static void baffle(String blimp) {
        //7
        System.out.println(blimp);
        zippo("ping", -5);
    }
    //2-8
    public static void zippo(String quince, int flag) {
        //3-9
        if (flag < 0) {
            System.out.println(quince + " zoop");
        }
        //4
        else {
            //5
            System.out.println("ik");
            baffle(quince);
            //10
            System.out.println("boo-wa-ha-ha");
        }
    }
    //1
    public static void main(String[] args) {
	// write your code here
        zippo("rattle", 13);
    }
}
