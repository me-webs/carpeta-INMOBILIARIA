package logicapersistencia.valueObjects;

public class VOventas{
	
	private int idVentas;
	private Double precioVenta;
	private String fechaEgreso;
	private String gravamen;
	private String nombreEsc;
	private int telEsc;
	private String emailEsc;
	private String detalleEsc;
	private String detalleVen;
	
	public VOventas(int idVentas,double precioVenta,String fechaEgreso,String gravamen,String nombreEsc,int telEsc,
			String emailEsc,String detalleEsc,String detalleVen){
		
		super();
		this.idVentas=idVentas;
		this.precioVenta=precioVenta;
		this.fechaEgreso=fechaEgreso;
		this.gravamen=gravamen;
		this.nombreEsc=nombreEsc;
		this.telEsc=telEsc;
		this.emailEsc=emailEsc;
		this.detalleEsc=detalleEsc;
		this.detalleVen=detalleVen;
	}
	
	public int getIdVentas(){
		return idVentas;
	}
	public void setIdVentas(int idVentas){
		this.idVentas=idVentas;
	}
	public Double getPrecioVenta(){
		return precioVenta;
	}
	public void setPrecioVenta(Double precioVenta){
		this.precioVenta=precioVenta;
	}
	public String getFechaEgreso(){
		return fechaEgreso;
	}
	public void setFechaEgreso(String fechaEgreso){
		this.fechaEgreso=fechaEgreso;
	}
	public String getGravamen(){
		return gravamen;
	}
	public void setGravamen(String gravamen){
		this.gravamen=gravamen;
	}
	public String getNombreEsc(){
		return nombreEsc;
	}
	public void setNombreEsc(String nombreEsc){
		this.nombreEsc=nombreEsc;
	}
	public int getTelEsc(){
		return telEsc;
	}
	public void setTelEsc(int telEsc){
		this.telEsc=telEsc;
	}
	public String getEmailEsc(){
		return emailEsc;
	}
	public void setEmailEsc(String emailEsc){
		this.emailEsc=emailEsc;
	}
	public String getDetalleEsc(){
		return detalleEsc;
	}
	public void setDetalleEsc(String detalleEsc){
		this.detalleEsc=detalleEsc;
	}
	public String getDetalleVen(){
		return detalleVen;
	}
	public void setDetalleVen(String detalleVen){
		this.detalleVen=detalleVen;
	}
}