package com.leocaliban.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leocaliban.livraria.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
