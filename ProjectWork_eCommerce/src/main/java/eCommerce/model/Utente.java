package eCommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="utente")
public class Utente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cod_utente")
    private Integer codUtente;

    @NotBlank(message="username obbligatorio")
    @Size(min=3, max=20, message="minimo 3/massimo 20 caratteri")
    @Column(name = "username")
    private String username;

    @NotBlank(message="email obbligatoria")
    @Pattern(regexp = "(.+?)@(.+?)", message="email non valida")
    @Column(name = "email")
    private String email;

    @NotNull(message="password obbligatoria")
    @Column(name="password")
    private String password;
    
    @Column(name="admin")
    private Boolean admin;

	public Integer getCodUtente() {
		return codUtente;
	}
	public void setCodUtente(Integer codUtente) {
		this.codUtente = codUtente;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Utente [codUtente=" + codUtente + ", username=" + username + ", email=" + email + ", password="
				+ password + ", admin=" + admin + "]";
	}
    
}
