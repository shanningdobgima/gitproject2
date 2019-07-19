package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAresse;
    
	private String rue;
	private String ville;
	
	
	public Adresse(String rue, String ville) {
		this.rue = rue;
		this.ville = ville;
	}
	public Adresse() {
		
	}
	public int getIdAresse() {
		return idAresse;
	}
	public void setIdAresse(int idAresse) {
		this.idAresse = idAresse;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [idAresse=" + idAresse + ", rue=" + rue + ", ville=" + ville + "]";
	}
	
	
	
}
