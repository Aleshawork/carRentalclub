package service.work.carrentalclub.model;

import javax.persistence.*;

@MappedSuperclass
public class BaseRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int recordId;


    @Override
    public int hashCode() {
        return recordId;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        BaseRecord record = (BaseRecord) obj;
        return this.getRecordId() == record.getRecordId();
    }

    public int getRecordId() {
        return recordId;
    }
}
