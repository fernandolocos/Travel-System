package models;

import enums.EnumFormasPagamento;

public class BridgePagamento implements IBridge {

	@Override
	public void connectToAPI() {
		// TODO Auto-generated method stub

	}
	
	public boolean pagarPacote(Long valor, EnumFormasPagamento pagar) {
		return false;
	}

}
