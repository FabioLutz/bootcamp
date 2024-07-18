package main.java.com.bootcamp;

import main.java.com.bootcamp.dominio.Bootcamp;
import main.java.com.bootcamp.dominio.Curso;
import main.java.com.bootcamp.dominio.Dev;
import main.java.com.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso completo de Java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Curso básico de C#");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de desenvolvedor Java");
        bootcamp.setDescricao("Bootcamp de desenvolvimento usando Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Paulo" + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        System.out.println("Conteúdos concluídos de Paulo" + devPaulo.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Paulo" + devPaulo.getConteudosInscritos());
        System.out.println("XP: " + devPaulo.calcularXpTotal());

        System.out.println("---");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Carlos" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("Conteúdos concluídos de Carlos" + devCarlos.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Carlos" + devCarlos.getConteudosInscritos());
        System.out.println("XP: " + devCarlos.calcularXpTotal());
    }
}
