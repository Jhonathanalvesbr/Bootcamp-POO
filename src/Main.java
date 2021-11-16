import br.com.dio.bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java","Curso de Programação Orientada Objetos", 30);
        Mentoria mentoria = new Mentoria("Java","Mentoria Java", LocalDate.now());
        Dev devJhonathan = new Dev("Jhonathan");
        System.out.println(devJhonathan.getConteudoInscritos());


        Bootcamp botcamp = new Bootcamp("Bootcamp Java", "Curso completo de Java");
        botcamp.getConteudo().add(curso);
        botcamp.getConteudo().add(mentoria);


    }
}
