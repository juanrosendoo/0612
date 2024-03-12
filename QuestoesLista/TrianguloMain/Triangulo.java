package QuestoesLista.TrianguloMain;

public class Triangulo {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Triangulo(float a, float b, float c){
        this.ladoA=a;
        this.ladoB=b;
        this.ladoC=c;
    }

    public boolean testaTriangulo(){
        if(this.ladoA+this.ladoB<this.ladoC){
            return false;
        }
        else if(this.ladoB+this.ladoC<this.ladoA){
            return false;
        }
        else if(this.ladoC+this.ladoA<this.ladoB){
            return false;
        }
        else{
            return true;
        }
    }

    public String tipoTriangulo(){
        if((this.ladoA==this.ladoB)&&(this.ladoB==this.ladoC)){
            return"O triangulo e equilatero.";
        }
        else if((this.ladoA==this.ladoB)||(this.ladoB==this.ladoC)||(this.ladoC==this.ladoA)){
            return "O triangulo e isosceles.";
        }
        else{
            return "O triangulo e escaleno.";
        }
    }

    public float perimetroTriangulo(){
        return this.ladoA+this.ladoB+this.ladoC;
    }
}