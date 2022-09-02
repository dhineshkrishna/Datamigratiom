package com.migrate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.migrate.entity.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{

}
