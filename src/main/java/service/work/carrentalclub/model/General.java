package service.work.carrentalclub.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "general")
public class General{

    @Id
    @Column(name = "question")
    private String question;
    @Column(name = "data_open")
    private Date dateOpen;
    @Column(name = "type")
    private String type;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(Date dateOpen) {
        this.dateOpen = dateOpen;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
