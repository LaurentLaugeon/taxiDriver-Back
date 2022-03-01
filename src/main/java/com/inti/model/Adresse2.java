package com.inti.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse2 implements Serializable{
	private String rue_2;
	private String codePostal_2;
	private String ville_2;
	public Adresse2() {
	
	}
	
	public Adresse2(String rue_2, String codePostal_2, String ville_2) {
		super();
		this.rue_2 = rue_2;
		this.codePostal_2 = codePostal_2;
		this.ville_2 = ville_2;
	}

	public String getRue() {
		return rue_2;
	}
	public void setRue(String rue_2) {
		this.rue_2 = rue_2;
	}
	public String getCodePostal() {
		return codePostal_2;
	}
	public void setCodePostal(String codePostal_2) {
		this.codePostal_2 = codePostal_2;
	}
	public String getVille() {
		return ville_2;
	}
	public void setVille(String ville_2) {
		this.ville_2 = ville_2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codePostal_2 == null) ? 0 : codePostal_2.hashCode());
		result = prime * result + ((rue_2 == null) ? 0 : rue_2.hashCode());
		result = prime * result + ((ville_2 == null) ? 0 : ville_2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse2 other = (Adresse2) obj;
		if (codePostal_2 == null) {
			if (other.codePostal_2 != null)
				return false;
		} else if (!codePostal_2.equals(other.codePostal_2))
			return false;
		if (rue_2 == null) {
			if (other.rue_2 != null)
				return false;
		} else if (!rue_2.equals(other.rue_2))
			return false;
		if (ville_2 == null) {
			if (other.ville_2 != null)
				return false;
		} else if (!ville_2.equals(other.ville_2))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Adresse [rue_2=" + rue_2 + ", codePostal_2=" + codePostal_2 + ", ville_2=" + ville_2 + "]";
	}
	
}
