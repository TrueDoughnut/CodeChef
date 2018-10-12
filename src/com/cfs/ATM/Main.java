package com.cfs.ATM;

import java.util.Scanner;

public class Main {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float withdraw = sc.nextFloat();
        float balance = sc.nextFloat();
        if(0 < withdraw && withdraw <= 2000 && 0 < balance && balance <= 2000) {
            if (withdraw % 5 == 0 && balance > (withdraw + 0.50f)) {
                balance = balance - withdraw;
                balance = balance - 0.50f;
            }
        }
        System.out.printf("%.2f", balance);
    }
}