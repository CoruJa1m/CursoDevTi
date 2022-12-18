import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		try {
			idade=Integer.parseInt(JOptionPane.showInputDialog("digite sua idade "));
			JOptionPane.showMessageDialog(null, "sua idade e :" + idade);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ocorrreu um problema inesperado ");
			
		}

	}

}
