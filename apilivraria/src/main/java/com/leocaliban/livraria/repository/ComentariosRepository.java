package com.leocaliban.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leocaliban.livraria.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
