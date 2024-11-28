package com.example.dva_2024_aula12_urna_eletronica;

public class CandidatoVereador extends Candidato{
    public CandidatoVereador(CandidatoPrefeito prefeito, int numero, String nome, String foto, String partido) {
        this.prefeito = prefeito;
        setPrefeito(prefeito);
        setFoto(foto);
        setNome(nome);
        setNumero(numero);
        setPartido(partido);
    }

    private CandidatoPrefeito prefeito;

    public CandidatoPrefeito getPrefeito() {
        return prefeito;
    }

    public void setPrefeito(CandidatoPrefeito prefeito) {
        this.prefeito = prefeito;
    }
}
