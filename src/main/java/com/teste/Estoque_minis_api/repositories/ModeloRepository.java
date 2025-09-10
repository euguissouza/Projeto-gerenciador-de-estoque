package com.teste.Estoque_minis_api.repositories;

import com.teste.Estoque_minis_api.entites.Modelos;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ModeloRepository extends JpaRepository<Modelos, String> {

}
