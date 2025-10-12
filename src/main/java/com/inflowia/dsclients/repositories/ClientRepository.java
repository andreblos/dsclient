package com.inflowia.dsclients.repositories;

import com.inflowia.dsclients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}


