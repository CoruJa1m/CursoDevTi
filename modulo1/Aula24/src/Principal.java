import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numero=0;
		
		while (numero<100) {
			 numero= Integer.parseInt(JOptionPane.showInputDialog("digite um numero:"));
			
			
		}
		JOptionPane.showMessageDialog(null, "fim");
	}

}
