import java.io.Serializable; 
public class Dog implements Serializable {
 
 
 private String name;
    private String dogBreed;
    private int age;
  public Dog() {
   
  }
  public Dog(String name,String dogBreed, int age) {
   this.name = name;
   this.dogBreed= dogBreed;
   this.age = age;
  }
  
  public int getAge() {
   return age;
  }

  
  public String getName() {
   return name;
  }

  
  public String getDogBreed() {
   return dogBreed;
  }
  
  public String toString(){
   return "Name "+ getName() + " Breed "+ getDogBreed()+ " age " + getAge();
  }
}