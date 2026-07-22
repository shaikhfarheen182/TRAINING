package com.proj;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Aliens {

    @Id
//    @JoinColumn(name = "alien_id")  //one to many
    private int aid;
    private String aname;
    private String technology;

//        @OneToMany   //(fetch = FetchType.EAGER)
//    @ManyToMany
//    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }


    //ONE TO MANY
//    public List<Laptop> getLaptops() {
//        return laptops;
//    }
//
//    public void setLaptops(List<Laptop> laptops) {
//        this.laptops = laptops;
//    }

    @Override
    public String toString() {
        return "Aliens{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", technology='" + technology + '\'' +
//                ", laptopId=" + laptops+  // ONE TO MANY
                '}';
    }
}