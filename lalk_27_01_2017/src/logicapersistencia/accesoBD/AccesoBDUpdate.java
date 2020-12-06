package logicapersistencia.accesoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccesoBDUpdate{
	
	AccesoBD a=new AccesoBD();

	public void updateTerreno(int idTerreno, int idInmueble, int FOS,double alturaEdificable,
			double frente,String situacionJuridica,
			String productividad,String conMejoras,String detalleTerr, String rutaImagenTerreno)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasUpdate consultas=new ConsultasUpdate();
		String insert=consultas.updateTerreno();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		
		pstmt.setInt(1,idInmueble);
		pstmt.setInt(2,FOS);
		pstmt.setDouble(3,alturaEdificable);
		pstmt.setDouble(4,frente);
		pstmt.setString(5,situacionJuridica);
		pstmt.setString(6,productividad);
		pstmt.setString(7,conMejoras);
		pstmt.setString(8,detalleTerr);
		pstmt.setString(9,rutaImagenTerreno);
		pstmt.setInt(10,idTerreno);
		
		pstmt.executeUpdate();
		pstmt.close();
		a.desconectarBD(con);
	}
	
	public void updateApartamento(int idApartamento,int idInmueble,int unidad,String ubicarEdificio,String ubicarPlanta,
			String habitacionSocial,String cocina,String monoambiente,String unAmbiente,String dormConSuite,
			String dormConVestidor,int ba�os,String ba�oSocial,String ba�oServicio,String ba�oJacuzzi,String balcon,
			String terrazaPrincipal,String terrazaLavadero,String garaje,String cochAbierta,String cochTechada,
			String amenities,int gastosComunes,double areaEdificada,String detalleApto, String rutaImagenApto)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasUpdate consultas=new ConsultasUpdate();
		String insert=consultas.updateApartamento();	
		PreparedStatement pstmt;
		
		pstmt=con.prepareStatement(insert);
		
		pstmt.setInt(1,idInmueble);
		pstmt.setInt(2,unidad);
		pstmt.setString(3,ubicarEdificio);
		pstmt.setString(4,ubicarPlanta);
		pstmt.setString(5,habitacionSocial);
		pstmt.setString(6,cocina);
		pstmt.setString(7,monoambiente);
		pstmt.setString(8,unAmbiente);
		pstmt.setString(9,dormConSuite);
		pstmt.setString(10,dormConVestidor);
		pstmt.setInt(11,ba�os);
		pstmt.setString(12,ba�oSocial);
		pstmt.setString(13,ba�oServicio);
		pstmt.setString(14,ba�oJacuzzi);
		pstmt.setString(15,balcon);
		pstmt.setString(16,terrazaPrincipal);
		pstmt.setString(17,terrazaLavadero);
		pstmt.setString(18,garaje);
		pstmt.setString(19,cochAbierta);
		pstmt.setString(20,cochTechada);
		pstmt.setString(21,amenities);
		pstmt.setInt(22,gastosComunes);
		pstmt.setDouble(23,areaEdificada);
		pstmt.setString(24,detalleApto);
		pstmt.setString(25,rutaImagenApto);
		
		pstmt.setInt(26,idApartamento);
		
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}
	
	public void updateCasa(int idCasa, int idInmueble, String situacionJuridica,String estructura,String habitacionSocial,
			String estar,int dormitorios,String dormConSuite,String dormSocial,int ba�os,String ba�oServicio,
			String ba�oSocial,String ba�oConJacuzzi,String fondo,String patio,String jardin,String garaje,
			String cocheraAbierta,String cocheraTechada,String amenities,double areaEdificada,double metrosFrente,
			String detalleCasa, String rutaImagenCasa)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasUpdate consultas=new ConsultasUpdate();
		String insert=consultas.updateCasa();	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		
		pstmt.setInt(1,idInmueble);		
		pstmt.setString(2,situacionJuridica);
		pstmt.setString(3,estructura);
		pstmt.setString(4,habitacionSocial);
		pstmt.setString(5,estar);
		pstmt.setInt(6,dormitorios);
		pstmt.setString(7,dormConSuite);
		pstmt.setString(8,dormSocial);
		pstmt.setInt(9,ba�os);
		pstmt.setString(10,ba�oServicio);
		pstmt.setString(11,ba�oSocial);
		pstmt.setString(12,ba�oConJacuzzi);
		pstmt.setString(13,fondo);
		pstmt.setString(14,patio);	
		pstmt.setString(15,jardin);
		pstmt.setString(16,garaje);
		pstmt.setString(17,cocheraAbierta);
		pstmt.setString(18,cocheraTechada);
		pstmt.setString(19,amenities);	
		pstmt.setDouble(20,areaEdificada);
		pstmt.setDouble(21,metrosFrente);
		pstmt.setString(22,detalleCasa);
		pstmt.setString(23,rutaImagenCasa);
		
		pstmt.setInt(24,idCasa);
		
		
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}
	
	public void updateInmueble2(int refInmueble, int tipoMonedaPrecioLista,int precioLista,
			int contribucionInmobiliaria, int areaTotal, String exclusividad, String estadoDisponibilidad,
			String fechaIngreso, String direccion,int padron, String barrio, 
			String departamento, String estadoDetalle, String detalleInmueble,
			int antiguedad, String estadoConservacion)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasUpdate consultas=new ConsultasUpdate();
		String insert=consultas.updateInmueble();	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		
		pstmt.setInt(1,tipoMonedaPrecioLista);			
		pstmt.setInt(2,precioLista);
		pstmt.setInt(3,contribucionInmobiliaria);
		pstmt.setInt(4,areaTotal);
		pstmt.setString(5,exclusividad);
		pstmt.setString(6,estadoDisponibilidad);
		pstmt.setString(7,fechaIngreso);
		pstmt.setString(8,direccion);
		pstmt.setInt(9,padron);
		pstmt.setString(10,barrio);
		pstmt.setString(11,departamento);
		pstmt.setString(12,estadoDetalle);
		pstmt.setString(13,detalleInmueble);
		pstmt.setInt(14,antiguedad);
		pstmt.setString(15,estadoConservacion);
		
		pstmt.setInt(16,refInmueble);
		
		
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}
	
	
	
}