import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Singleton {

    // Static instance of the class
    private static Singleton instance;
    private float sum = 0;


    private final List<String> readValues = new ArrayList<>();
    private final List<Float> numericalValues = new ArrayList<>();


    // Constructor is private so that it can't be instantiated from outside
    private Singleton  () {}


    // Static method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creating a new instance");
            instance = new Singleton();
            return instance;
        }
        System.out.println("Returning the existing instance");
        return instance;
    }

    // Method to read a file line by line
    public void readFile(String directory, String fileName) {
        try (LineNumberReader reader = new LineNumberReader(new FileReader(new File(directory, fileName)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                addToReadList(line);
            }
            convertToNumbers(readValues);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Adds a string value to the readValues list
    private void addToReadList(String value) {
        readValues.add(value);
    }

    // Converts the read string values to float and stores in numericalValues list
    private void convertToNumbers(List<String> values) {
        for (String value : values) {
            numericalValues.add(Float.parseFloat(value)); // Parse strings to float
        }
    }

    // Calculates the total sum of all numerical values
    public void calculateSum() {
        sum = 0; // Reset the sum before calculation
        for (float value : numericalValues) {
            sum += value; // Add each value to the sum
        }
    }

    // Returns the calculated sum
    public float getSum() {
        return sum;
    }
}


