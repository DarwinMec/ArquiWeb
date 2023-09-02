package com.easyjobs.introduccion.services;
import com.easyjobs.introduccion.entities.Trabajador;
import com.easyjobs.introduccion.interfaceservice.TrabajadorInterface;
import com.easyjobs.introduccion.repositories.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class TrabajadorService implements TrabajadorInterface {
 @Autowired
    private TrabajadorRepository trabajadorRepository;
   @Override
   @Transactional(rollbackFor = Exception.class)
    public Trabajador register(Trabajador trabajador){return trabajadorRepository.save(trabajador);}

   @Override
    public List<Trabajador>getTrabajadores(){return trabajadorRepository.findAll();}

   @Override
   public Trabajador search(Long id){return trabajadorRepository.findById(id).get();}


}
