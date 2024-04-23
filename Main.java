import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "./src/dataTrapesium.txt";
        List<Trapesium> trapesiumList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(";");
                double base1 = Double.parseDouble(row[0]);
                double base2 = Double.parseDouble(row[1]);
                double height = Double.parseDouble(row[2]);

                Trapesium trapesium = new Trapesium(base1, base2, height);
                trapesiumList.add(trapesium);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Luas dan Keliling Trapesium:");
        for (int i = 0; i < trapesiumList.size(); i++) {
            Trapesium trapesium = trapesiumList.get(i);
            System.out.println("Trapesium " + (i + 1) + ":");
            System.out.println("Luas: " + trapesium.hitungLuas());
            System.out.println("Keliling: " + trapesium.hitungKeliling());
            System.out.println();
        }
    }
}
