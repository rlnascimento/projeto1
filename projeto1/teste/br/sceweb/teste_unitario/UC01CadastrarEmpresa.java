package br.sceweb.teste_unitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import br.sceweb.model.*;
public class UC01CadastrarEmpresa {
	
	public static Empresa empresa;
	public static EmpresaDAO empresaDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa();
		empresaDAO = new EmpresaDAO();
	
	}
/**
 * 
 * @throws Exception
 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC01CadastrarEmpresa_com_sucesso() {
		assertEquals(1,empresaDAO.adiciona(empresa));
	}

}
