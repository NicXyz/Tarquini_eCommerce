package eCommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="prodotto")
public class Prodotto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Max(value=99999, message="massimo 5 cifre")
	@Column(name="cod_prodotto")
	private Integer codProdotto;
	
	@NotBlank(message="nome obbligatorio")
	@Column(name="nome")
	private String nome;
	
	@Size(max=300, message="massimo 300 caratteri")
	@Column(name="descrizione")
	private String descrizione;
	
	@NotNull(message="prezzo obbligatorio")
	@DecimalMin(value="0.01", message="prezzo non valido")
	@Column(name="prezzo")
	private double prezzo;
	
	public Integer getCodProdotto() {
		return codProdotto;
	}
	public void setCodProdotto(Integer codProdotto) {
		this.codProdotto = codProdotto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return "Prodotto [codProdotto=" + codProdotto + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo="
				+ prezzo + "]";
	}
	
}

