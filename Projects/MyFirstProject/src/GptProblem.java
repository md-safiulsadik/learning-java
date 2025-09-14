
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

class GptProblem {

    public static void main(String[] args) {
        File[][] fileArray = new File[3][];

        Serializable serializableString = "string";
        CharSequence charSequenceString = "string";
        Comparable<String> comparableString = "string";

        fileArray[0] = new File[2];
        fileArray[1] = new File[1];
        fileArray[2] = new File[3];

        for (int i = 0; i < fileArray.length; i++) {
            System.out.println("=====Enter values for user " + (i + 1) + "======");

            for (int j = 0; j < fileArray[i].length; j++) {

                System.out.print("Enter file name: ");
                String fileName = File.scanner.nextLine();
                double size = File.getDouble("Enter a file size");

                fileArray[i][j] = new File(fileName, size);
            }
        }

        for (int i = 0; i < fileArray.length; i++) {
            System.out.println("User " + (i + 1) + ":");

            for (int j = 0; j < fileArray[i].length; j++) {
                System.out.print("\t");
                fileArray[i][j].displayFileInfo();
            }
        }

    }
}

class File {
    static Scanner scanner = new Scanner(System.in);

    private String fileName;
    private double fileSizeMB;

    public File(String fileName, double fileSizeMB) {
        this.fileName = fileName;
        this.fileSizeMB = fileSizeMB;
    }

    public void displayFileInfo() {
        System.out.println("File: " + this.fileName + " (" + this.fileSizeMB + " MB)");
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public String getFileName() {
        return fileName;
    }

    public static double getDouble(String prompt) {
        double value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt + ": ");

            String StringValue = scanner.nextLine();

            try {
                value = Double.parseDouble(StringValue);
                isValid = true;
            } catch (Exception e) {
                System.out.println("Please enter a double/integer value!");
            }
        }
        return value;
    }
}

