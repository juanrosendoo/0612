package QuestoesLista.LampadaMain;

import java.util.Scanner;

public class Lampada {

    private String tipo;
    private boolean status=false;

    Scanner sc=new Scanner(System.in);

    public void escolheTipo(){
        int op=10;
        
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

    public String mudar(){
        if(this.status){
            this.status=false;
            return "acesa!"; 
        }
        else{
            this.status=true;
            return "apagada!";
        }
    }
    
    public void ligaDesliga(){
        while(true){
            char acao;

            System.out.println("Sua lâmpada "+this.tipo+" está "+this.mudar());
            System.out.println("0- Apagar");
            System.out.println("1- Ascender");
            System.out.println("S- Sair");
            System.out.println("Escolha a acao desejada:");
            acao=sc.next().charAt(0);

            switch(acao){
                case '0':
                    if(this.status==true){
                        this.mudar();
                    }
                    break;
                case '1':
                    if(this.status==false){
                        this.mudar();
                    }
                    break;
                case 'S':
                    return;
                default:
                    System.out.println("Opcao invalida!");
                    this.mudar();
            }
        }
    }
}