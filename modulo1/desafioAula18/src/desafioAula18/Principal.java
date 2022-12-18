package desafioAula18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		boolean responsavel,ingresso;
		
		
		nome=JOptionPane.showInputDialog("qual seu nome ?");
		idade=Integer.parseInt(JOptionPane.showInputDialog("qual sua idade ?"));
		responsavel= Boolean.parseBoolean(JOptionPane.showInputDialog("esta com algum  responsavel?"));
		ingresso=Boolean.parseBoolean(JOptionPane.showInputDialog("voce esta com o ingresso?"));
		
		if((idade>=  18 || responsavel) && ingresso) {
			JOptionPane.showMessageDialog(null, "acesso liberado pro evento !!");
			
		}else {
			JOptionPane.showMessageDialog(null, "acesso negado pro eventos!!");
			
		}
		
		
		
		

	}

}
