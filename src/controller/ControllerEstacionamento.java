package controller;

import bilbioteca.fila.dinamica.generica.model.Lista;
import model.Morador;

public class ControllerEstacionamento {
	
	Lista<Morador> [] andares = new Lista [10];
	
	private int hashCode(int numApto) {
		int and = (numApto/100) - 1;
		return and;
	}
	
	//Cria tabela de espalhamento, e inicializa uma lista em cada posição
	public ControllerEstacionamento() {
		int tamanho = andares.length;
		for (int i = 0; i < tamanho; i++) {
			andares[i] = new Lista<Morador>();
		}
	}
	
	// Adiciona morador
	public void add(Morador morador) throws Exception {
		int hash = hashCode(morador.numApt);
		Lista<Morador> m = andares[hash];
		if (m.isEmpty()) {
			m.addFirst(morador);
		} else {
			m.addLast(morador);
		}
	}
	
	//Lista moradores por andar
	public void list(int andar) throws Exception {
		Lista<Morador> l = andares[andar -1];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				System.out.println(l.get(i));
				
			}
		}
	
	}
	
	public void remove(int numeroApto) throws Exception {
		int hash = hashCode(numeroApto);
		Lista<Morador> l = andares[hash];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				Morador m = l.get(i);

				if (numeroApto == m.numApt) {
					l.remove(i);
					break;
				}
			}
		}
	}
	
	public void search(int numeroApto) throws Exception {
		int hash = hashCode(numeroApto);
		Lista<Morador> l = andares[hash];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				Morador m = l.get(i);

				if (numeroApto == m.numApt) {
					System.out.print(l.get(i));
					System.out.println("");
					break;
				}
			}
		}
	}
}
