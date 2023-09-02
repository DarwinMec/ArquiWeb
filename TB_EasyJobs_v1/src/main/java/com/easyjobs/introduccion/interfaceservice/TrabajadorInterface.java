package com.easyjobs.introduccion.interfaceservice;
import com.easyjobs.introduccion.entities.Trabajador;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;


public interface TrabajadorInterface {
    Trabajador register(Trabajador trabajador);
    List <Trabajador> getTrabajadores();
    Trabajador search(Long id);
}
