package com.teste.Estoque_minis_api.repositories;

import com.teste.Estoque_minis_api.entites.Modelos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModeloRepository extends JpaRepository<Modelos, String> {
    List<Modelos> findByMarca(String marca);
}
