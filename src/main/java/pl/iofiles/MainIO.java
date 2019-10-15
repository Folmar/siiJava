package pl.iofiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainIO {
    public static void main(String[] args) throws IOException {
        List<Parameters> parametersList = new ArrayList<>();
        final String SEPARATOR = ";";
        int rows = 20000;

        for (int i = 1; i <= rows; i++) {
            Parameters parameters = new Parameters();
            parameters.setId(Integer.toString(i));
            parameters.setMessageText("DUPA");
            parametersList.add(parameters);
        }

        File file = new File("message.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < rows; i++) {
            bufferedWriter.write(parametersList.get(i).getId() + SEPARATOR + parametersList.get(i).getMessageText() + SEPARATOR);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

        char[] line = new char[4096];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.read(line) > -1) {
            System.out.println(new String(line));
        }
        bufferedReader.close();
    }
}

