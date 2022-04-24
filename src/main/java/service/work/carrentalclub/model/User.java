package service.work.carrentalclub.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "leaser")
public class User extends BaseRecord{

    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "driving_rate")
    private int drivingRate;
    @Column(name = "full_name")
    private String fullName;

    @OneToMany(mappedBy = "user")
    private Set<Rent> rents;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private Set<TopOfCars> topOfCars;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getDrivingRate() {
        return drivingRate;
    }

    public void setDrivingRate(int drivingRate) {
        this.drivingRate = drivingRate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Rent> getRents() {
        if (this.rents == null) {
            this.rents = new HashSet<>();
            return this.rents;
        }

        return rents;
    }

    public void setRents(Set<Rent> rents) {
        this.rents = rents;
    }

    public Set<TopOfCars> getTopOfCars() {
        if (this.topOfCars == null) {
            this.topOfCars = new HashSet<>();
            return this.topOfCars;
        }
        return topOfCars;
    }

    public void setTopOfCars(Set<TopOfCars> topOfCars) {
        this.topOfCars = topOfCars;
    }
}
