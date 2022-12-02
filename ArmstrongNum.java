package com.JavaLab;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num, count = 0, result = 0, mul = 1;
        int cnt, rem, q;
        System.out .println("enter a number to check whether num is Armstrong or not");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        q = num;
        while (q != 0) {
            q = q / 10;
            count++;
        }
        System.out.println("count is "+ count);
        cnt = count;
        q=num;
        while(q != 0) {
            rem = q % 10;
            while(cnt != 0 ){
                mul = mul * rem ;
                cnt--;
            }
            result = result + mul ;
            cnt = count ;
            q = q / 10 ;
            mul = 1 ;
        }

        if(result == num)
            System.out.println("ArmstrongNum");
        else
            System.out.println("not an ArmstrongNum");
    }
}
