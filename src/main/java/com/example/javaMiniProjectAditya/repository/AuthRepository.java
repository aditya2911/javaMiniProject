package com.example.javaMiniProjectAditya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javaMiniProjectAditya.model.AuthModel;

public interface AuthRepository extends JpaRepository<AuthModel,Long>{

	

}
