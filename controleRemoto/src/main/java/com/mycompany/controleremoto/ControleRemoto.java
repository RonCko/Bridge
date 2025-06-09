package com.mycompany.controleremoto;

public abstract class ControleRemoto {
    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void togglePower();
    public abstract void volumeUp();
    public abstract void volumeDown();
}
