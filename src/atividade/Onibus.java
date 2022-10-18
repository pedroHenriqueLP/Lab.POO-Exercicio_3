package atividade;

public class Onibus extends Veiculo {

	protected int Assentos;

	public Onibus(String placa, int ano, int assentos) {
		System.out.println("\nExibição de Informações:");

		super.setPlaca("AAA-1111");
		super.setAno(2000);
		this.setAssentos(41);
		this.exibirDados();

		super.setPlaca("ABC-1234");
		super.setAno(2005);
		this.setAssentos(45);
		this.exibirDados();

		super.setPlaca("BBB-2222");
		super.setAno(2000);
		this.setAssentos(42);
		this.exibirDados();

		super.setPlaca("CCC-3333");
		super.setAno(2015);
		this.setAssentos(43);
		this.exibirDados();

		super.setPlaca("DDD-4444");
		super.setAno(2020);
		this.setAssentos(44);
		this.exibirDados();
	}

	public int getAssentos() {
		return Assentos;
	}

	public void setAssentos(int assentos) {
		Assentos = assentos;
	}

	@Override
	public void exibirDados() {
		getPlaca();

		System.out.println(
				"Veículo=Ônibus Placa=" + this.getPlaca() + " Ano=" + this.getAno() + " Assentos=" + this.getAssentos());
	}

}
