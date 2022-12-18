import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma=0;
		JOptionPane.showInputDialog("digite numeros:");
		
		
	while(soma<114) {
		
		soma += Integer.parseInt(JOptionPane.showInputDialog("numero"));
		
		
	}
	
	JOptionPane.showMessageDialog(null, "soma" + soma);
	

	}

}
