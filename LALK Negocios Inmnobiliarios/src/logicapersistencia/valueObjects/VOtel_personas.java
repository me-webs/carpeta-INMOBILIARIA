package logicapersistencia.valueObjects;

public class VOtel_personas{
	
	private int idPersona;
	private int telPersona;
	private String detalleTel;
	
	public VOtel_personas(int idPersona,int telPersona,String detalleTel){
		
		super();
		this.idPersona=idPersona;
		this.telPersona=telPersona;
		this.detalleTel=detalleTel;
	}
	
	public int getIdPersona(){
		return idPersona;
	}
	public void setIdPersona(int idPersona){
		this.idPersona=idPersona;
	}
	public int getTelPersona(){
		return telPersona;
	}
	public void setTelPersona(int telPersona){
		this.telPersona=telPersona;
	}
	public String getDetalleTel(){
		return detalleTel;
	}
	public void setDetalleTel(String detalleTel){
		this.detalleTel=detalleTel;
	}
}