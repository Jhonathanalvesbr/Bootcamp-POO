import br.com.dio.bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java","Curso de Programação Orientada Objetos", 30);
        Mentoria mentoria = new Mentoria("Java","Mentoria Java", LocalDate.now());

        System.out.println(mentoria.toString());
    }
}
