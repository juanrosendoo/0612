import java.util.Random;

public class matriz {

    private int matriz [][];
    private int lin;
    private int col;
    
    public void iniciaMatriz(int x, int y){
        
        Random rand = new Random();

        this.lin=x;
        this.col=y;
        this.matriz=new int[x][y];

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matriz[i][j]=rand.nextInt(101);
            }
        }
    }

    public void imprimeMatriz(){

        for(int i=0; i<this.lin; i++){
            for(int j=0; j<this.col; j++){
                System.out.print("\t" + matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public void transpostaMatriz(){

        for(int i=0; i<this.lin; i++){
            for(int j=0; j<this.col; j++){
                System.out.print("\t" + matriz[j][i]+" ");          
            }
            System.out.print("\n");
        }
    }

    public void diagonalSecMatriz(){
        if(this.lin==this.col){
            
            for(int i=0; i<this.lin; i++){
                for(int j=0; j<this.col; j++){
                    if(i+j==this.lin-1){
                        System.out.print("\t" + matriz[i][j]+" ");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                System.out.print("\n");
            }
        }
        else{
            System.out.println("A matriz nao e quadrada!");
        }
    }
}
