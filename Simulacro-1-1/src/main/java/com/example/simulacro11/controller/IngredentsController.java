package com.example.simulacro11.controller;

import com.example.simulacro11.DTO.IngredentsDTO;
import com.example.simulacro11.entities.Ingredents;
import com.example.simulacro11.servicesimplements.IngredentsServiceImp;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class IngredentsController {
    @Autowired
            private IngredentsServiceImp iSI;
    Logger logger = LoggerFactory.getLogger(IngredentsController.class);


    @PostMapping("/ingredients")
    @PreAuthorize("hasAuthority('COCINERO')")
    public ResponseEntity<IngredentsDTO> registerIngre(@RequestBody IngredentsDTO ingredentsDTO) {
        Ingredents ingredents;
        try {
            logger.debug("Creando objeto");
            ingredents = convertToEntity(ingredentsDTO);
            ingredentsDTO= convertToDto(iSI.register(ingredents));
        }catch(Exception e){
            logger.error("Error de creación",e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se pudo crear, sorry", e);
        }
        return new ResponseEntity<IngredentsDTO>(ingredentsDTO, HttpStatus.OK);
    }
    private IngredentsDTO convertToDto(Ingredents ingredents) {
        ModelMapper modelMapper = new ModelMapper();
        IngredentsDTO ingredentsDTO = modelMapper.map(ingredents, IngredentsDTO.class);
        return ingredentsDTO;
    }
    /*@PostMapping("/ingredients")
    @PreAuthorize("hasAuthority('Cocinero')")
    public void registerIngre(@RequestBody IngredentsDTO ingredentsDTO) {
        ModelMapper m = new ModelMapper();
        Ingredents a = m.map(ingredentsDTO, Ingredents.class);
        iSI.insertar(a);
    }*/

    private Ingredents convertToEntity(IngredentsDTO ingredentsDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Ingredents post = modelMapper.map(ingredentsDTO, Ingredents.class);
        return post;
    }

    private List<IngredentsDTO> convertToLisDto(List<Ingredents> list){
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
}
