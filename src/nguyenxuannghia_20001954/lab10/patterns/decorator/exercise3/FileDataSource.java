package nguyenxuannghia_20001954.lab10.patterns.decorator.exercise3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource implements DataSource {
    String filename;

    public FileDataSource( String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        File file = new File(filename);
        try (OutputStream out = new FileOutputStream(file)) {
            out.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(filename);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer);
    }
}
