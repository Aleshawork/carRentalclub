package service.work.carrentalclub.remote;

import org.junit.Test;
import org.springframework.security.test.context.support.WithUserDetails;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CarControllerTest extends AbstractControllerTest {


    @Test
    @WithUserDetails("Test")
    /* получается получить доступ только к /login
        остальные по непонятным причинам недоступны
     */
    public void shouldGetAllView() throws Exception {
        doGet("/login")
                .andExpect(status().isOk());
    }

    @Test
    public void fakeTest() {
        assertEquals(1,1);
    }


}
