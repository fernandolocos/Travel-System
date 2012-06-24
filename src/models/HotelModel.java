package models;

import java.util.List;

public class HotelModel extends AbstractModelBase {
	
	private Long IDHotel;
	private List<String> imagensDoHotel;
	private EnderecoModel endereco;
	private int estrelas;
	private String descricao;
	
	public Long getIDHotel() {
		return IDHotel;
	}
	public void setIDHotel(Long iDHotel) {
		IDHotel = iDHotel;
	}
	public List<String> getImagensDoHotel() {
		return imagensDoHotel;
	}
	public void setImagensDoHotel(List<String> imagensDoHotel) {
		this.imagensDoHotel = imagensDoHotel;
	}
	public EnderecoModel getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoModel endereco) {
		this.endereco = endereco;
	}
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
