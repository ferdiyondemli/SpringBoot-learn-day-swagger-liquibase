package com.ferdi.demo.hayvanlar.repository;

import com.ferdi.demo.hayvanlar.entity.Hayvan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface HayvanRepository extends JpaRepository<Hayvan, Long> {
}
