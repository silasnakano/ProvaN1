package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Livro extends BaseBiblioteca {

    private String codigoEsb;
    private int codigoAutor;
    private String titulo;

    public String getCodigoEsb() {
        return codigoEsb;
    }

    public void setCodigoEsb(String codigoEsb) {
        this.codigoEsb = codigoEsb;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Livro() {
    }

    public Livro(int codigo, String descricao, LocalDate dataCadastro, String codigoEsb, int codigoAutor,
            String titulo) {
        super(codigo, descricao, dataCadastro);
        this.codigoEsb = codigoEsb;
        this.codigoAutor = codigoAutor;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro [codigoEsb=" + codigoEsb + ", codigoAutor=" + codigoAutor + ", titulo=" + titulo + "]";
    }

}
