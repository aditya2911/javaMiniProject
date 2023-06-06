package com.example.javaMiniProjectAditya.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javaMiniProjectAditya.model.AuthModel;

public interface AuthRepository extends JpaRepository<AuthModel,Long>{

	Optional<AuthModel> findByNameAndPassword(String username,String password);

}
