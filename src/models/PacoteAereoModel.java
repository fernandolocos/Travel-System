package models;

import java.util.List;

public class PacoteAereoModel extends PacoteModel {

	private HotelModel hotel;
	private GuiaModel guia;
	private List<PasseioModel> passeios;
	
	public HotelModel getHotel() {
		return hotel;
	}
	public void setHotel(HotelModel hotel) {
		this.hotel = hotel;
	}
	public GuiaModel getGuia() {
		return guia;
	}
	public void setGuia(GuiaModel guia) {
		this.guia = guia;
	}
	public List<PasseioModel> getPasseios() {
		return passeios;
	}
	public void setPasseios(List<PasseioModel> passeios) {
		this.passeios = passeios;
	}
	
}
