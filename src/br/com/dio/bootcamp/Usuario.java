package br.com.dio.bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Usuario {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void inscreverBootCamp(Bootcamp bootcamp){
        bootcamp.getDev().add(this);
        this.conteudoInscritos.addAll(bootcamp.getConteudo());
    }

    public void progredir(){
        Optional<Conteudo> conteudo =  this.conteudoInscritos.stream().findFirst();

        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }
        else{
            System.err.println("Você não está matriculo em nenhum conteúdo!");
        }
    }

    public double calcularXP(){
        return this.conteudoConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXP()).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(conteudoInscritos, usuario.conteudoInscritos) && Objects.equals(conteudoConcluidos, usuario.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }
}
