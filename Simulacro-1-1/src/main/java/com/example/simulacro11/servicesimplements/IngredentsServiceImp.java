package com.example.simulacro11.servicesimplements;

import com.example.simulacro11.DTO.DessertDTO;
import com.example.simulacro11.DTO.IngredentsDTO;
import com.example.simulacro11.entities.Dessert;
import com.example.simulacro11.entities.Ingredents;
import com.example.simulacro11.repositories.DessertRepository;
import com.example.simulacro11.repositories.IngredentsRepository;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IngredentsServiceImp {

    @Autowired
    private IngredentsRepository iRepository;




    @Transactional
    public Ingredents register(Ingredents ingredents){return iRepository.save(ingredents);}

    public List<Ingredents> list(){return iRepository.findAll();}




    public List<IngredentsDTO> convertToLisDto(List<Ingredents> list){
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    private IngredentsDTO convertToDto(Ingredents ingredents) {
        ModelMapper modelMapper = new ModelMapper();
        IngredentsDTO ingredentsDTO = modelMapper.map(ingredents, IngredentsDTO.class);
        return ingredentsDTO;
    }
}
