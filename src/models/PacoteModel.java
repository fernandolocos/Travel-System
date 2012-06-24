package models;

import java.util.Date;
import java.util.List;

import models.dao.PacoteDAO;

@SuppressWarnings("unused")
public class PacoteModel extends AbstractModelBase {
	
	private Long IDPacote;
	private UsuarioModel usuarioProprietario;
	private List<PassageiroModel> passageiros;
	private EnderecoModel localPartida;
	private EnderecoModel localDestino;
	private Date dataPartida;
	private Date dataVolta;
	private String URLRoteiroPDF;
	
	public String getURLRoteiroPDF() {
		return URLRoteiroPDF;
	}

	public void setURLRoteiroPDF(String uRLRoteiroPDF) {
		URLRoteiroPDF = uRLRoteiroPDF;
	}

	public EnderecoModel getLocalPartida() {
		return localPartida;
	}

	public void setLocalPartida(EnderecoModel localPartida) {
		this.localPartida = localPartida;
	}

	public EnderecoModel getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(EnderecoModel localDestino) {
		this.localDestino = localDestino;
	}

	public Date getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}

	public Date getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(Date dataVolta) {
		this.dataVolta = dataVolta;
	}

	private PacoteDAO dao;
	
	public Long getIDPacote() {
		return IDPacote;
	}
	
	public void setIDPacote(Long iDPacote) {
		IDPacote = iDPacote;
	}
	
	public UsuarioModel getUsuarioProprietario() {
		return usuarioProprietario;
	}
	
	public void setUsuarioProprietario(UsuarioModel usuarioProprietario) {
		this.usuarioProprietario = usuarioProprietario;
	}
	
	public List<PassageiroModel> getPassageiros() {
		return passageiros;
	}
	
	public void setPassageiros(List<PassageiroModel> passageiros) {
		this.passageiros = passageiros;
	}
}
