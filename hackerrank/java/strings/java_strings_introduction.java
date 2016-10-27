//https://www.hackerrank.com/challenges/java-strings-introduction

import java.io.*;
import java.util.*;

public class Solution {
    public static String capitalize(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(String.join(" ", capitalize(A), capitalize(B)));
    }
}