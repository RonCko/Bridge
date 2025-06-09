# Padrão de Projeto Bridge em Java

Este repositório demonstra uma implementação original do padrão de projeto **Bridge** em Java.
O padrão Bridge permite **desacoplar abstrações de suas implementações**, possibilitando a extensão de ambos de forma independente.

---

## Objetivo do Exemplo

Simulamos um sistema de **controles remotos** capazes de operar diferentes **dispositivos**, como **TV** e **Rádio**.
Em vez de criar uma classe para cada combinação possível, usamos o padrão Bridge para separar:

- A abstração: `ControleRemoto`
- A implementação: `Dispositivo`

---

## 💡 Estrutura do Projeto

