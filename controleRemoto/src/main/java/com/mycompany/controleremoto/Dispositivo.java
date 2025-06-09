package com.mycompany.controleremoto;

public interface Dispositivo {
    void ligar();
    void desligar();
    void aumentarVolume();
    void diminuirVolume();
    boolean estaLigado();
}
