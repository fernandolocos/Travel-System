package models.dao;

import enums.EnumLogin;

public class UsuarioDAO {
	
	public EnumLogin logar(String usuario, String senhaSalgada) {
		return EnumLogin.Sucesso;
	}
	
	public String gerarNovaSenha(Long ID) {
		return null;
	}
	
	public boolean alterarDadosCadastrais(String nome, String email, String senha, 
			String RG, String CPF, int idade) {
		return false;
	}

	public boolean cadastrar(String nome, String senha, String sal, String email, 
			String RG, String CPF, int idade) {
		return false;
	}
}
