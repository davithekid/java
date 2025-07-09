package studying.JavaCore.Polimorfismo.service;

import studying.JavaCore.Polimorfismo.Repositorio.Repositorio;

public class RepositoryFile implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo...");
    }
}
