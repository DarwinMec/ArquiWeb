package com.example.simulacro11.entities;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="ingredents")
public class Ingredents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngredient;
    @Column(name = "nameIngredient",length = 45,nullable = false)
    private String nameIngredient;
    @Column(name = "quantityIngredient",nullable = false)
    private int quantityIngredient;
    @Column(name = "unitMeasurementIngredient",length = 45,nullable = false)
    private String unitMeasurementIngredient;
    @ManyToOne(targetEntity = Dessert.class)
    @JoinColumn(name = "idDessert")
    private Dessert dessert;




    public Ingredents(){}

    public Ingredents(int idIngredient, String nameIngredient, int quantityIngredient, String unitMeasurementIngredient, Dessert dessert) {
        this.idIngredient = idIngredient;
        this.nameIngredient = nameIngredient;
        this.quantityIngredient = quantityIngredient;
        this.unitMeasurementIngredient = unitMeasurementIngredient;
        this.dessert = dessert;
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public int getQuantityIngredient() {
        return quantityIngredient;
    }

    public void setQuantityIngredient(int quantityIngredient) {
        this.quantityIngredient = quantityIngredient;
    }

    public String getUnitMeasurementIngredient() {
        return unitMeasurementIngredient;
    }

    public void setUnitMeasurementIngredient(String unitMeasurementIngredient) {
        this.unitMeasurementIngredient = unitMeasurementIngredient;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
