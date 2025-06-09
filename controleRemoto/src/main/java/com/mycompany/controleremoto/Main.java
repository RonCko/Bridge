package com.mycompany.controleremoto;

public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new TV();
        ControleRemoto controleTV = new ControleBasico(tv);

        Dispositivo radio = new Radio();
        ControleRemoto controleRadio = new ControleBasico(radio);

        System.out.println("=== Usando controle na TV ===");
        controleTV.togglePower();
        controleTV.volumeUp();
        controleTV.volumeUp();
        controleTV.volumeDown();

        System.out.println("\n=== Usando controle no Rádio ===");
        controleRadio.togglePower();
        controleRadio.volumeUp();
        controleRadio.volumeDown();
    }
}
