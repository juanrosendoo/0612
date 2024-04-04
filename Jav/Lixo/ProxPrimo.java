package Jav.Lixo;

import java.util.Scanner;

public class ProxPrimo {

    static int proximoPrimo(int x){
        while(true){
            x++;
            int y=x;
            int z=0;
            
            while(y>0){
    
                if(x%y==0){
                    z++;
                }
                y--;
            }
        
            if(z==2){
                return x;
            }
            else{
                continue;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Digite um numero:");
        a=sc.nextInt();

        System.out.println("O próximo primo é: " + proximoPrimo(a));

        sc.close();
    }
}