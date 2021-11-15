package br.com.dio.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXP() {
        return getXp()+20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +  '\'' +
                "Titulo=" + getTitulo() + '\'' +
                "Descricao=" + getTitulo() + '\'' +
                "data=" + data +
                '}';
    }

    public Mentoria(String titulo, String descricao,LocalDate data) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }
}
