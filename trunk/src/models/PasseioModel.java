package models;

public class PasseioModel extends AbstractModelBase {
	
	private String nome;
	private EnderecoModel localDoPasseio;
	private Double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EnderecoModel getLocalDoPasseio() {
		return localDoPasseio;
	}
	public void setLocalDoPasseio(EnderecoModel localDoPasseio) {
		this.localDoPasseio = localDoPasseio;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
