package studying.JavaCore.Interfaces.Model;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading data...");
    }
}
