package QuestoesLista.LampadaMain;

import java.util.Scanner;

public class Lampada {

    private String tipo;
    private boolean status;

    public void escolheTipo(){
        int op=10;

        Scanner sc=new Scanner(System.in);
        
        while(op<1||op>3){
            System.out.println("*****TIPOS*****");
            System.out.println("1- LED");
            System.out.println("2- Fluorescente");
            System.out.println("3- Incandescente");
            System.out.println("Escolha o tipo da lampada:");
            op=sc.nextInt();

            switch(op){
                case 1:
                    this.tipo="LED";
                    break;
                case 2:
                    this.tipo="Fluorescente";
                    break;
                case 3:
                    this.tipo="Incandescente";
                    break;
                default:
                System.out.println("Insira uma opcao valida.");
            }
        }
    }
}