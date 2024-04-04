package QuestoesLista;

import java.util.Scanner;

public class Asteriscos{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        
        System.out.println("Insira o número n de linhas para a piramide de asteriscos:");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}