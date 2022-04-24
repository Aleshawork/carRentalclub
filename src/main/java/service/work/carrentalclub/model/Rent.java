package service.work.carrentalclub.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rent")
public class Rent extends BaseRecord {

    @Column(name = "data_start")
    private Date dataStart;
    @Column(name = "data_end")
    private Date dataEnd;
    @Column(name = "number_document")
    private int numberOfDocument;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;
}
