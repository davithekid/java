package studying.JavaCore.Interfaces.Model;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading database...");
    }
}
