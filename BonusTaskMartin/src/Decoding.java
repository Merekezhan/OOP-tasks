import java.io.ByteArrayInputStream;
// java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;


public class Decoding {
 public void decodeDogFromFile() {
        
        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        File desktopDir = new File(desktopPath);

       
        if (!desktopDir.exists()) {
            System.out.println("Desktop directory not found using current working directory");
            desktopPath = System.getProperty("user.dir");
        }

        String filePath = Paths.get(desktopPath, "encrypted_data.txt").toString();
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File not found " + filePath);
            return;
        }

        try {
            
            String encodedData = new String(Files.readAllBytes(file.toPath()));

            
            byte[] decodedBytes = Base64.getDecoder().decode(encodedData);
            
            ByteArrayInputStream byteStream = new ByteArrayInputStream(decodedBytes);
    ObjectInputStream objectStream = new ObjectInputStream(byteStream);
    Dog dog = (Dog) objectStream.readObject();
    objectStream.close();
    
            System.out.println("Decoded Dog data " + dog);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during decoding " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Decoding decryptData = new Decoding();
        decryptData.decodeDogFromFile();
    }
}