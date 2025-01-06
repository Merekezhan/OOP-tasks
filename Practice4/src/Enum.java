public enum Color{
       RED("Red", "\u001B[31m"),
       BLACK("Black", "\u001B[30m"),
       WHITE("White", "\u001B[37m"),
       GREEN("Green", "\u001B[32m");
       
       String name;
	   String asciiCode;
	   
	   
	   Color(String name, String asciiCode){
		     this.name=name;
		     this.asciiCode=asciiCode;
	   }
}