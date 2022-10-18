package atividade;

public class Caminhao extends Veiculo {

	protected int Eixos;

	public Caminhao(String placa, int ano, int eixos) {
		System.out.print("\n");

		super.setPlaca("EFG-5678");
		super.setAno(2000);
		this.setEixos(9);
		this.exibirDados();
		
		super.setPlaca("EEE-5555");
		super.setAno(1982);
		this.setEixos(2);
		this.exibirDados();
		
		super.setPlaca("FFF-6666");
		super.setAno(1992);
		this.setEixos(3);
		this.exibirDados();
		
		super.setPlaca("GGG-7777");
		super.setAno(2002);
		this.setEixos(4);
		this.exibirDados();

		super.setPlaca("HHH-8888");
		super.setAno(2012);
		this.setEixos(7);
		this.exibirDados();	
	}

	public int getEixos() {
		return Eixos;
	}

	public void setEixos(int eixos) {
		Eixos = eixos;
	}

	@Override
	public void exibirDados() {
		System.out.println("Veículo=Caminhão Placa=" + this.getPlaca() + " Ano=" + this.getAno() + " Eixos=" + this.getEixos());
	}

}
