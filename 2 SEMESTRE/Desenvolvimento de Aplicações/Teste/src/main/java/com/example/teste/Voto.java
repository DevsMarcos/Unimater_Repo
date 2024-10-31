package com.example.dva_2024_aula12_urna_eletronica;

import java.time.LocalDateTime;

public class Voto {
    private LocalDateTime hora;
    private int numero;
    private String nome;


    public Voto(LocalDateTime hora, int numero, String nome) {
        this.hora = hora;
        this.numero = numero;
        this.nome = nome;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
