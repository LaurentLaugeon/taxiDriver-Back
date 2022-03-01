package com.inti.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse2 implements Serializable{
	private String rue_arr;
	private String codePostal_arr;
	private String ville_arr;
	public Adresse2() {
	
	}
		public Adresse2(String rue_arr, String codePostal_arr, String ville_arr) {
		super();
		this.rue_arr = rue_arr;
		this.codePostal_arr = codePostal_arr;
		this.ville_arr = ville_arr;
	}

	public String getRue() {
		return rue_arr;
	}
	public void setRue(String rue_arr) {
		this.rue_arr = rue_arr;
	}
	public String getCodePostal() {
		return codePostal_arr;
	}
	public void setCodePostal(String codePostal_arr) {
		this.codePostal_arr = codePostal_arr;
	}
	public String getVille() {
		return ville_arr;
	}
	public void setVille(String ville_arr) {
		this.ville_arr = ville_arr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((codePostal_arr == null) ? 0 : codePostal_arr.hashCode());
		result = prime * result + ((rue_arr == null) ? 0 : rue_arr.hashCode());
		result = prime * result + ((ville_arr == null) ? 0 : ville_arr.hashCode());
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
		if (codePostal_arr == null) {
			if (other.codePostal_arr != null)
				return false;
		} else if (!codePostal_arr.equals(other.codePostal_arr))
			return false;
		if (rue_arr == null) {
			if (other.rue_arr != null)
				return false;
		} else if (!rue_arr.equals(other.rue_arr))
			return false;
		if (ville_arr == null) {
			if (other.ville_arr != null)
				return false;
		} else if (!ville_arr.equals(other.ville_arr))

			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Adresse [rue_arr=" + rue_arr + ", codePostal_arr=" + codePostal_arr + ", ville_arr=" + ville_arr + "]";

	}
	
}
