package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Niveau implements Serializable{
	@Id  @GeneratedValue
	private Long id_niveau;

	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}
//HIIII AM TESTING NEW STUFF OF GIT

	public Long getId_niveau() {
		return id_niveau;
	}

	public void setId_niveau(Long id_niveau) {
		this.id_niveau = id_niveau;
	}
	
	
}
