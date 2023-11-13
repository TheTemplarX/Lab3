package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Cuvantul: ");
        String cuv = myObj.next();
        StringBuilder palindrom = new StringBuilder(cuv);
        palindrom.reverse();
        if(cuv.contentEquals(palindrom))
            System.out.print("Cuvantul " + cuv + " este palindrom");
        else
            System.out.print("Cuvantul " + cuv + " nu este palindrom");
    }
}
