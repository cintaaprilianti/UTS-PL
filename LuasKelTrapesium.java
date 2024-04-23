import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LuasKelTrapesium {
    public static void main(String[] args) {

        String namaFile = "./src/dataTrapesium.txt";

        List<Trapesium> dataTrapesium = new ArrayList<>();

        if (dataTrapesium != null) {
            for (int i = 0; i < dataTrapesium.size(); i++) {
                Trapesium dataTrapesium = dataTrapesium.get(i);
                double luas = dataTrapesium.hitungLuas();
                double keliling = dataTrapesium.hitungKeliling();
                System.out.println("Trapesium " + (i + 1) + ":");
                System.out.println("Luas: " + luas);
                System.out.println("Keliling: " + keliling);
                System.out.println();
            }
        }
    }

    private static List<Trapesium> readTrapezoidsFromFile(String filePath) {
        List<Trapesium> dataTrapesium = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                double base1 = Double.parseDouble(values[0]);
                double base2 = Double.parseDouble(values[1]);
                double height = Double.parseDouble(values[2]);
                Trapesium dataTrapesium = new Trapesium(base1, base2, height);
                dataTrapesium.add(Trapesium);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataTrapesium;
    }
}
