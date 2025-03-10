package com.jorge.porfoliospring.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jorge.porfoliospring.model.Entity.FormularioC;

@Repository
public interface FormularioCRepository extends JpaRepository<FormularioC, Long> {
    
}
