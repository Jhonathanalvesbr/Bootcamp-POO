package br.com.dio.bootcamp;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome, descricao;
    private final LocalDate dataInicial = LocalDate.now(), dataFinal = LocalDate.now().plusDays(45);
    private Set<Usuario> usuario = new HashSet<>();
    private Set<Conteudo> conteudo = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Set<Usuario> getDev() {
        return usuario;
    }

    public void setDev(Set<Usuario> usuario) {
        this.usuario = usuario;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }
}
