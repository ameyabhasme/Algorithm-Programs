package com.bridgelabz.permutation;

import java.util.Scanner;

public class Permutation {

	static final Scanner SC = new Scanner(System.in);

    private static void permute(String str, int start, int last) {
        if(start==last-1){
            System.out.println(str);
        }else {
            for (int i=start;i<last;i++){
                str = Stringswap(str,start,i);
                permute(str,start+1,last);
                str = Stringswap(str,start,i);
            }
        }
    }
    
    public static String Stringswap(String string, int i, int j) {
        char temp;
        char[] charArray = string.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    public static void main(String[] args) {
    	System.out.println("Enter the string: ");
    	String str = SC.next();
    	permute(str, 0, str.length());
    }


}
