package models.bridge;

import java.util.Date;
import java.util.List;

import models.HotelModel;

public class BridgeHotel implements IBridge {
	
	@SuppressWarnings("unused")
	private API api;

	@Override
	public void connectToAPI() {
		// TODO Auto-generated method stub
	}
	
	public List<HotelModel> listarHoteis(Long latitude, Long longitude, Long raio, Date inicio, Date fim, int quantidadePessoas) {
		return null;
	}
	
	public boolean reservarHotel(Long idHotel, int quantidadePessoas) {
		return false;
	}

}
