import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,adicao,subtracao,divisao,multiplicacao;
	    a=10;
	    b=5;
	    adicao = a + b;
	    subtracao = a - b;
	    multiplicacao = a * b;
	    divisao = a / b;
	    JOptionPane.showMessageDialog(null, "resultados");
	    JOptionPane.showMessageDialog(null,"adicao" + adicao);
	    JOptionPane.showMessageDialog(null,"subtracao" + subtracao);
	    JOptionPane.showMessageDialog(null,"multiplicacao" + multiplicacao);
	    JOptionPane.showMessageDialog(null,"divisao" + divisao);
	    
	    		

	}

}
