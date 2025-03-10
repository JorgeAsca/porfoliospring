package com.jorge.porfoliospring.model.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jorge.porfoliospring.model.Repository.FormularioCRepository;


import com.jorge.porfoliospring.model.Entity.FormularioC;

@Service
public class FormularioCService {
    @Autowired
    private FormularioCRepository formularioCRepository;

    public void guardar(FormularioC formularioC) {
        formularioCRepository.save(formularioC);
    }
    
}
