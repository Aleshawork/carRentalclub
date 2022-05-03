package service.work.carrentalclub.repos;

import java.lang.reflect.Field;

public class Attribute {

    public Attribute(Object object, Field field) {
        this.object = object;
        this.field = field;
    }

    public Object getObject() {
        return object;
    }

    private Object object;
    private Field field;


    public Field getField() {
        return field;
    }
}
