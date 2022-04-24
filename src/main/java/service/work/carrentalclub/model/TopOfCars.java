package service.work.carrentalclub.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "top_of_cars")
public class TopOfCars extends BaseRecord{
    @Column(name = "data_of_like")
    private Date dateOfLike;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public Date getDateOfLike() {
        return dateOfLike;
    }

    public void setDateOfLike(Date dateOfLike) {
        this.dateOfLike = dateOfLike;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
