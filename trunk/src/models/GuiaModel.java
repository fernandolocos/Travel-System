package models;

import java.util.Date;
import java.util.List;

public class GuiaModel extends PessoaModel {

	private List<LinguaModel> linguasQueDomina;
	private List<Date[]> periodosDisponibilidade;
	
	public List<LinguaModel> getLinguasQueDomina() {
		return linguasQueDomina;
	}
	public void setLinguasQueDomina(List<LinguaModel> linguasQueDomina) {
		this.linguasQueDomina = linguasQueDomina;
	}
	public List<Date[]> getPeriodosDisponibilidade() {
		return periodosDisponibilidade;
	}
	public void setPeriodosDisponibilidade(List<Date[]> periodosDisponibilidade) {
		this.periodosDisponibilidade = periodosDisponibilidade;
	} 
	
}
