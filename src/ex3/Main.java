package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int nr1 = 0, nr2 = 1, nr3;
        Scanner myObj = new Scanner(System.in);
        System.out.print("N = ");
        int N = myObj.nextInt();
        System.out.print(nr1 + " " + nr2 + " ");

        for(int i = 2; i < N; i++){
            nr3 = nr1 + nr2;
            System.out.print(nr3 + " ");
            nr1 = nr2;
            nr2 = nr3;
        }
    }
}
