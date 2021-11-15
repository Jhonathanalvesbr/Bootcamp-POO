package br.com.dio.bootcamp;

public abstract class Conteudo {

    private double xp = 10d;

    private String titulo, descricao;

    public abstract double calcularXP();

    public void setXp(double xp) {
        this.xp = xp;
    }

    public double getXp() {
        return xp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
