package Java;
import java.util.Scanner;

public class Questao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] notas = new int[3][3];
        float [] medias = new float[3];
        boolean recuperacao = false;

        for(int i = 0; i < 3; i++){
            int aux = 0;
            for(int z = 0; z < 3; z++){
                System.out.println("Insira a nota " + (z + 1) + " do aluno " + (i+1) + ": ");
                notas[i][z] = sc.nextInt();
                aux += notas[i][z];
            }
            medias[i] = aux / 3.0f;
        }

        for(int i = 0; i < 3; i++){
            if(medias[i] < 6){
                if(notas[i][2] > notas[i][0] && notas[i][1] > notas[i][0]){
                    notas[i][0] = notas[i][2];
                    recuperacao = true;
                }
                else if(notas[i][2] > notas[i][1] && notas[i][0] > notas[i][1]){
                    notas[i][1] = notas[i][2];
                    recuperacao = true;
                }
                else{
                    System.out.println("Aluno " + (i + 1) + " com média abaixo de 6, porém nota da AV3 foi menor que a nota da AV1 e que a da AV2");
                }
            }
        }

        if(recuperacao){
            for(int i = 0; i < 3; i++){
                int aux = 0;
                for(int z = 0; z < 3; z++){
                    aux += notas[i][z];
                }
                medias[i] = aux / 3.0f;
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("Aluno " + (i + 1) + ":\nMédia: " + (medias[i]));
        
            if(medias[i]>6){
                System.out.printf(" Status: Aprovado\n\n");
            }
            else{
                System.out.printf(" Status: Reprovado\n\n");
            }
        }
        sc.close();   
    }
}