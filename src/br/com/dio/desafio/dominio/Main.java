package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição Curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição Curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev DevFelipe = new Dev();
        DevFelipe.setNome("Felipe");
        DevFelipe.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + DevFelipe.getConteudosInscritos());
        DevFelipe.progredir();
        DevFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + DevFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Conclúidos" + DevFelipe.getConteudosCocluidos());
        System.out.println("Xp"+ DevFelipe.calcularTotalXp());

        System.out.println("---------");

        Dev DevCamila = new Dev();
        DevCamila.setNome("Camila");
        DevCamila.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + DevCamila.getConteudosInscritos());
        DevCamila.progredir();
        DevCamila.progredir();
        DevCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + DevCamila.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos" + DevCamila.getConteudosCocluidos());
        System.out.println("Xp"+ DevCamila.calcularTotalXp());




    }
}
