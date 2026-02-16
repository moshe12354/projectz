package com.example.projectz.model;



import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name="apt")


public class Apt implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Length(max = 50)
    private String city; //city fullName

    @NotBlank
    @Length(min = 1 ,max = 50)
    private String street; // street

    @NotBlank
    private Integer size; // size

    @NotBlank
    @Min(100)
    private Integer pricePerMeter; //pricePerMeter

    @NotBlank
    private String type;


    public Apt() {
    }

    public Apt(String city,String street, Integer size, Integer pricePerMeter, String type) {
        this.city = city;
        this.street = street;
        this.size = size;
        this.pricePerMeter = pricePerMeter;
        this.type = type;
    }

    public void setCity(@NotBlank @Length(max = 50) String city) { this.city = city; }
    public void setStreet(@NotBlank @Length(min = 1 ,max = 50) String street) { this.street = street; }
    public void setSize(@NotBlank Integer size) { this.size = size; }
    public void setPricePerMeter(@NotBlank @Min(100) Integer pricePerMeter) { this.pricePerMeter = pricePerMeter; }
    public void setType(@NotBlank String type) { this.type = type; }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getPricePerMeter() {
        return pricePerMeter;
    }

    public String getType() {
        return type;
    }
}
