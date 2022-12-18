import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra;
		
		do {
				palavra=JOptionPane.showInputDialog("digite uma palavra :");
			
			//aki dentro 
		}while(palavra.equals("fim")&& palavra.equals("sair"));
			
		JOptionPane.showMessageDialog(null,palavra  );
		}

}
