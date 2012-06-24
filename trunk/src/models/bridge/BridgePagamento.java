package models.bridge;

import enums.EnumFormasPagamento;

public class BridgePagamento implements IBridge {

	@SuppressWarnings("unused")
	private API api;
	
	@Override
	public void connectToAPI() {
		// TODO Auto-generated method stub

	}
	
	public boolean pagarPacote(Long valor, EnumFormasPagamento pagar) {
		return false;
	}

}
