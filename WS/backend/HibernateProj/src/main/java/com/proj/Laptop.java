package com.proj;

import jakarta.persistence.*;
import org.hibernate.sql.ast.tree.from.MappedByTableGroup;

import java.util.List;

@Entity
public class Laptop {

    @Id
    private int lap_id;

    private String brand;
    private String model;
    private int ram;

//    @ManyToMany(mappedBy="laptops")
//    private List<Aliens> aliens;

    public int getLap_id() {
        return lap_id;
    }

    public void setLap_id(int lap_id) {
        this.lap_id = lap_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

//    public List<Aliens> getAliens() {
//        return aliens;
//    }
//
//    public void setAliens(List<Aliens> aliens) {
//        this.aliens = aliens;
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lap_id=" + lap_id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}