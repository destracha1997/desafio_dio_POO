package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int CargaHoraria;

    public Curso(){

    }

    public  String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public  String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public  int getCargaHoraria() {
        return CargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" + "titulo=" + titulo + ", descricao=" + descricao + ", CargaHoraria=" + CargaHoraria + '}';
    }
}
