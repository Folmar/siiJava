package pl.iofiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainIO {
    public static void main(String[] args) throws IOException {
        List<Parameters> parametersList = new ArrayList<>();
        final String SEPARATOR = ";";
        int rows = 20;

        for (int i = 0; i <= rows; i++) {
            Parameters parameters = new Parameters();
            parameters.setId(Integer.toString(i));
            parameters.setMessageText("DUPA");
            parametersList.add(parameters);
        }

        File file = new File("message.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i <= rows; i++) {
            bufferedWriter.write(parametersList.get(i).getId() + SEPARATOR + parametersList.get(i).getMessageText() + SEPARATOR);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

