package models;

import views.LayoutPrincipal;
import enums.EnumLogin;

public class Usuario {
	// viajarfacil.com/logon/logar
	public void logar(String usuario, String senha) {
		LoginDAO.logar(usuario, senha);
		loginSucesso();
		mostrarErro(EnumLogin.DadosErrados);
	}
	
	// Atualizar a página
	private void loginSucesso() {
		LayoutPrincipal.INSTANCE.atualizarPaginaLogou();
	}
	
	// Mostrar 
	private void mostrarErro(EnumLogin erro) {
		LayoutPrincipal.INSTANCE.mostrarErroLogin(erro);
	}
}
