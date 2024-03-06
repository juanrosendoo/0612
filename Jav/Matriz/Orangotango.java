import java.util.Scanner;

public class Orangotango {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Matriz garrafa = new Matriz();

        int a, b, op=10;

        System.out.println("Escolha as dimensões da matriz aleatória a ser gerada:");
        a=sc.nextInt();
        String c= sc.nextLine();
        b=sc.nextInt();

        garrafa.iniciaMatriz(a, b);

        while(op!=0){
            System.out.println("1- Imprimir matriz");
            System.out.println("2- Transposta da matriz");
            System.out.println("3- Diagonal secundária da matriz, se quadrada");
            System.out.println("0- Sair");
            System.out.println("Escolha a operação desejada:");
            
            while(true){
                op=sc.nextInt();
                switch(op){
                    case 0: 
                    System.out.println("Programa encerrado");
                    return;
                    
                    case 1: 
                    garrafa.imprimeMatriz();
                    break;

                    case 2: 
                    garrafa.transpostaMatriz();
                    break;

                    case 3: 
                    garrafa.diagonalSecMatriz();
                    break;

                    default:
                    System.out.println("Digite uma opcao valida");
                    continue;
                }
                break;
            }
        }
        sc.close();
    }
}