package model;

public class Morador {

	public int numApt;
	public int andar;
	public String nomeMorador;
	public String modeloCarro;
	public String corCarro;
	public String placaCarro;
	
	public Morador(int numApt, int andar, String nomeMorador, String modeloCarro, String corCarro, String placaCarro) {
		this.numApt = numApt;
		this.andar = numApt/100;
		this.nomeMorador = nomeMorador;
		this.modeloCarro = modeloCarro;
		this.corCarro = corCarro;
		this.placaCarro = placaCarro;
	}

	public Morador() {
		super();
	}
	


	@Override
	public String toString() {
		return "Morador:" + nomeMorador + " Apartamento:" + numApt + " Andar:" + andar + " Carro:"
				+ modeloCarro + " Cor do Carro:" + corCarro + " Placa" + placaCarro;
	}
	


}
