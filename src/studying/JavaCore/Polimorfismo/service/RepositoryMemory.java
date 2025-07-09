package studying.JavaCore.Polimorfismo.service;

import studying.JavaCore.Polimorfismo.Repositorio.Repositorio;

public class RepositoryMemory implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na mémoria...");
    }
}
