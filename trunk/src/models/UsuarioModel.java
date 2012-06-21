package models;

import enums.EnumLogin;

public class UsuarioModel {
	// viajarfacil.com/logon/logar
	public void logar(String usuario, String senha) {
		LoginDAO.logar(usuario, senha);
		loginSucesso();
		mostrarErro(EnumLogin.DadosErrados);
	}
	
	// Atualizar a página
	private void loginSucesso() {
	
	}
	
	// Mostrar 
	private void mostrarErro(EnumLogin erro) {
		
	}
}
