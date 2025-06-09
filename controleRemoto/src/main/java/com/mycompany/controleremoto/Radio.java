package com.mycompany.controleremoto;

public class Radio implements Dispositivo {
    private boolean ligado = false;
    private int volume = 5;

    public void ligar() {
        ligado = true;
        System.out.println("Rádio ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Rádio desligado.");
    }

    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume do Rádio: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume do Rádio: " + volume);
        }
    }

    public boolean estaLigado() {
        return ligado;
    }
}
