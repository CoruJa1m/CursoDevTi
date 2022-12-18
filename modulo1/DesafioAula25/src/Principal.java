import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mes;
		
		do {
			mes = JOptionPane.showInputDialog("digite um mes ;");
			
		}while(
			mes.equals("janeiro")||		mes.equals("fevereiro")||	
			mes.equals("marco")||		mes.equals("abril")||	
			mes.equals("maio")||		mes.equals("junho")||	
			mes.equals("julho")||		mes.equals("agosto")||	
			mes.equals("setembro")||		mes.equals("outubro")||	
			mes.equals("novembro")||		mes.equals("dezembro")
				
				
				);
		JOptionPane.showMessageDialog(null, mes + "nao e um mes valido ");

	}

}
