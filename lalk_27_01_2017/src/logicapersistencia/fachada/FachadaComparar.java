package logicapersistencia.fachada;

import java.sql.SQLException;

import logicapersistencia.accesoBD.AccesoBD;
import logicapersistencia.accesoBD.AccesoBDComparar;

public class FachadaComparar {



	public boolean existeAlquiler(String idAlquiler) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existeAlquiler(idAlquiler);
	}



	public boolean existeArrendatario(String idArrendatario) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existeArrendatario(idArrendatario);
	}



//	public boolean existeComprador(String idComprador) throws SQLException {
//		AccesoBDComparar a = new AccesoBDComparar();
//		return a.existeInmueble(idComprador);
//	}
//
//	public boolean existeFormaDePago(String formaDePago) throws SQLException {
//		AccesoBDComparar a = new AccesoBDComparar();
//		return a.existeInmueble(formaDePago);
//	}
//
//	public boolean existeOperador(String idOperador) throws SQLException {
//		AccesoBDComparar a = new AccesoBDComparar();
//		return a.existeInmueble(idOperador);
//	}



//	public boolean existeTelefonoo(String idPersona) throws SQLException {
//		AccesoBDComparar a = new AccesoBDComparar();
//		return a.existeInmueble(idPersona);
//	}


	///---------------------------- A PARTIR DE ACÁ YA ESTÁ INSTANCIADO  -----------------------//
	
	
	public boolean existeUsuario(String usuario, String clave) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existeUsuario(usuario, clave);
	}


	public boolean existeCasa(int idCasa) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existeCasa(idCasa);
	}
	
	public boolean existeInmueble(int idInmueble) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existeInmueble(idInmueble);
	}
	
	public boolean existePersona(int idPersona) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existePersona(idPersona);
	}

	public boolean existePropietario(int idPropietario) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existePropietario(idPropietario);
	}
	
	public boolean existeApartamento(int idApartamento) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existeApartamento(idApartamento);
	}
	public boolean existeTerreno(int idTerreno) throws SQLException {
		AccesoBDComparar a = new AccesoBDComparar();
		return a.existeTerreno(idTerreno);
	}

}
