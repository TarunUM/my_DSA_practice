package fileHandling;

import java.io.*;

public class Input {
    public static void main(String[] args) {
//        try(InputStreamReader reader = new InputStreamReader(System.in)){
//            while(true){
//                System.out.println("Enter text: ");
//                int c = reader.read();
//                System.out.println(c);
//
////                ASCII value 0 is 48
//                if (c == 48) {
//                    break;
//                }
////                reader.close();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        File file = new File("src/fileHandling/input.txt");
//        System.out.println(file.getName());
//        System.err.println(file.getName());
//        System.err.println(file.getName());
//        System.out.println(file.getName());
//
//        try(FileReader fr = new FileReader(file)){
//            int c = fr.read();
//            while (fr.ready()){
//                System.out.print((char)c);
//                c = fr.read();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            int c = br.read();
//
//            while (br.ready()){
//                System.out.print((char)c);
//                c = br.read();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try(BufferedReader br = new BufferedReader(new FileReader("src/fileHandling/input.txt"))){
            String msg = br.readLine();
            System.out.println("message: " + msg);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
