package com.nicopaez.testingsamples.domain;

public class SemaforoDeTemperatura {

    public Color getColorPara(int temperatura) {
        if (temperatura >= 30)
            return Color.ROJO;
        if (temperatura >= 15)
            return Color.AMARILLO;
        return Color.AZUL;
    }
}
