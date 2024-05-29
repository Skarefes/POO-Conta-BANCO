package exerciciopratico;

public class ExercicioPratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco p1 = new ContaBanco();
		
		p1.setNumConta(1134);
		p1.setDono("Wander");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.sacar(150);
		p1.fecharConta();
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(4521);
		p2.setDono("Megan");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(650);
		p2.fecharConta();
		p2.estadoAtual();
		
		
		
	}

}
