package br.sceweb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmpresaDAO {

	public int adiciona(Empresa empresa){
		PreparedStatement ps;
		int codigoRetorno = 0;
		try {
			Connection conn = new FabricaDeConexoes().getConnection();
		} 
		catch (Exception e){
			throw new RuntimeException(e);
		}
		return 1;
	}
	
}
