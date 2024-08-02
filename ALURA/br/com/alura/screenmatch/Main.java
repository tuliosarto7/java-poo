package ALURA.br.com.alura.screenmatch;

import ALURA.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import ALURA.br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import ALURA.br.com.alura.screenmatch.modelos.Episodio;
import ALURA.br.com.alura.screenmatch.modelos.Filme;
import ALURA.br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O Poderoso Chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFichaTecnica();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setTemporadas(10);
        lost.setAnoDeLancamento(2000);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme f2 = new Filme();
        f2.setNome("Avatar");
        f2.setAnoDeLancamento(2023);
        f2.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(f2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme f3 = new Filme();
        f3.setNome("Minions");
        f3.setAnoDeLancamento(2016);
        f3.setDuracaoEmMinutos(100);


        ArrayList<Filme> listadeFilmes = new ArrayList<>();
        listadeFilmes.add(f3);
        listadeFilmes.add(f2);
        listadeFilmes.add(filme1);
        System.out.println("Tamanho da lista " + listadeFilmes.size());
        System.out.println("Primeiro filme " + listadeFilmes.get(0).getNome());
    }
}
