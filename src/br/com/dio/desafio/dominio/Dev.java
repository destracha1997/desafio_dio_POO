package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosCocluidos = new LinkedHashSet<>();

    public void  increverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void  progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosCocluidos.add(conteudo.get()); // Adiciona aos concluídos
            this.conteudosInscritos.remove(conteudo.get()); // Remove dos inscritos
        } else {
            System.err.println("você não está matriculado em nenhum conteúdo");
        }
    }

    public double calcularTotalXp(){
       return this.conteudosCocluidos
               .stream()
               .mapToDouble(conteudo -> conteudo.calcularXp())
               .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosCocluidos() {
        return conteudosCocluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos);
    }
}