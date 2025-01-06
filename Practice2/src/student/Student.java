package student;

public class Student { 
	 private String name; 
	 private int id; 
	 private int yearOfStudy; 
	  
	 public Student(String name, int id) { 
	  this.name = name; 
	  this.id = id; 
	  this.yearOfStudy = 1; 
	 } 
	 public String getName() { 
	  return name; 
	 } 
	 public int getId() { 
	  return id; 
	 } 
	 public int getYearOfStudy() { 
	  return yearOfStudy; 
	 } 
	 public void incrementYearOfStudy() { 
	  yearOfStudy++; 
	 } 
	 public static void main (String[] args) { 
	  Student student = new Student("Memento mori", 54); 
	   
	  System.out.println("Name of student: " + student.name); 
	  System.out.println("ID: " + student.getId()); 
	  System.out.println("The year of study: " + student.getYearOfStudy()); 
	  student.incrementYearOfStudy(); 
	  System.out.println("The year of study: " + student.getYearOfStudy()); 
	 } 
	}
