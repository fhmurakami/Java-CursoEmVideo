/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author Felipe
 */
public class Video implements AcoesVideo {
    // ATRIBUTOS:
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // MÉTODOS ESPECIAIS:

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo = " + titulo + ", avaliacao = " + avaliacao + ", views = " + views + ", curtidas = " + curtidas + ", reproduzindo = " + reproduzindo + '}';
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(){
        if (this.getViews() != 0 ) {
            float a = ((float) this.getCurtidas()/this.getViews()) * 5;
            int i = (int) a;
            if ((a - i) < 0.5) {
                this.avaliacao = (float) i;
            } else if ((a - i) > 0.5) {
                this.avaliacao = (float) i + (float) 0.5;
            }
        } else {
            this.avaliacao = 0;
        }
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    // SOBRESCREVENDO MÉTODOS DA INTERFACE:
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
    
}
