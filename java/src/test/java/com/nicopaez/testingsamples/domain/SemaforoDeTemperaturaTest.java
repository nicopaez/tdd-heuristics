package com.nicopaez.testingsamples.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SemaforoDeTemperaturaTest {

    @Test
    public void EsRojoCuandoTemperaturaMayorIgualA30(){
        SemaforoDeTemperatura semaforo = new SemaforoDeTemperatura();
        assertThat(semaforo.getColorPara(30)).isEqualTo(Color.ROJO);
    }

    @Test
    public void EsAmarilloCuandoTemperaturaEntre15y30(){
        SemaforoDeTemperatura semaforo = new SemaforoDeTemperatura();
        assertThat(semaforo.getColorPara(15)).isEqualTo(Color.AMARILLO);
    }

    @Test
    public void EsAzuloCuandoTemperaturaMenorA15(){
        SemaforoDeTemperatura semaforo = new SemaforoDeTemperatura();
        assertThat(semaforo.getColorPara(10)).isEqualTo(Color.AZUL);
    }
}
