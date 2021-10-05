package com.nicopaez.testingsamples;

import com.nicopaez.testingsamples.domain.Color;
import com.nicopaez.testingsamples.domain.SemaforoDeTemperatura;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SemaforoDeTemperatura semaforo;

    @BeforeEach
    public void SetUp(){
        Mockito.when(this.semaforo.getColorPara(anyInt())).thenReturn(Color.AZUL);
    }

    @Test
    public void colorEsAzulCuandoTemperaturaMenorA15() throws Exception {
        this.mockMvc.perform(get("/semaforo?temperatura=34")).andExpect(status().isOk())
                .andExpect(content().string(containsString("AZUL")));
    }
}
