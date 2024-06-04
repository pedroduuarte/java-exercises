package entities;

public class PessoaJuridica extends Contribuinte {

	private int numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	public double calcularImposto() {
		double impostoTotal;
		if (numFuncionarios <= 10) {
			impostoTotal = (getRendaAnual() * 16)/100;
		}
		else {
			impostoTotal = (getRendaAnual() * 14)/100;
		}
		
		return impostoTotal;
	}

}
