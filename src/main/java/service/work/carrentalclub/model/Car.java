package service.work.carrentalclub.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "car")
public class Car extends BaseRecord {

    @Column(name = "number")
    private String number;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private Double price;
    @Column(name = "year")
    private Integer year;
    @Column(name = "mark")
    private String mark;
    @Column(name = "type_of_car")
    private String typeOfCar;
    @Transient
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



    public String getMarkNumber() {
        return markNumber;
    }

    public void setMarkNumber(String markNumber) {
        this.markNumber = markNumber;
    }

    @Column(name = "mark_number")
    private String markNumber;

    public Set<Rent> getCars() {
        if (this.cars == null) {
            cars = new HashSet<>();
            return cars;
        }
        return cars;
    }

    public void setCars(Set<Rent> cars) {
        this.cars = cars;
    }

    @OneToMany(mappedBy = "car")
    private Set<Rent> cars;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }
}
