package principal;

import br.com.zhorg.minhasmusicas.modelos.Musica;
import br.com.zhorg.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");
        minhaMusica.setAlbum("Hot in the Shade");
        minhaMusica.setGenero("Rock and Roll");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Novo Podcast");
        meuPodcast.setHost("Leonardo");
        meuPodcast.setDescricao("Podcast para tomar café da manhã.");

        for (int i = 0; i < 49; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 3; i++) {
            meuPodcast.curte();
        }

        System.out.println("==================================================");
        System.out.println("Artista: " + minhaMusica.getArtista());
        System.out.println("Título: " + minhaMusica.getTitulo());
        System.out.println("Album: " + minhaMusica.getAlbum());
        System.out.println("Gênero: " + minhaMusica.getGenero());
        System.out.println("Total de reproduções: " + minhaMusica.getTotalReproducoes());
        System.out.println("Total de curtidas: " + minhaMusica.getTotalCurtidas());
        System.out.println("Classificação: " + minhaMusica.getClassificacao());
        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println("Nome do Podcast: " + meuPodcast.getTitulo());
        System.out.println("Host: " + meuPodcast.getHost());
        System.out.println("Descrição: " + meuPodcast.getDescricao());
        System.out.println("Total de reproduções: " + meuPodcast.getTotalReproducoes());
        System.out.println("Total de curtidas: " + meuPodcast.getTotalCurtidas());
        System.out.println("Classificação: " + meuPodcast.getClassificacao());
        System.out.println("==================================================");
    }
}