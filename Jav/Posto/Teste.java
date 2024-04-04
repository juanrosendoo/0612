public class Teste{
	public static void main(String args[]){
		Bomba b1 = new Bomba();
		Bomba b2 = new Bomba();
		Bomba b3 = new Bomba();
		Bomba b4 = new Bomba();
		Bomba b5 = new Bomba();
		Bomba bombasPosto1[] = new Bomba[5];
		bombasPosto1[0] = b1;
		bombasPosto1[1] = b2;
		bombasPosto1[2] = b3;
		bombasPosto1[3] = b4;
		bombasPosto1[4] = b5;
		PostoDeCombustivel Posto1 = new PostoDeCombustivel(500, bombasPosto1, 0);
		Pessoa ana = new Pessoa("Ana", "321", "123");
		Veiculo carro1 = new Veiculo(100, "ABCSEX0", ana, 50, 10);
		carro1.acelerarCarro();
		carro1.acelerarCarro();
		carro1.abastecer(Posto1, 35);
		carro1.acelerarCarro();
		carro1.acelerarCarro();
		carro1.acelerarCarro();
		carro1.acelerarCarro();
	}
}