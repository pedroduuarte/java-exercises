package entities;

public class PessoaFisica extends Contribuinte {

	private double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImposto() {
		double impostoTotal;
		if (getRendaAnual() < 20000 && gastosSaude > 0) {
			impostoTotal = ((getRendaAnual() * 15) / 100) - (gastosSaude / 2);
		}
		else if (getRendaAnual() < 20000 && gastosSaude == 0) {
			impostoTotal = (getRendaAnual() * 15) / 100;
		}
		else if (getRendaAnual() >= 20000 && gastosSaude > 0) {
			impostoTotal = ((getRendaAnual() * 25)/100) - (gastosSaude /2);
		}
		else {
			impostoTotal = (getRendaAnual() * 25) / 100;
		}
		return impostoTotal;
	}

}
