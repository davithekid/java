package studying.JavaCore.SobrecargaMetodos.Test;

import studying.JavaCore.SobrecargaMetodos.Model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();


        anime.init("One piece", "Anime", 120, "Shonen");
        anime.imprime();
    }
}
