package com.example.javaMiniProjectAditya.model;

import org.springframework.stereotype.Service;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity

@Table(name = "auth")

public class AuthModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public  long id;

	
	@Column
	@Nonnull
	public String name;
	
	@Column 
	@Nonnull
	public Long UCID;
	
	@Column
	@Nonnull
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getUCID() {
		return UCID;
	}

	public void setUCID(Long uCID) {
		UCID = uCID;
	}

	public AuthModel(String name2, long ucid2,String password) {
		this.name = name2;
		this.UCID = ucid2;
		this.password = password;
	}
	
	public AuthModel() {
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
