package logicapersistencia.accesoBD;

public class ConsultasUpdate{
	

			public String updatePersona(){
				String consulta="UPDATE personas SET nombrePer=?,emailPer=?,detallePer=? WHERE idPersona=?";
				return consulta;
			}
			
			public String updatePropietario(){
				String consulta="UPDATE propietarios SET idPersona=?,detalleCli=? WHERE idPropietario=?";
				return consulta;
			}
			
			public String updateTelefono(){
				String consulta="UPDATE tel_personas SET idPersona=?,detalleTel=? WHERE telPersona=?";
				return consulta;
			}
			
			//***************************************************
			//**************************************************************
			//******************************************************************************
			
			public String updateInmueble(){
				String consulta ="UPDATE inmueble2 SET tipoMonedaPrecioLista=?,"
						+ "precioLista=?,contribucionInmobiliaria=?,"
						+"areaTotal=?,exclusividad=?,estadoDisponibilidad=?,fechaIngreso=?,"
						+"direccion=?,padron=?,barrio=?, departamento=?, estadoDetalle=?,"
						+ "detalleInmueble=?, antiguedad=?, estadoConservacion=? WHERE refInmueble=?";
				return consulta;
			}
			
			
			
			public String updateCasa(){
				String consulta="UPDATE casas SET idInmueble=?, situacionJuridica=?,estructura=?,habitacionSocial=?,estar=?,"
						+"dormitorios=?,dormConSuite=?,dormSocial=?,ba�os=?,ba�oServicio=?,ba�oSocial=?,ba�oConJacuzzi=?,fondo=?,patio=?,"
						+"jardin=?,garaje=?,cocheraAbierta=?,cocheraTechada=?,amenities=?,areaEdificada=?,metrosFrente=?,detalleCasa=?,"
						+ "rutaImagenCasa=? WHERE idCasa=?";
				return consulta;
			}
			
			
			public String updateApartamento(){
				String consulta="UPDATE apartamentos SET idInmueble=?,unidad=?,ubicarEdificio=?,ubicarPlanta=?,"
						+"habitacionSocial=?,cocina=?,monoambiente=?,unAmbiente=?,dormConSuite=?,dormConVestidor=?,ba�os=?,ba�oSocial=?,"
						+"ba�oServicio=?,ba�oJacuzzi=?,balcon=?,terrazaPrincipal=?,terrazaLavadero=?,garaje=?,cochAbierta=?,cochTechada=?,"
						+"amenities=?,gastosComunes=?,areaEdificada=?,detalleApto=?, rutaImagenApto=? WHERE idApartamento=?;";
				return consulta;
			}
			
			public String updateTerreno(){
				String consulta="UPDATE terrenos SET idInmueble=?,FOS=?,alturaEdificable=?,frente=?,situacionJuridicaSuelo=?,"
						+"productividad=?,conMejoras=?,detalleTerr=?, rutaImagenTerreno=?  WHERE idTerreno=?;";
				return consulta;
			}
	
	

	
}