import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("digite seu numero:"));
		System.out.println("tabuada de multiplicacao do numero " + numero + ":");
		
		for (int i = 1; i <=9; i++) {
			System.out.println(numero + "x" + i + "="+ (numero*i));
		}
		
		
				

	}

}
