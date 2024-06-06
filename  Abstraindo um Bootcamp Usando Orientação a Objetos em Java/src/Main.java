import java.time.LocalDate;

import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
    
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(15);
        
        Curso curso2 = new Curso();
        
        curso2.setTitulo("C");
        curso2.setDescricao("Descrição do curso C");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em java");
        mentoria.setDescricao("Descrição mentoria em java");
        mentoria.setData(LocalDate.now());
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
