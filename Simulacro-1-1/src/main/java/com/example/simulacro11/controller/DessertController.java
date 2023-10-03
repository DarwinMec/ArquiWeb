package com.example.simulacro11.controller;

import com.example.simulacro11.DTO.DessertDTO;
import com.example.simulacro11.entities.Dessert;
import com.example.simulacro11.servicesimplements.DessertServiceImp;
import com.example.simulacro11.servicies.DessertService;
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
public class DessertController {
    @Autowired
            private DessertServiceImp DsI;

    Logger logger = LoggerFactory.getLogger(DessertController.class);

    @PostMapping("/desserts")
    @PreAuthorize("hasAuthority('ASISTENTE')")
    public ResponseEntity<DessertDTO> registerDessert(@RequestBody DessertDTO dessertDTO) {
        Dessert dessert;
        try {
            logger.debug("Creando objeto");
            dessert = convertToEntity(dessertDTO);
            dessertDTO= convertToDto(DsI.register(dessert));
        }catch(Exception e){
            logger.error("Error de creación",e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se pudo crear, sorry", e);
        }
        return new ResponseEntity<DessertDTO>(dessertDTO, HttpStatus.OK);
    }

    @GetMapping("/listdesserts")
    @PreAuthorize("hasAuthority('COCINERO')")
    public List<Object[]> ListarPostrEingr(){
        return DsI.ListarPostrEingr();
    }


    private DessertDTO convertToDto(Dessert dessert) {
        ModelMapper modelMapper = new ModelMapper();
        DessertDTO dessertDTO = modelMapper.map(dessert, DessertDTO.class);
        return dessertDTO;
    }

    private Dessert convertToEntity(DessertDTO dessertDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Dessert post = modelMapper.map(dessertDTO, Dessert.class);
        return post;
    }

    private List<DessertDTO> convertToLisDto(List<Dessert> list){
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

}
