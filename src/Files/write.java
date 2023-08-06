package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args)  throws IOException {
//        FileWriter writer = new FileWriter("./src/Files/output.txt");
//        writer.write("What's up baby girl" + System.lineSeparator());
//        writer.append("asf");
//        writer.close();

        try(BufferedWriter writer1 = new BufferedWriter(new FileWriter("./src/Files/output.pdf"));){
            writer1.newLine();
            writer1.append("What's up baby girl");
        }

    }
}
