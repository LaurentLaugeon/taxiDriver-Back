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
	public String toString() {
		return "Adresse2 [rueArr=" + rueArr + ", codePostalArr=" + codePostalArr + ", villeArr=" + villeArr + "]";
	}
    
    
}

