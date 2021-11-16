import br.com.dio.bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java","Curso de Programação Orientada Objetos", 30);
        Mentoria mentoria = new Mentoria("Java","Mentoria Java", LocalDate.now());
        Dev devJhonathan = new Dev("Jhonathan");




        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java", "Curso completo de Java");
        bootcampJava.getConteudo().add(curso);
        bootcampJava.getConteudo().add(mentoria);

        devJhonathan.inscreverBootCamp(bootcampJava);
        System.out.println("XP: " + devJhonathan.calcularXP());
        System.out.println("Inscritos: " + devJhonathan.getConteudoInscritos());
        devJhonathan.progredir();
        System.out.println("Concluidos: " + devJhonathan.getConteudoConcluidos());
        System.out.println("Inscritos: " + devJhonathan.getConteudoInscritos());
        System.out.println("XP: " + devJhonathan.calcularXP());

    }
}
