package studying.JavaCore.Interfaces.Test;

import studying.JavaCore.Interfaces.Model.DatabaseLoader;
import studying.JavaCore.Interfaces.Model.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();


    }
}
