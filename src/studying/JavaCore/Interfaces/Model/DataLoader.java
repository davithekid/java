package studying.JavaCore.Interfaces.Model;

// todos os metodos interface sao public e abstratos
public interface DataLoader {
    int MAX_DATA_SIZE = 10; // constante
    void load();
    default void checkPermission() {
        System.out.println("Fazendo checkagem de permissões...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da interface: ");
    }

}
