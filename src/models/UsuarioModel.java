package models;

import enums.EnumLogin;

@SuppressWarnings("unused")
public class UsuarioModel extends PassageiroModel {
	
	private final static String ID = "ID";
	private final static String SENHA = "PASS";
	private final static String SALT = "Sal";
	private final static String EMAIL = "EM";
	
	private UsuarioDAO dao;
	
	public void setID(Long ID) {
		
	}
	
	public Long getID() {
		return null;
	}
	
	public void setSenha(String senha) {
		
	}
	
	public String getSenha() {
		return null;
	}
	
	public void setSal(String sal) {
		
	}
	
	public String getSal() {
		return null;
	}
	
	public void setEmail(String email) {
		
	}
	
	public String getEmail() {
		return null;
	}
	
	public EnumLogin logar(String usuario, String senhaSalgada) {
		return null;
	}
	
	private String salgarSenha(String senha, String sal) {
		return null;
	}
	
	public boolean alterarDadosCadastrais() {
		return false;
	}
	
	public boolean gerarNovaSenha() {
		return false;
	}
	
	public boolean cadastrar() {
		return false;
	}
	
}
