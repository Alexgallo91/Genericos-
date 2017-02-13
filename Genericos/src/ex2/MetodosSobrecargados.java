package ex2;

public class MetodosSobrecargados {
	
//	public static void imprimirArreglo(Integer[] arregloEntrada)
//	{
//		for(Integer a: arregloEntrada)
//			System.out.printf("%s ", a);
//		
//		System.out.println();
//	}
//	
//	public static void imprimirArreglo(Double[] arregloEntrada)
//	{
//		for(Double a: arregloEntrada)
//			System.out.printf("%s  ", a);
//		
//		System.out.println();
//	}
//	
//	public static void imprimirArreglo(Character[] arregloEntrada)
//	{
//		for(Character a: arregloEntrada)
//			System.out.printf("%s ", a);
//		
//		System.out.println();
//	}

	public static <E> void imprimirArreglo(E[] arregloEntrada)
	{
		for(E generico:arregloEntrada)
			System.out.printf("%s ", generico);
		
		System.out.println();
	}
	
	public static void main(String []args)
	{
		Integer[] arregloInteger = {1,2,3,4,5,6};
		Double[] arregloDouble = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
		Character[] arregloCharacter = {'h','o','l','a'};
		
		System.out.println("El arreglo arregloInteger contiene:");
		imprimirArreglo(arregloInteger);
		
		System.out.println("El arreglo arregloDouble contiene:");
		imprimirArreglo(arregloDouble);
		
		System.out.println("El arreglo arregloCharacter contiene:");
		imprimirArreglo(arregloCharacter);
	}

}
