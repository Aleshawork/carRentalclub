package service.work.carrentalclub.util;

import org.testcontainers.containers.PostgreSQLContainer;

public class PostgreInit {
    private static PostgreSQLContainer  pgContainer = new PostgreSQLContainer<>("postgres:14.2");

    
}
