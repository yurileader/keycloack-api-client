package com.yurialves.keycloakapiclient.repository;

import com.yurialves.keycloakapiclient.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
}
