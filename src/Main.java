import br.com.dio.bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java","Curso de Programação Orientada Objetos", 30);
        Mentoria mentoria = new Mentoria("Java","Mentoria Java", LocalDate.now());
        Usuario usuarioJhonathan = new Usuario("Jhonathan");

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java", "Curso completo de Java");
        bootcampJava.getConteudo().add(curso);
        bootcampJava.getConteudo().add(mentoria);

        usuarioJhonathan.inscreverBootCamp(bootcampJava);
        System.out.println("XP: " + usuarioJhonathan.calcularXP());
        System.out.println("Inscritos: " + usuarioJhonathan.getConteudoInscritos());
        usuarioJhonathan.progredir();
        System.out.println("Concluidos: " + usuarioJhonathan.getConteudoConcluidos());
        System.out.println("Inscritos: " + usuarioJhonathan.getConteudoInscritos());
        System.out.println("XP: " + usuarioJhonathan.calcularXP());
    }
}