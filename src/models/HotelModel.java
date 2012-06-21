package models;

import java.util.List;

@SuppressWarnings("unused")
public class HotelModel extends ModelBase {
	
	private final static String ID = "ID";
	private final static String IMAGENS = "IMG";
	private final static String ENDERECO = "END";
	private final static String ESTRELA = "STAR";
	private final static String DESCRICAO = "DESC";
	
	public void setHotelID(Long ID) {
		
	}
	
	public Long getHotelID() {
		return null;
		
	}
	
	public void setHotelImages(List<String> URLS) {
		
	}
	
	public List<String> getHotelImages() {
		return null;
	}
	
	public void setHotelEndereco(Endereco endereco) {
		
	}
	
	public Endereco getHotelEndereco() {
		return null;
	}
	
	public void setEstrelas(int estrelas) {
		
	}
	
	public int getEstrelas() {
		return 0;
	}
	
	public void setDescricao(String descricao) {
		
	}
	
	public String getDescricao() {
		return null;
	}
}
