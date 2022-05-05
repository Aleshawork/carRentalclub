package service.work.carrentalclub;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("/application-test.properties")
@Transactional
@Sql(scripts ={
        "classpath:scripts/drop_schema.sql",
        "classpath:scripts/init_schema.sql",
        "classpath:scripts/test_init_car.sql",
        "classpath:scripts/test_init_user.sql",
        "classpath:scripts/test_init_rent.sql"
})
public abstract class BaseAbstractTest {

    @PersistenceContext
    private  EntityManager em;


    protected  EntityManager getEm() {
        return em;
    }

}
