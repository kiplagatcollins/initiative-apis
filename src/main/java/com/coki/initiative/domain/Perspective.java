package com.coki.initiative.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import  org.hibernate.annotations.Cache;

@Entity
@Table(name = "perspective")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Perspective {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Column(name="name",length = 50)
    private String name;

    @Size(max = 50)
    @Column(name = "description")
    private  String description;

    @Column(name = "weight")
    private Integer weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Perspective{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
}
