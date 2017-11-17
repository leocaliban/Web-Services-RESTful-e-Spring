package com.leocaliban.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leocaliban.livraria.domain.Autor;

public interface AutoresRepository  extends JpaRepository<Autor, Long>{

}
