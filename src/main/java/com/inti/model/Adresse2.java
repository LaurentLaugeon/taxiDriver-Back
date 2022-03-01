package com.inti.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse2 implements Serializable{
	private String rueArr;
	private String codePostalArr;
	private String villeArr;
	public Adresse2() {
	
	}
	
	public Adresse2(String rueArr, String codePostalArr, String villeArr) {
		super();
		this.rueArr = rueArr;
		this.codePostalArr = codePostalArr;
		this.villeArr = villeArr;
	}

	
	public String getRueArr() {
		return rueArr;
	}

	public void setRueArr(String rueArr) {
		this.rueArr = rueArr;
	}

	public String getCodePostalArr() {
		return codePostalArr;
	}

	public void setCodePostalArr(String codePostalArr) {
		this.codePostalArr = codePostalArr;
	}

	public String getVilleArr() {
		return villeArr;
	}

	public void setVilleArr(String villeArr) {
		this.villeArr = villeArr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codePostalArr == null) ? 0 : codePostalArr.hashCode());
		result = prime * result + ((rueArr == null) ? 0 : rueArr.hashCode());
		result = prime * result + ((villeArr == null) ? 0 : villeArr.hashCode());
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
		if (codePostalArr == null) {
			if (other.codePostalArr != null)
				return false;
		} else if (!codePostalArr.equals(other.codePostalArr))
			return false;
		if (rueArr == null) {
			if (other.rueArr != null)
				return false;
		} else if (!rueArr.equals(other.rueArr))
			return false;
		if (villeArr == null) {
			if (other.villeArr != null)
				return false;
		} else if (!villeArr.equals(other.villeArr))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rueArr + ", codePostal=" + codePostalArr + ", ville=" + villeArr + "]";
	}
	
}
