package com.example.javaMiniProjectAditya.model;

import org.springframework.stereotype.Service;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity

@Table(name = "auth")
@Getter
@Setter
public class AuthModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long id;

	
	@Column
	@Nonnull
	private String name;
	
	@Column 
	@Nonnull
	Long UCID;
	
	
	public AuthModel(String name2, long ucid2) {
		this.name = name2;
		this.UCID = ucid2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
