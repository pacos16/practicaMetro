package model;
// Generated 4 dic. 2019 14:58:10 by Hibernate Tools 5.2.12.Final

/**
 * TAccesos generated by hbm2java
 */
public class TAccesos implements java.io.Serializable {

	private int codAcceso;
	private TEstaciones TEstaciones;
	private String descripcion;

	public TAccesos() {
	}

	public TAccesos(int codAcceso, TEstaciones TEstaciones, String descripcion) {
		this.codAcceso = codAcceso;
		this.TEstaciones = TEstaciones;
		this.descripcion = descripcion;
	}

	public int getCodAcceso() {
		return this.codAcceso;
	}

	public void setCodAcceso(int codAcceso) {
		this.codAcceso = codAcceso;
	}

	public TEstaciones getTEstaciones() {
		return this.TEstaciones;
	}

	public void setTEstaciones(TEstaciones TEstaciones) {
		this.TEstaciones = TEstaciones;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
