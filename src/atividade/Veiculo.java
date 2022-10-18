package atividade;

public abstract class Veiculo {

	protected String Placa;
	protected int Ano;

	public Veiculo() {
	}

	public Veiculo(String Placa, int Ano) {
		Placa = this.Placa;
		Ano = this.Ano;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

	public abstract void exibirDados();
}
