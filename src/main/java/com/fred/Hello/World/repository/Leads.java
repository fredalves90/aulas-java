package com.fred.Hello.World.repository;

import com.fred.Hello.World.models.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Leads  extends JpaRepository<Leads, Long> {


}
