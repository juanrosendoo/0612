package QuestoesLista.DadoMain;

import java.util.Random;

public class Dado {
    private int lados[]; 

    public void inicaliza(){
        this.lados=new int [6];

        for(int i=0; i<6; i++){
            this.lados[i]=i+1;
        }
    }

    public void jogar(){
        Random x = new Random();

        System.out.println("Lado: "+this.lados[x.nextInt(6)]);
    }

    //ADICIONAR PARTE ABAIXO APENAS NA QUESTÃO 29

    public void jogar(int x){
        if(x>=1&&x<=6){
            System.out.println("Lado: "+this.lados[x-1]);
        }
        else{
            System.out.println("Valor inválido");
        }
    }
}