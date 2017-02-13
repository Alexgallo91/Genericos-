package ex4;

public class PruebaPila2 {

	private Double[] elementosDouble = {1.1,2.2,3.3,4.4,5.5,6.6};
	private Integer[] elementosInteger = {1,2,3,4,5,6,7,8,9,10,11};
	
	private Pila<Double> pilaDouble;
	private Pila<Integer> pilaInteger;
	
	public void probarPilas()
	{
		pilaDouble = new Pila<Double>(5);
		pilaInteger = new Pila<Integer>(10);
		
		//codigo faltante
		probarPush("pilaInteger", pilaInteger, elementosInteger);
		probarPop("pilaInteger", pilaInteger);
		probarPush("pilaDouble", pilaDouble, elementosDouble);
		probarPop("pilaDouble", pilaDouble);
	}
	
	public <T> void probarPush(String nombre, Pila<T> pila,
							   T[] elementos)
	{
		try
		{
			System.out.printf("\nMetiendo elementos a %s\n", nombre);
			for(T elemento:elementos)
			{
				System.out.printf("%s ", elemento);
				pila.push(elemento);
			}
		}
		catch(ExcepcionPilaLlena ex)
		{
			System.err.println();
			ex.printStackTrace();
		}
	}
	
	public <T> void probarPop(String nombre, Pila<T> pila)
	{
		try
		{
			System.out.printf("\nSacando elementos de %s\n", nombre);
			while(true)
			{
				System.out.printf("%s ", pila.pop());
			}
			
		}
		catch (ExcepcionPilaVacia ex) {
			System.out.println();
			ex.printStackTrace();
		}
	}
	
	public static void main(String []args)
	{
		PruebaPila2 p = new PruebaPila2();
		p.probarPilas();
		
	}

}

















