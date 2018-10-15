package com.cfs.NPalindromes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x-- > 0){
            int a = sc.nextInt();
            for(int i = 0; i < a; i++){
                System.out.print((char)('a' + i % 26));
            }
            System.out.println();
        }
    }
}
