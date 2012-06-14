package controllers;

import enums.EnumLogin;
import views.LayoutPrincipal;
import models.LoginDAO;

// viajarfacil.com/logon
public class EfetuarLogonController {
	
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
