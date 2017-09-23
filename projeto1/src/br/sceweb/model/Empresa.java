package br.sceweb.model;

public class Empresa {
	String cnpj;
	String nomeDaEmpresa;
	String nomeFantasia;
	String endereco;
	String telefone;  
	/* 
	 Never gonna give you up
	 Never gonna let you down
	 Never gonna say good bye
	 And hurt you 
	*/
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if(cnpj.equals("")){
			throw new IllegalArgumentException("Cnpj inválido!");
		}
		else{
			this.cnpj = cnpj;
		}
	}
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		if(nomeDaEmpresa.equals("")){
			throw new IllegalArgumentException("Nome da empresa inválido!");
		}
		else{
			this.nomeDaEmpresa = nomeDaEmpresa;
		}
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		if(nomeFantasia.equals("")){
			throw new IllegalArgumentException("Nome Fantasia inválido!");
		}
		else{
			this.nomeFantasia = nomeFantasia;
		}
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco.equals("")){
			throw new IllegalArgumentException("Endereço inválido!");
		}
		else{
			this.endereco = endereco;
		}
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if(telefone.equals("")){
			throw new IllegalArgumentException("Telefone inválido!");
		}
		else{
			this.telefone = telefone;
		}
	}
}
