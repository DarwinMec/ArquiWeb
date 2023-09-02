package com.easyjobs.introduccion.controller;
import com.easyjobs.introduccion.entities.Trabajador;
import com.easyjobs.introduccion.interfaceservice.TrabajadorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class TrabajadorController {

    @Autowired
    private TrabajadorInterface trabajadorInterface;
    @PostMapping("/trabajador")
    public Trabajador register(@RequestBody Trabajador trabajador){return trabajadorInterface.register(trabajador);}
    @GetMapping("/trabajadores")
    public List<Trabajador> getTrabajadores(){return trabajadorInterface.getTrabajadores();}
    @GetMapping("/trabajador{id}")
    public Trabajador search(@PathVariable(value = "id") Long id){return trabajadorInterface.search(id);}


}
