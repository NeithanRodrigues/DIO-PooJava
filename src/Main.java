import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso_1 = new Curso();
        curso_1.setTitulo("Java - Programação Orientada a objetos");
        curso_1.setDescricao("JAVA POO");
        curso_1.setCargaHoraria(8);

        Curso curso_2 = new Curso();
        curso_2.setTitulo("Python - Banco de Dados");
        curso_2.setDescricao("BANCO DE DADOS");
        curso_2.setCargaHoraria(8);

        Mentorias mentoria_1 = new Mentorias();
        mentoria_1.setTitulo("Mentoria Java POO");
        mentoria_1.setDescricao("JAVA POO");
        mentoria_1.setDate(LocalDate.now());

        Mentorias mentoria_2 = new Mentorias();
        mentoria_2.setTitulo("Mentoria Java POO");
        mentoria_2.setDescricao("JAVA POO");
        mentoria_2.setDate(LocalDate.now());

        Bootcamp santander = new Bootcamp();
        santander.setNome("Santander Bootcamp");
        santander.setDescricao("Dio Java POO");
        santander.getConteudos().add(curso_1);
        santander.getConteudos().add(mentoria_2);

        Bootcamp microsoft = new Bootcamp();
        microsoft.setNome("Microsoft Bootcamp");
        microsoft.setDescricao("Dio C++");
        microsoft.getConteudos().add(curso_2);
        microsoft.getConteudos().add(mentoria_1);

        Dev nathan = new Dev();
        nathan.setName("Nathan");
        nathan.inscreverBootcamp(santander);
        System.out.println("Conteúdos incritos de " + nathan.getName() + ": " + nathan.getConteudosInscritos());
        nathan.progredir();
        nathan.progredir();
        System.out.println("---");
        System.out.println("Conteúdos incritos de " + nathan.getName() + ": " + nathan.getConteudosInscritos());
        System.out.println("Conteúdos concluidos de " + nathan.getName() + ": " + nathan.getConteudosConcluidos ());
        System.out.println("XP de " + nathan.getName() + ": " + nathan.calcularTotalXp());

        System.out.println("-----------------------");

        Dev rodrigues= new Dev();
        rodrigues.setName("Rodrigues");
        rodrigues.inscreverBootcamp(microsoft);
        System.out.println("Conteúdos incritos de " + rodrigues.getName() + ": " + rodrigues.getConteudosInscritos());
        rodrigues.progredir();
        System.out.println("---");
        System.out.println("Conteúdos incritos de " + rodrigues.getName() + ": " + rodrigues.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + rodrigues.getName() + ": " + rodrigues.getConteudosConcluidos());
        System.out.println("XP de " + rodrigues.getName() + ": " + rodrigues.calcularTotalXp());



    }
}