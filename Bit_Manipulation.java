package com.company;
import java.util.*;
import java.util.Scanner;
public class Bit_Man {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
//        oper=1 : set oper=0 : clear
        int n=5; //0101 -> 0111 -> In decimal-7
        int pos = 1;
        //int bitMask = 1<<pos;
        //int notBitMask = ~(bitMask); // For operation 3

// Operation 1.Get Bit
//        if((bitMask & n)==0){
//            System.out.println("Bit was zero");
//        }
//        else{
//            System.out.println("Bit was one");
//        }
// Operation 2. Set Bit
//        int newNum = bitMask | n;
//        System.out.println(newNum);

//Operation 3. Clear Bit
//        int newNum = notBitMask & n;
//        System.out.println(newNum);

// Operation 4. Update Bit
        int bitMask = 1<<pos;
        if(oper==1){
            // Set
            int newNum = bitMask | n;
            System.out.println(newNum);
        }
        else {
            //Clear
            int newBitMask = ~(bitMask);
            int newNum = newBitMask & n;
            System.out.println(newNum);
        }
    }
}
