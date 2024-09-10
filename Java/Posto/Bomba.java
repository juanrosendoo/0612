public class Bomba {
    private String [] operacoes = new String[200];
    private int opAtual= 0;
       
    public void logBomba(float x, String placa){
        operacoes[opAtual] = ("Abastecimento no valor de: " + x + "litros no veiculo com placa: " + placa);
        opAtual++;
    }

    public void getLogBomba(){
        for(int i = 0; i<opAtual; i++)
            System.out.println("Log numero: " + i+1 + " " + this.operacoes[i]);
    }
}