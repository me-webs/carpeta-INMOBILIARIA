package logicapersistencia.valueObjects;

public class VOcasas extends VOinmueble{
	
	private int idCasa;
	private int idInmueble;
	private String situacionJuridica;
	private String estructura;
	private String habitacionSocial;
	private String estar;
	private int dormitorios;
	private String dormConSuite;
	private String dormSocial;
	private int ba�os;
	private String ba�oServicio;
	private String ba�oSocial;
	private String ba�oConJacuzzi;
	private String fondo;
	private String patio;
	private String jardin;
	private String garaje;
	private String cocheraAbierta;
	private String cocheraTechada;
	private String amenities;
	private double areaEdificada;
	private double metrosFrente;
	private String detalleCasa;
	private String rutaImagenCasa;
	

	public VOcasas( int refInmueble, int tipoMonedaPrecioLista,int precioLista,
			int contribucionInmobiliaria, int areaTotal, String exclusividad, String estadoDisponibilidad,
			String fechaIngreso, String direccion,int padron, 
			String barrio, String departamento, String estadoDetalle,
			String detalleInmueble, int antiguedad, String estadoConservacion, int idInmueble, int idCasa, String situacionJuridica, String estructura, String habitacionSocial, 
			String estar,int dormitorios, String dormConSuite, String dormSocial, int ba�os, String ba�oServicio,
			String ba�oSocial, String ba�oConJacuzzi, String fondo, String patio, String jardin, String garaje,
			String cocheraAbierta, String cocheraTechada, String amenities, double areaEdificada, double metrosFrente,
			String detalleCasa, String rutaImagenCasa) {
		super(refInmueble,tipoMonedaPrecioLista,precioLista,contribucionInmobiliaria,
				areaTotal,exclusividad,estadoDisponibilidad,fechaIngreso,direccion,
				padron, barrio, departamento, estadoDetalle, detalleInmueble,antiguedad, estadoConservacion);
		this.idInmueble=idInmueble;
		this.idCasa = idCasa;
		this.situacionJuridica = situacionJuridica;
		this.estructura = estructura;
		this.habitacionSocial = habitacionSocial;
		this.estar = estar;
		this.dormitorios = dormitorios;
		this.dormConSuite = dormConSuite;
		this.dormSocial = dormSocial;
		this.ba�os = ba�os;
		this.ba�oServicio = ba�oServicio;
		this.ba�oSocial = ba�oSocial;
		this.ba�oConJacuzzi = ba�oConJacuzzi;
		this.fondo = fondo;
		this.patio = patio;
		this.jardin = jardin;
		this.garaje = garaje;
		this.cocheraAbierta = cocheraAbierta;
		this.cocheraTechada = cocheraTechada;
		this.amenities = amenities;
		this.areaEdificada = areaEdificada;
		this.metrosFrente = metrosFrente;
		this.detalleCasa = detalleCasa;
		this.rutaImagenCasa=rutaImagenCasa;
	}

	public int getIdCasa() {
		return idCasa;
	}
	public void setIdCasa(int idCasa) {
		this.idCasa = idCasa;
	}
	public String getSituacionJuridica() {
		return situacionJuridica;
	}
	public void setSituacionJuridica(String situacionJuridica) {
		this.situacionJuridica = situacionJuridica;
	}
	public String getEstructura() {
		return estructura;
	}
	public void setEstructura(String estructura) {
		this.estructura = estructura;
	}
	public String getHabitacionSocial() {
		return habitacionSocial;
	}
	public void setHabitacionSocial(String habitacionSocial) {
		this.habitacionSocial = habitacionSocial;
	}
	public String getEstar() {
		return estar;
	}
	public void setEstar(String estar) {
		this.estar = estar;
	}
	public int getDormitorios() {
		return dormitorios;
	}
	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}
	public String getDormConSuite() {
		return dormConSuite;
	}
	public void setDormConSuite(String dormConSuite) {
		this.dormConSuite = dormConSuite;
	}
	public String getDormSocial() {
		return dormSocial;
	}
	public void setDormSocial(String dormSocial) {
		this.dormSocial = dormSocial;
	}
	public int getBa�os() {
		return ba�os;
	}
	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
	}
	public String getBa�oServicio() {
		return ba�oServicio;
	}
	public void setBa�oServicio(String ba�oServicio) {
		this.ba�oServicio = ba�oServicio;
	}
	public String getBa�oSocial() {
		return ba�oSocial;
	}
	public void setBa�oSocial(String ba�oSocial) {
		this.ba�oSocial = ba�oSocial;
	}
	public String getBa�oConJacuzzi() {
		return ba�oConJacuzzi;
	}
	public void setBa�oConJacuzzi(String ba�oConJacuzzi) {
		this.ba�oConJacuzzi = ba�oConJacuzzi;
	}
	public String getFondo() {
		return fondo;
	}
	public void setFondo(String fondo) {
		this.fondo = fondo;
	}
	public String getPatio() {
		return patio;
	}
	public void setPatio(String patio) {
		this.patio = patio;
	}
	public String getJardin() {
		return jardin;
	}
	public void setJardin(String jardin) {
		this.jardin = jardin;
	}
	public String getGaraje() {
		return garaje;
	}
	public void setGaraje(String garaje) {
		this.garaje = garaje;
	}
	public String getCocheraAbierta() {
		return cocheraAbierta;
	}
	public void setCocheraAbierta(String cocheraAbierta) {
		this.cocheraAbierta = cocheraAbierta;
	}
	public String getCocheraTechada() {
		return cocheraTechada;
	}
	public void setCocheraTechada(String cocheraTechada) {
		this.cocheraTechada = cocheraTechada;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public double getAreaEdificada() {
		return areaEdificada;
	}
	public void setAreaEdificada(double areaEdificada) {
		this.areaEdificada = areaEdificada;
	}
	public double getMetrosFrente() {
		return metrosFrente;
	}
	public void setMetrosFrente(double metrosFrente) {
		this.metrosFrente = metrosFrente;
	}
	public String getDetalleCasa() {
		return detalleCasa;
	}
	public void setDetalleCasa(String detalleCasa) {
		this.detalleCasa = detalleCasa;
	}	
	public String getRutaImagenCasa() {
		return rutaImagenCasa;
	}
	
	public void setRutaImagenCasa(String rutaImagenCasa) {
		this.rutaImagenCasa = rutaImagenCasa;
	}
	
	
	
	public int getIdInmueble() {
		return idInmueble;
	}
	
	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
}