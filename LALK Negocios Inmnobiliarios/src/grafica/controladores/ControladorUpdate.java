package grafica.controladores;

import java.sql.SQLException;

import logicapersistencia.fachada.FachadaInsert;
import logicapersistencia.fachada.FachadaUpdate;

public class ControladorUpdate{

	public void updateTerreno(int idTerreno, int idInmueble, int FOS,double alturaEdificable,double frente,String situacionJuridica,
			String productividad,String conMejoras,String detalleTerr, String rutaImagenTerreno)throws SQLException{
		
		FachadaUpdate f=new FachadaUpdate();
		f.updateTerreno(idTerreno,idInmueble, FOS,alturaEdificable,frente,situacionJuridica,
				productividad,conMejoras,detalleTerr, rutaImagenTerreno);
	}
	
	public void updateApartamento(int idApartamento,int idInmueble,int unidad,String ubicarEdificio,String ubicarPlanta,
			 String habitacionSocial,String cocina,String monoambiente,String unAmbiente,String dormConSuite,
			 String dormConVestidor,int ba�os,String ba�oSocial,String ba�oServicio,String ba�oJacuzzi,String balcon,
			 String terrazaPrincipal,String terrazaLavadero,String garaje,String cochAbierta,String cochTechada,
			 String amenities,int gastosComunes,double areaEdificada,String detalleApto, String rutaImagenApto)throws SQLException{

		FachadaUpdate f=new FachadaUpdate();
		f.updateApartamento(idApartamento,idInmueble,unidad,ubicarEdificio,ubicarPlanta,
							habitacionSocial,cocina,monoambiente,unAmbiente,dormConSuite,
							dormConVestidor,ba�os,ba�oSocial,ba�oServicio,ba�oJacuzzi,balcon,
							terrazaPrincipal,terrazaLavadero,garaje,cochAbierta,cochTechada,
							amenities,gastosComunes,areaEdificada,detalleApto, rutaImagenApto);
	}
	
	public void updateCasa(int idCasa, int idInmueble, String situacionJuridica,String estructura,String habitacionSocial,String estar,
			int dormitorios,String dormConSuite,String dormSocial,int ba�os,String ba�oServicio,String ba�oSocial,
			String ba�oConJacuzzi,String fondo,String patio,String jardin,String garaje,
			String cocheraAbierta,String cocheraTechada,String amenities,double areaEdificada,double metrosFrente,
			String detalleCasa, String rutaImagenCasa)
			throws SQLException{
		
		FachadaUpdate f=new FachadaUpdate();
		f.updateCasa(idCasa, idInmueble, situacionJuridica,estructura,habitacionSocial,estar,dormitorios,dormConSuite,dormSocial,
				ba�os,ba�oServicio,ba�oSocial,ba�oConJacuzzi,fondo,patio,jardin,garaje,cocheraAbierta,cocheraTechada,amenities,
				areaEdificada,metrosFrente,detalleCasa,rutaImagenCasa);
	}
	
	public void updateInmueble2(int refInmueble, int tipoMonedaPrecioLista,int precioLista,
			int contribucionInmobiliaria, int areaTotal, String exclusividad, String estadoDisponibilidad,
			String fechaIngreso, String direccion,int padron, 
			String barrio, String departamento, String estadoDetalle, 
			String detalleInmueble, int antiguedad, String estadoConservacion)throws SQLException{
		FachadaUpdate f=new FachadaUpdate();
		f.updateInmueble2(refInmueble,tipoMonedaPrecioLista,precioLista,contribucionInmobiliaria,
				areaTotal,exclusividad,estadoDisponibilidad,fechaIngreso,direccion,
				padron, barrio, departamento, estadoDetalle, detalleInmueble,
				antiguedad, estadoConservacion);
		
	}
	
	
}