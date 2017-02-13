package ex4;

public class ExcepcionPilaLlena extends RuntimeException {
	
	public ExcepcionPilaLlena()
	{
		this("La pila esta llena");
	}
	
	public ExcepcionPilaLlena(String mensajeEx)
	{
		super(mensajeEx);
	}
}
