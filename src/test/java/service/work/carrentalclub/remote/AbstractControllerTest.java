package service.work.carrentalclub.remote;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;
import service.work.carrentalclub.remote.TestConfig;

import java.util.Objects;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@RunWith(SpringRunner.class)
@TestPropertySource("/application-test.properties")
@AutoConfigureMockMvc
@SpringBootTest(classes = TestConfig.class)
public abstract class AbstractControllerTest {


    public MockMvc getMockMvc() {
        return mockMvc;
    }

    @Autowired
    private MockMvc mockMvc;


    private ObjectMapper objectMapper;

    public ObjectMapper getObjectMapper() {
        if (Objects.isNull(objectMapper)) {
            objectMapper = new ObjectMapper();
            return objectMapper;
        }
            return objectMapper;
    }


    public ResultActions doGet(String url) throws Exception {
        return mockMvc.perform(
                get(url).contentType(MediaType.APPLICATION_JSON)
        ).andDo(print());
    }

    public ResultActions doPost(String url, Objects objects) throws Exception {
        return mockMvc.perform(
                post(url).contentType(MediaType.APPLICATION_JSON).content(getObjectMapper().writeValueAsBytes(objects))
        ).andDo(print());
    }


}
