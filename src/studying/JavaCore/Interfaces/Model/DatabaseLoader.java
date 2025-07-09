package studying.JavaCore.Interfaces.Model;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading database...");
    }

    @Override
    public void remove() {
        System.out.println("Remove database...");
    }


}
