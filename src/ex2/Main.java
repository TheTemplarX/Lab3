package ex2;

public class Main {
    public static void main(String[] args){
        boolean condition = false;
        int[] numere = {0, 2, 4, 13, 19, 22, 21, 42, 5};
        for(int i = 0; i < numere.length; i++){
            if(numere[i] == 0 || numere[i] == 1)
                continue;
            for(int j = 2; j <= numere[i]/2; j++){
                if(numere[i] % j == 0){
                    condition = true;
                    break;
                }
            }
            if(!condition)
                System.out.println(numere[i]);
            condition = false;
        }
    }
}
