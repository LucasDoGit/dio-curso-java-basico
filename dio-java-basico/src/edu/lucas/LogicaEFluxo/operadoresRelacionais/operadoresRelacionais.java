package edu.lucas.LogicaEFluxo.operadoresRelacionais;
/**
 * Aluno: Lucas Thiago Saiz Timoteo
 * Data: 04/01/2023
 * DIO Java Basico - praticando o uso de argumentos e scanner
 */
public class operadoresRelacionais {

	public static void main(String[] args) {
		System.out.println("Praticando operações relacionais");
		
		int i1 = 10, i2 = 20;
		float f1 = 4.5f, f2 = 3.5f;
		double d1 = 59.6d;
		char c1 = 'x', c2 = 'y';
		String s1 = "Fulano", s2 = "Fulano", s3 = "Cicrano";
		boolean b1 = true, b2 = false;
		long l1 = 1597L, l2 = 8997L;
		byte by1 = 1;
		short h1 = 25;
		
		System.out.println("i1 == i2 " + (i1 == i2));
		System.out.println("i1 != i2 " + (i1 != i2));
		System.out.println("i1 > i2 " + (i1 > i2));
		System.out.println("i1 <= i2 " + (i1 <= i2));
		
		System.out.println("f1 == f2 " + (f1 == f2));
		System.out.println("f1 != f2 " + (f1 != f2));
		System.out.println("f1 >= f2 " + (f1 >= f2));
		System.out.println("f1 < f2 " + (f1 < f2));
		
		System.out.println("c1 == c2 " + (c1 == c2));
		System.out.println("c1 != c2 " + (c1 != c2));
		System.out.println("c1 > c2 " + (c1 > c2));
		System.out.println("c1 <= c2 " + (c1 <= c2));
		
		System.out.println("s1 == s2 " + (s1 == s2));
		System.out.println("s1 == s3 " + (s1 == s3));
		System.out.println("s1 > s2 " + (s1 != s2));
		//System.out.println(s1 >= s2);
		//System.out.println(s1 < s2);
		
		System.out.println("b1 == b2 " + (b1 == b2));
		System.out.println("b1 != b2 " + (b1 != b2));
		//System.out.println(b1 > b2);
		//System.out.println(b1 <= i1 );
		
		System.out.println("i2 > f1 " + (i2 > f1));
		System.out.println("d1 == h1 " + (d1 == h1));
		//System.out.println(s2 != c1);
		//System.out.println(s3 <= i1 );
		
		System.out.println("l1 == i2 " + (l1 == i2));
		System.out.println("l2 >= i1 " + (l2 >= i1));
		System.out.println("by1 != h1 " + (by1 != h1));
		
	}

}
