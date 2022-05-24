package service.work.carrentalclub.repos;

import org.springframework.stereotype.Repository;
import service.work.carrentalclub.model.BaseRecord;
import service.work.carrentalclub.model.Car;

import javax.persistence.NoResultException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Repository
public class CarRepo extends CrudAbstractRepository {


    @Override
    public List<? extends BaseRecord> getAll() {
        return em.createQuery("select c from Car c", Car.class).getResultList();
    }

    @Override
    public BaseRecord getById(int recordId) throws NoResultException {
        return em.createQuery("select c from Car c where c.recordId =:id", Car.class)
                .setParameter("id",recordId)
                .getSingleResult();
    }

    // todo: добавить проверку атрибутов по сущности
    public List<? extends BaseRecord> findByAllParametr(Set<Attribute> attributeSet) throws IllegalAccessException {
        String sql = "select c from Car c";

        if (attributeSet.size()==0) {
            return  getAll();
        }
        attributeSet = checkAttribute(attributeSet);

        StringBuilder builder = new StringBuilder(sql);
        builder.append(" where ");
        int count =0;
        for (Attribute att: attributeSet) {
            count++;
            Field field = att.getField();
            field.setAccessible(true);

            switch (field.getName()) {
                case("number"):
                    builder.append("c.number = ");
                    builder.append((Integer) field.get(att.getObject()));
                    break;
                case("color"):
                    builder.append("c.color = '");
                    builder.append((String) field.get(att.getObject()));
                    builder.append("'");
                    break;
                case("price"):
                    builder.append("c.price = ");
                    builder.append((Double) field.get(att.getObject()));
                    break;
                case("year"):
                    builder.append("c.year = ");
                    builder.append((Integer) field.get(att.getObject()));
                    break;
                case("mark"):
                    builder.append("c.mark = '");
                    builder.append((String) field.get(att.getObject()));
                    builder.append("'");
                    break;
            }
            if (count < attributeSet.size()) {
                builder.append(" and ");
            }

        }

        return em.createQuery(builder.toString(), Car.class).getResultList();
    }

    public Set<Attribute> checkAttribute(Set<Attribute> attributeSet) {
       return  attributeSet.stream().filter(el->{
            Field field = el.getField();
            field.setAccessible(true);
            if (field.getType().isAssignableFrom(String.class) ) {
                try {
                    if (field.get(el.getObject()) != null)
                        return true;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else if ( field.getType().isAssignableFrom(Integer.class)) {
                try {
                    if ((int) field.get(el.getObject()) == 0) {
                        return false;
                    }
                    return true;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else  if ( field.getType().isAssignableFrom(Double.class)) {
                try {
                    if ((Double) field.get(el.getObject()) == null) {
                        return false;
                    }
                    return true;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            return false;

        }).collect(Collectors.toSet());
    }

    @Override
    public void delete(BaseRecord baseRecord) {

    }
}
