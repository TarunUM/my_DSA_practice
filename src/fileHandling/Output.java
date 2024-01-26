package fileHandling;

import java.io.*;

public class Output {
    public static void main(String[] args) throws IOException {
//        OutputStream os = System.out;
//        os.write(48);
//        os.write("Hey, This is Tarun!".getBytes());

//        try(OutputStreamWriter writer = new OutputStreamWriter(System.out)){
//            writer.write("\nHey, This is Tarun! 😊");
//            writer.write("😊");
//            writer.write('A');
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        try(FileWriter fw = new FileWriter("src/fileHandling/output.txt", true)){
//            fw.write("\nHey, This is Tarun! 😊");
//            fw.write("😊");
//            fw.write('A');
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 10)){
//            bw.write("\nHey, This is Tarun! 😊");
//            bw.write("😊");
//            bw.write('A');
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        try(BufferedWriter bfw = new BufferedWriter(new FileWriter("src/fileHandling/output.txt", true))){
//            bfw.write("\nHey, This is Tarun! 😊");
//            bfw.write("😊");
//            bfw.write('A');
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        File file = new File("src/fileHandling/output2.txt");
        System.out.println(file.getName());

        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("ಸರ್ವ-ಧರ್ಮಾನ್ ಪರಿತ್ಯಜ್ಯ ಮಾಮ್ ಏಕಂ ಶರಣಾಂ ವ್ರಜ ಅಹಂ\n" +
                    "ತ್ವಾಂ ಸರ್ವ-ಪಾಪೇಭ್ಯೋ ಮೋಕ್ಷಯಿಷ್ಯಾಮಿ ಮಾ ಶುಚಃ");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileReader fr = new FileReader(file)){
            int c = fr.read();
            while (fr.ready()){
                System.out.print((char)c);
                c = fr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try{
            file.deleteOnExit();
//            file.delete();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
