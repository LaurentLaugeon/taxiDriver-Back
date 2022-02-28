package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	private String nom;
	private String prenom;
	@Column(unique = true)
	private String username;
	private String password;
	private String email;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profil", 
	joinColumns = @JoinColumn(name="id_user", referencedColumnName="idUtilisateur"),
	inverseJoinColumns = @JoinColumn(name="id_role", referencedColumnName="idRole"))
	private Set<Role> roles = new HashSet<>();

	public Utilisateur() {
	}

	public Utilisateur(String nom, String prenom, String username, String password, String email, Set<Role> roles) {
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.email = email;
		this.roles = roles;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
