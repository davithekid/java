package studying.JavaCore.Polimorfismo.service;

import studying.JavaCore.Polimorfismo.Repositorio.Repositorio;

public class RepositoryDatabase implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um database...");
    }
}
