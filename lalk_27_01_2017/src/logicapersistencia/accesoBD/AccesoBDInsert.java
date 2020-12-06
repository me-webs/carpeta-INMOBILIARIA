package logicapersistencia.accesoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class AccesoBDInsert{
	
	AccesoBD a=new AccesoBD();
	
	// Ingresa una nueva actividad al sistema
	
	public void nuevoAlquiler(int idAlquiler,int idArrendatario,int idInmueble,String fechaEgreso,
			double precioAlquiler,int plazoContractual,String garantia1,String garantia2,String nombreFia,int telFia,
			String emailFia,String detalleFia,String detalleGar,String detalleAlq)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoAlquiler();	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idAlquiler);
		pstmt.setInt(2,idArrendatario);	
		pstmt.setInt(3,idInmueble);
		pstmt.setString(4,fechaEgreso);
		pstmt.setDouble(5,precioAlquiler);
		pstmt.setInt(6,plazoContractual);
		pstmt.setString(7,garantia1);
		pstmt.setString(8,garantia2);
		pstmt.setString(9,nombreFia);
		pstmt.setInt(10,telFia);
		pstmt.setString(7,emailFia);
		pstmt.setString(8,detalleFia);
		pstmt.setString(9,detalleGar);
		pstmt.setString(10,detalleAlq);
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}
	
	
	
	public void nuevoArrendatario(int idArrendatario,String detalleArr)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoArrendatario();	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idArrendatario);
		pstmt.setString(2,detalleArr);	
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}
	
	
	
	public void nuevoComprador(int idComprador,String detalleComp)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoComprador();	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idComprador);
		pstmt.setString(2,detalleComp);	
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}

	public void nuevaFormaDePago(String formaDePago,String detalleFP)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevaFormaDePago();	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setString(1,formaDePago);
		pstmt.setString(2,detalleFP);			
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}

		
	public void nuevoOperador(int idOperador,int idPersona,String fechaIngOpe,String detalleOpe)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoOperador();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		
		pstmt.setInt(1,idOperador);
		pstmt.setInt(2,idPersona);
		pstmt.setString(3,fechaIngOpe);
		pstmt.setString(4,detalleOpe);
		
		pstmt.executeQuery();
		pstmt.close();
		a.desconectarBD(con);
	}
	

	
	
	

	
	public void nuevaVenta(int idVentas,Double precioVenta,String fechaEgreso,String gravamen,String nombreEsc,
			int telEsc,String emailEsc,String detalleEsc,String detalleVen)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevaVenta();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idVentas);
		pstmt.setDouble(2,precioVenta);
		pstmt.setString(3,fechaEgreso);
		pstmt.setString(4,gravamen);
		pstmt.setString(5,nombreEsc);
		pstmt.setInt(6,telEsc);
		pstmt.setString(7,emailEsc);
		pstmt.setString(8,detalleEsc);
		pstmt.setString(8,detalleVen);
		pstmt.executeQuery();
		pstmt.close();
		a.desconectarBD(con);
	}
	
	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	
public void nuevaMonedaLista(String monedaLista, int idMonedaLista)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevaMonedaLista();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		
		pstmt.setString(1,monedaLista);
		pstmt.setInt(2,idMonedaLista);
		
		pstmt.executeUpdate ();	
		pstmt.close();
		a.desconectarBD(con);
		
		
	}
	
	public void nuevaMonedaVenta(String monedaVenta, int idMonedaVenta)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevaMonedaVenta();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		
		pstmt.setString(1,monedaVenta);
		pstmt.setInt(2,idMonedaVenta);
		
		pstmt.executeUpdate ();	
		pstmt.close();
		a.desconectarBD(con);
		
		
	}
	
	public void nuevoInmueble2(int refInmueble, int tipoMonedaPrecioLista,int precioLista,
			int contribucionInmobiliaria, int areaTotal, String exclusividad, String estadoDisponibilidad,
			String fechaIngreso, String direccion,int padron, String barrio, 
			String departamento, String estadoDetalle, String detalleInmueble,
			int antiguedad, String estadoConservacion)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoInmueble2();	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,refInmueble);
		pstmt.setInt(2,tipoMonedaPrecioLista);			
		pstmt.setInt(3,precioLista);
		pstmt.setInt(4,contribucionInmobiliaria);
		pstmt.setInt(5,areaTotal);
				
		pstmt.setString(6,exclusividad);
		pstmt.setString(7,estadoDisponibilidad);
		pstmt.setString(8,fechaIngreso);
		pstmt.setString(9,direccion);
	
		pstmt.setInt(10,padron);
		
		pstmt.setString(11,barrio);
		pstmt.setString(12,departamento);
		pstmt.setString(13,estadoDetalle);
		pstmt.setString(14,detalleInmueble);
		pstmt.setInt(15,antiguedad);
		pstmt.setString(16,estadoConservacion);
		
		
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}
	
	public void nuevaPersona(int idPersona,String nombrePer,String emailPer,String detallePer)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevaPersona();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idPersona);
		pstmt.setString(2,nombrePer);
		pstmt.setString(3,emailPer);
		pstmt.setString(4,detallePer);
		pstmt.executeUpdate();
		pstmt.close();
		a.desconectarBD(con);
	}
	
public void nuevoPropietario(int idPersona,int idPropietario,String detalleCli)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoPropietario();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		
		pstmt.setInt(1,idPropietario );
		pstmt.setInt(2,idPersona);
		pstmt.setString(3,detalleCli);
		
		pstmt.executeUpdate();
		pstmt.close();
		a.desconectarBD(con);
	}
	
	public void nuevoTelefono(int idPersona,int telPersona,String detalleTel)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoTelefono();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idPersona);
		pstmt.setInt(2,telPersona);
		pstmt.setString(3,detalleTel);
		pstmt.executeUpdate();
		pstmt.close();
		a.desconectarBD(con);
	}
	
	public void nuevaCasa(int idCasa, int idInmueble, String situacionJuridica,String estructura,String habitacionSocial,
			String estar,int dormitorios,String dormConSuite,String dormSocial,int baños,String bañoServicio,
			String bañoSocial,String bañoConJacuzzi,String fondo,String patio,String jardin,String garaje,
			String cocheraAbierta,String cocheraTechada,String amenities,double areaEdificada,double metrosFrente,
			String detalleCasa, String rutaImagenCasa)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevaCasa();	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idCasa);
		pstmt.setInt(2,idInmueble);		
		pstmt.setString(3,situacionJuridica);
		pstmt.setString(4,estructura);
		pstmt.setString(5,habitacionSocial);
		pstmt.setString(6,estar);
		pstmt.setInt(7,dormitorios);
		pstmt.setString(8,dormConSuite);
		pstmt.setString(9,dormSocial);
		pstmt.setInt(10,baños);
		pstmt.setString(11,bañoServicio);
		pstmt.setString(12,bañoSocial);
		pstmt.setString(13,bañoConJacuzzi);
		pstmt.setString(14,fondo);
		pstmt.setString(15,patio);	
		pstmt.setString(16,jardin);
		pstmt.setString(17,garaje);
		pstmt.setString(18,cocheraAbierta);
		pstmt.setString(19,cocheraTechada);
		pstmt.setString(20,amenities);	
		pstmt.setDouble(21,areaEdificada);
		pstmt.setDouble(22,metrosFrente);
		pstmt.setString(23,detalleCasa);
		pstmt.setString(24,rutaImagenCasa);
		
		
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}
	
	public void nuevoApartamento(int idApartamento,int idInmueble,int unidad,String ubicarEdificio,String ubicarPlanta,
			String habitacionSocial,String cocina,String monoambiente,String unAmbiente,String dormConSuite,
			String dormConVestidor,int baños,String bañoSocial,String bañoServicio,String bañoJacuzzi,String balcon,
			String terrazaPrincipal,String terrazaLavadero,String garaje,String cochAbierta,String cochTechada,
			String amenities,int gastosComunes,double areaEdificada,String detalleApto, String rutaImagenApto)throws SQLException{
		
		Connection con=a.conectarBD();	
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoApartamento();	
		PreparedStatement pstmt;
		
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idApartamento);
		pstmt.setInt(2,idInmueble);
		pstmt.setInt(3,unidad);
		pstmt.setString(4,ubicarEdificio);
		pstmt.setString(5,ubicarPlanta);
		pstmt.setString(6,habitacionSocial);
		pstmt.setString(7,cocina);
		pstmt.setString(8,monoambiente);
		pstmt.setString(9,unAmbiente);
		pstmt.setString(10,dormConSuite);
		pstmt.setString(11,dormConVestidor);
		pstmt.setInt(12,baños);
		pstmt.setString(13,bañoSocial);
		pstmt.setString(14,bañoServicio);
		pstmt.setString(15,bañoJacuzzi);
		pstmt.setString(16,balcon);
		pstmt.setString(17,terrazaPrincipal);
		pstmt.setString(18,terrazaLavadero);
		pstmt.setString(19,garaje);
		pstmt.setString(20,cochAbierta);
		pstmt.setString(21,cochTechada);
		pstmt.setString(22,amenities);
		pstmt.setInt(23,gastosComunes);
		pstmt.setDouble(24,areaEdificada);
		pstmt.setString(25,detalleApto);
		pstmt.setString(26,rutaImagenApto);
		
		pstmt.executeUpdate();			
		pstmt.close();					
		a.desconectarBD(con);
	}
	
	public void nuevoTerreno(int idTerreno, int idInmueble, int FOS,double alturaEdificable,
			double frente,String situacionJuridica,
			String productividad,String conMejoras,String detalleTerr, String rutaImagenTerreno)throws SQLException{
		
		Connection con=a.conectarBD();
		ConsultasInsert consultas=new ConsultasInsert();
		String insert=consultas.nuevoTerreno();
		PreparedStatement pstmt;
		pstmt=con.prepareStatement(insert);
		pstmt.setInt(1,idTerreno);
		pstmt.setInt(2,idInmueble);
		pstmt.setInt(3,FOS);
		pstmt.setDouble(4,alturaEdificable);
		pstmt.setDouble(5,frente);
		pstmt.setString(6,situacionJuridica);
		pstmt.setString(7,productividad);
		pstmt.setString(8,conMejoras);
		pstmt.setString(9,detalleTerr);
		pstmt.setString(10,rutaImagenTerreno);
		pstmt.executeUpdate();
		pstmt.close();
		a.desconectarBD(con);
	}
	


}