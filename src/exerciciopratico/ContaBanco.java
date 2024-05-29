package exerciciopratico;
//Atributo
public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("-------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status " + this.getStatus());
		System.out.println("-------------------");
	}
	

//Métodos personalizados
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.saldo = 50;
			//this.setSaldo(50)
		}else if(t == "CP"){
			this.saldo = 150;
			//this.setSaldo(150)
		}
		System.out.println("Conta aberta com Sucesso!");
	}
	public void fecharConta() {
		if (this.saldo > 0 ) {
			System.out.println("Tem dinheiro na conta");
		}else if (this.saldo < 0){
			System.out.println("Conta em débido");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com Sucesso!");
		}
	}
	public void depositar(float v) {
		if (status == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta "
					+ "de " + this.getDono());
		}else {
			System.out.println("IMpossivel depositar");
		}
	}
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.saldo >= v) {
				this.setSaldo (this.getSaldo() - v);
				System.out.println("Saldo realizado na conta "
						+ "de " + this.getDono() );
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Conta não está aberta");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if( this.getTipo() == "CC") {
			v = 12;
		}else if(this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			if (saldo > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Pago com Sucesso!");
			}else {
				System.out.println(("Saldo Insuficiente"));
			}
		}else {
			System.out.println("Não é possivel pagar");
		}
	}

	//Método Especial
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
		// this.setSalto(0);
		//this.setStatus(false);
	}
	
	
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setTipo(String t) {
		tipo = t;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public String getDono() {
		return this.dono;
	}
	public void setSaldo(float s) {
		saldo = s;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setStatus(boolean st) {
		status = st;
	}
	public boolean getStatus() {
		return this.status;
	}
}

	
	