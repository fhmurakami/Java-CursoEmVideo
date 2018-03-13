/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

import java.util.Random;

/**
 *
 * @author Felipe
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "\ntitulo=" + titulo + ", autor=" + autor + 
                ", \ntotPaginas=" + totPaginas + ", pagAtual=" + pagAtual + 
                ", aberto=" + aberto + ", \nleitor=" + leitor.getNome() + 
                ", idade=" + leitor.getIdade() + 
                ", gênero=" + leitor.getSexo() + "\n}";
    }   
//    public void detalhes() {
//        System.out.println(this.getTitulo());
//        System.out.println(this.getAutor());
//        System.out.println(this.getTotPaginas());
//        System.out.println(this.getPagAtual());
//        System.out.println(this.isAberto());
//        System.out.println(this.getLeitor());
//    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        Random aleatorio = new Random();
        this.setPagAtual(aleatorio.nextInt(this.getTotPaginas()) + 1);
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() != this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            this.setPagAtual(0);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() != 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            this.setPagAtual(0);
        }
    }
}
