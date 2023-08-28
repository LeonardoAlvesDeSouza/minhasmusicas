package br.com.zhorg.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getClassificacao(){
        if (this.getTotalReproducoes() > 49 || this.getTotalCurtidas() > 9){
            return 3;
        } else if (this.getTotalReproducoes() > 39 || this.getTotalCurtidas() > 5) {
            return 2;
        } else if (this.getTotalReproducoes() > 10 || this.getTotalCurtidas() > 1) {
            return 1;
        }else {
            return 0;
        }
    }
}
