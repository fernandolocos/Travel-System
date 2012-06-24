package models;

import java.util.List;

public class LinguaModel {

	private String nome;
	private List<EnderecoModel> paisesQueUsam;
	private String codigoISO;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<EnderecoModel> getPaisesQueUsam() {
		return paisesQueUsam;
	}
	public void setPaisesQueUsam(List<EnderecoModel> paisesQueUsam) {
		this.paisesQueUsam = paisesQueUsam;
	}
	public String getCodigoISO() {
		return codigoISO;
	}
	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}
	
}
