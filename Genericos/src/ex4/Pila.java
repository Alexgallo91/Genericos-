package ex4;

public class Pila<E> {
	
	private final int tamanio;
	private int superior;
	private E[] elementos;
	
	public Pila()
	{
		this(10);
	}
	
	public Pila(int s)
	{
		tamanio = s > 0 ? s : 10;
		superior = -1;//esta vacia
		
		elementos = (E[]) new Object[tamanio];
	}
	
	public void push(E valorAMeter)
	{
		if(superior == tamanio - 1)
		{
			throw new ExcepcionPilaLlena("La pila esta llena!!!");
		}
		elementos[++superior] = valorAMeter;
	}
	
	public E pop()
	{
		if(superior == -1)
		{
			throw new ExcepcionPilaVacia("La pila esta vacia");
		}
		
		return elementos[superior--];
	}
}







