package com.mycompany.controleremoto;

public class ControleBasico extends ControleRemoto {

    public ControleBasico(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void togglePower() {
        if (dispositivo.estaLigado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

    public void volumeUp() {
        dispositivo.aumentarVolume();
    }

    public void volumeDown() {
        dispositivo.diminuirVolume();
    }
}
