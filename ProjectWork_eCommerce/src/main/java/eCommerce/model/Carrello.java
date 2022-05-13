package eCommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="carrello")
public class Carrello {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Max(value=99999, message="massimo 5 cifre")
	@Column(name="cod_carrello", nullable=true)
	private Integer codCarrello;
	
	@NotNull(message="codice carrello obbligatorio")
	@Max(value=99999, message="massimo 5 cifre")
	@JoinColumn(name="cod_utente")
	private Integer codUtente;
	
	@NotNull(message="codice carrello obbligatorio")
	@Max(value=99999, message="massimo 5 cifre")
	@JoinColumn(name="cod_prodotto")
	private Integer codProdotto;
		
	@NotNull(message="quantita' obbligatoria")
	@Column(name="quantita")
	private Integer quantita;

	public Integer getCodProdotto() {
		return codProdotto;
	}
	public void setCodProdotto(Integer codProdotto) {
		this.codProdotto = codProdotto;
	}
	public Integer getCodCarrello() {
		return codCarrello;
	}
	public void setCodCarrello(Integer codCarrello) {
		this.codCarrello = codCarrello;
	}
	public Integer getCodUtente() {
		return codUtente;
	}
	public void setCodUtente(Integer codUtente) {
		this.codUtente = codUtente;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	
	@Override
	public String toString() {
		return "Carrello [codCarrello=" + codCarrello + ", codUtente=" + codUtente + ", codProdotto=" + codProdotto
				+ ", quantita=" + quantita + "]";
	}
	
}

