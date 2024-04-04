public class Veiculo {
    private float potencia;
    private String placa;
    private Pessoa proprietario;
    private float capacidadeTanque;
    private float combAtual;
    
    public Veiculo(float pot, String pla, Pessoa prop, float cap, float combAtual ){
        this.potencia=pot;
        this.placa=pla;
        this.proprietario=prop;
        this.capacidadeTanque=cap;
        this.combAtual=combAtual;
    }

    public void abastecer(PostoDeCombustivel a, float x){
        
        if(this.combAtual + x > capacidadeTanque){
            System.out.println("Impossível abastacer, capacidade máxima do tanque excedida");
            return;
        }

        a.abastece(this.placa, x);
        this.combAtual += x;
    }

    public void acelerarCarro(){
        if(combAtual >= this.potencia/10)
        {
            this.combAtual=this.combAtual - this.potencia/10;
            System.out.println("Vrum TANTANTANTAN POW");
            return;
        }
        System.out.println("Sem gasosa para acelerar!");
    }
}