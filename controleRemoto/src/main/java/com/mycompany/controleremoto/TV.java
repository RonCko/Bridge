package com.mycompany.controleremoto;

public class TV implements Dispositivo {
    private boolean ligado = false;
    private int volume = 10;

    public void ligar() {
        ligado = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume da TV: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume da TV: " + volume);
        }
    }

    public boolean estaLigado() {
        return ligado;
    }
}
