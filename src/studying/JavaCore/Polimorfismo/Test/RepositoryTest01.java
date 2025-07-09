package studying.JavaCore.Polimorfismo.Test;


import studying.JavaCore.Polimorfismo.Repositorio.Repositorio;
import studying.JavaCore.Polimorfismo.service.RepositoryDatabase;
import studying.JavaCore.Polimorfismo.service.RepositoryFile;
import studying.JavaCore.Polimorfismo.service.RepositoryMemory;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositoryMemory();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Naruto");
        list.add("Luffy");
        System.out.println(list);
    }
}
