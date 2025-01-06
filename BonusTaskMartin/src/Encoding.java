import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Base64;

public class Encoding {
  
  public void encodeDogToFile(Dog dog) {
   try {
     ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
     ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);
     objectStream.writeObject(dog);
     objectStream.close();
     
          String encodedData = Base64.getEncoder().encodeToString(byteStream.toByteArray()); 
 
         
          String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
          File desktopDir = new File(desktopPath);
 
          
          if (!desktopDir.exists()) {
              System.out.println("Desktop directory not found using current directory");
              desktopPath = System.getProperty("user.dir");
          }
 
          String filePath = Paths.get(desktopPath, "encrypted_data.txt").toString();
          File file = new File(filePath);
          
          try(FileOutputStream fos = new FileOutputStream(file)){
        fos.write(encodedData.getBytes());
        System.out.println("Data is succesfully encoded and written in the file " + filePath);
          }
       }catch(IOException e) {
           System.out.println("Error in writing file " + e.getMessage());
       }
  }
  public static void main(String[] args) {
      Dog dog = new Dog("Bobby","Haski", 2);
         Encoding encryptData = new Encoding();
         encryptData.encodeDogToFile(dog);

     }
}