package br.com.zhorg.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getClassificacao(){
        if (this.getTotalReproducoes() > 599 || this.getTotalCurtidas() > 59){
            return 3;
        } else if (this.getTotalReproducoes() > 199 || this.getTotalCurtidas() > 5) {
            return 2;
        } else if (this.getTotalReproducoes() > 49 || this.getTotalCurtidas() > 1) {
            return 1;
        }else {
            return 0;
        }
    }
}
