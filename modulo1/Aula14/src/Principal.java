
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a,b;
		boolean resultadoOperadorAnd,resultadoOperadorOr,resultadoOperadorNot,resultadoOperadorXor;
		
		a=true;
		b=false;
		
		resultadoOperadorAnd = a & b ;
		resultadoOperadorOr = a | b;
	    resultadoOperadorNot = !a;
		resultadoOperadorXor = a ^ b;
		
		System.out.println("variavel a:" + a);
		System.out.println("variavel b :" + b );
		System.out.println("resultadoOperadorAnd " + resultadoOperadorAnd );
		System.out.println("resultadoOperadorOr" + resultadoOperadorOr);
		System.out.println("resultadoOperadorNot" + resultadoOperadorNot);
		System.out.println("resultadoOperadorXor" + resultadoOperadorXor);

	}

}
