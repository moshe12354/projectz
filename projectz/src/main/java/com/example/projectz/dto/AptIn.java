package com.example.projectz.dto;

import com.example.projectz.model.Apt;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
public class AptIn implements Serializable {
    @NotBlank
    @Length(max = 50)
    private String city;

    @NotBlank
    @Length(min = 1 ,max = 50)
    private String street;

    @NotBlank
    private Integer size;

    @NotBlank
    @Min(100)
    private Integer pricePerMeter; //pricePerMeter

    @NotBlank
    private String type;


    public Apt toApt(AptIn aptIn) {
        return new Apt(
                aptIn.getCity(),
                aptIn.getStreet(),
                aptIn.getSize(),
                aptIn.getPricePerMeter(),
                aptIn.getType()
        );
    }

    public void updateApt(Apt apt) {
        apt.setCity(city);
        apt.setStreet(street);
        apt.setSize(size);
        apt.setPricePerMeter(pricePerMeter);
        apt.setType(type);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(Integer pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
