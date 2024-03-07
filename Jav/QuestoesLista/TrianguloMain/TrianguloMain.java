package QuestoesLista.TrianguloMain;

public class TrianguloMain {
    public static void main(String[] args) {
        
        float x=3;
        float y=4;
        float z=5;
        
        Triangulo tubarao=new Triangulo(x, y, z);

        if(tubarao.testaTriangulo()){

            System.out.println(tubarao.tipoTriangulo()+" Seu perimetro e: "+tubarao.perimetroTriangulo());
        }
        else{
            System.out.println("Triangulo invalido!");
        }
    }
}