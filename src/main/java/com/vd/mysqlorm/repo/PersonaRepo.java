package com.vd.mysqlorm.repo;

import com.vd.mysqlorm.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long>
{

}