package randomfIleaccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        String FILEPATH = "/home/siddhant/IdeaProjects/java files/src/randomfIleaccess/new.txt";
        try {
            System.out.println(new String(readFromFile(FILEPATH, 0, 19)));
            writeToFile(FILEPATH, "I am Siddhant Jain!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filePath, String data)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
       // file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}