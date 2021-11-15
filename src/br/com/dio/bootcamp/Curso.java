package br.com.dio.bootcamp;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return getXp()*cargaHoraria;
    }
}
