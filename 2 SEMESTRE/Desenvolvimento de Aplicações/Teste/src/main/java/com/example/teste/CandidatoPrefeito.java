package com.example.dva_2024_aula12_urna_eletronica;

public class CandidatoPrefeito extends Candidato{

    public CandidatoPrefeito(int numero, String nome, String vice, String partido, String foto){
        setNumero(numero);
        setNome(nome);
        setVice(vice);
        setPartido(partido);
        setFoto(foto);

    }
    private String vice;

    public String getVice() {
        return vice;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }
}
