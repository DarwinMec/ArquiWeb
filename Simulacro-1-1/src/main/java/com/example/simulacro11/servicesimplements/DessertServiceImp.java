package com.example.simulacro11.servicesimplements;

import com.example.simulacro11.DTO.DessertDTO;
import com.example.simulacro11.entities.Dessert;
import com.example.simulacro11.repositories.DessertRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DessertServiceImp {
    @Autowired
    private DessertRepository dRepository;


    @Transactional
    public Dessert register(Dessert dessert){return dRepository.save(dessert);}

    public List<Dessert> list(){return dRepository.findAll();}

    public List<DessertDTO> convertToLisDto(List<Dessert> list){
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    //public List<>
    public List<Object[]> ListarPostrEingr(){return dRepository.ListarPostrEingr();}


    private DessertDTO convertToDto(Dessert dessert) {
        ModelMapper modelMapper = new ModelMapper();
        DessertDTO dessertDTO = modelMapper.map(dessert, DessertDTO.class);
        return dessertDTO;
    }


}
