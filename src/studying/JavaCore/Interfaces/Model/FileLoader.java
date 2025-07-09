package studying.JavaCore.Interfaces.Model;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data...");
    }

    @Override
    public void remove() {
        System.out.println("Remove data...");
    }


}
