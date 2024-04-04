import java.util.Random;

public class PostoDeCombustivel {
    private float capacidadeTanque;
    private Bomba []bombas=new Bomba[5];
    private float qteCombTanque;

    public PostoDeCombustivel(float capacidadeTanque, Bomba y[], float z){
        this.capacidadeTanque=capacidadeTanque;
        this.bombas=y;
        this.qteCombTanque=z;
    }

    public void refill(){
        this.qteCombTanque = this.capacidadeTanque;
    }

    public void abastece(String placa, float x){
        Random random = new Random();
        int respectivaBomba = random.nextInt(5);
        if(x>this.qteCombTanque){
            System.out.println("Quantidade excede a gasolina atual do posto");
            this.refill();
            System.out.println("Reenchendo O tanque do posto!");
        }
        System.out.println("O carro sera abastecido na bomba de numero: " + respectivaBomba);
        System.out.println("Enchendo o tanque...");
        this.qteCombTanque -= x;
        bombas[respectivaBomba].logBomba(x, placa);
        bombas[respectivaBomba].getLogBomba();
    }

}