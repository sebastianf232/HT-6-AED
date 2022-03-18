/**
 * @author Sebastian Franco 21484
 * @author Gabriela de Leon 21037 
 * Clase Cartas
 */
public class Cartas {
    private int valor;
    private String nombre;
    private String tipo;

    public Cartas(String tipo, String nombre ){
		this.nombre =  nombre;
		this.tipo = tipo;
	}
	public Cartas(){} //constructor vacio

	/**
	 * @return Valor
	 */
	public int getValor() {
		return this.valor;
	}

	/**
	 * @param valor
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return Nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Tipo
	 */
	public String getTipo() {
		return this.tipo;
	}

	/**
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
