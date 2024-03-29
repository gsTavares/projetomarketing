package com.fatec.quintosemestre.projetomarketing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.quintosemestre.projetomarketing.model.Mensagem;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long>{

    List<Mensagem> findByUsuarioId(Long idUsuario);
    
}
