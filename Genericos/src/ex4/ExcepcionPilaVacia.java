package ex4;

public class ExcepcionPilaVacia extends RuntimeException {
	
	public ExcepcionPilaVacia()
	{
		this("La pila esta vacia");
	}
	
	public ExcepcionPilaVacia(String mensajeEx)
	{
		super(mensajeEx);
	}

}
