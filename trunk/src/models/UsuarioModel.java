package models;

import models.dao.UsuarioDAO;
import enums.EnumLogin;

@SuppressWarnings("unused")
public class UsuarioModel extends PassageiroModel {
	
	private Long idUsuario;
	private String senha;
	private String sal;
	private String email;
	private UsuarioDAO dao;
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
