package view;

import javax.swing.JOptionPane;

import controller.ControllerEstacionamento;
import model.Morador;

public class Principal {

	public static void main(String[] args) throws Exception {
		ControllerEstacionamento c = new ControllerEstacionamento();

		int r = 0;
		int a = 0;
		
		do {
			r = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar Morador \n 2- Remover Morador \n 3- Pesquisar Apartamento \n 4- Visualizar Andar \n 9- Sair"));
			
			switch (r) {
			case 1:
				Morador m = new Morador ();
				m.andar = Integer.parseInt(JOptionPane.showInputDialog("ANDAR"));
				m.numApt = Integer.parseInt(JOptionPane.showInputDialog("APARTAMENTO"));
				m.nomeMorador = JOptionPane.showInputDialog("NOME DO MORADOR");
				m.modeloCarro = JOptionPane.showInputDialog("MODELO DO CARRO");
				m.corCarro = JOptionPane.showInputDialog("COR DO CARRO");
				m.placaCarro = JOptionPane.showInputDialog("PLACA DO CARRO");
				c.add(m);
				break;
			case 2:
				a = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO APARTAMENTO QUE QUER REMOVER"));
				c.remove(a);
				break;
			case 3:
				a = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO APARTAMENTO QUE QUER PESQUISAR"));
				c.search(a);
				break;
			case 4:
				a = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DO ANDAR O QUE QUER PESQUISAR"));
				c.list(a);
				break;
			case 9:
				System.err.println("Saindo");
				break;
			default:
				System.err.println("Opção inválida");
				break;
			}
		} while (r != 9);
		
		
		
		
		
		
		
		/*
		 * m.andar = 1; m.numApt = 101; m.nomeMorador = "A"; m.modeloCarro = "carro a";
		 * m.corCarro = "cor a"; m.placaCarro = "101";
		 * 
		 * m1.andar = 1; m1.numApt = 102; m1.nomeMorador = "c"; m1.modeloCarro =
		 * "carro c"; m1.corCarro = "cora c"; m1.placaCarro = "102";
		 * 
		 * m2.andar = 2; m2.numApt = 201; m2.nomeMorador = "B"; m2.modeloCarro =
		 * "carro b"; m2.corCarro = "cora B"; m2.placaCarro = "202";
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * try { c.add(m); c.add(m1); c.add(m2);
		 * System.out.println("Listagem por andar"); c.list(1); c.list(2); c.list(3);
		 * System.out.println("");
		 * System.out.println("Listagem após remover morador 101"); c.remove(101);
		 * c.list(1); c.list(2); c.list(3); System.out.println("");
		 * System.out.println("Pesquisa: 102"); c.search(102); System.out.println("");
		 * System.out.println("Pesquisa: 302"); c.search(302); } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 */

	}

}
