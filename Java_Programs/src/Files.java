import java.io.*;
import java.util.*;

public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File in = null;
	      FileWriter writer = null;
	      Scanner reader = null;

	      try {
	         in = new File("src\\input.txt");
	         writer = new FileWriter("src\\input.txt");
	         
	         if(in.createNewFile()){
	        	 System.out.println("File Created :" + in.getName());
	         }
	         else {
	        	 System.out.println("File already exists");
	         }
	         writer.write("Java is an object oriented programming language");
	         writer.close();
	         System.out.println("Successfully Written");
	         
	         reader =  new Scanner(in);
	         while(reader.hasNextLine()) {
	        	 String data = reader.nextLine();
	        	 System.out.println(data);
	         }
	         
	         
	      }catch(IOException e) {
	         System.out.println("An error occurred");
	         e.printStackTrace();
	      }
	      
	      if(in.exists()) {
	    	  System.out.println("File name: " + in.getName());
	    	  System.out.println("Absolute path: " + in.getAbsolutePath());
	    	  System.out.println("Writable: " + in.canWrite());
	    	  System.out.println("Readable: " + in.canRead());
	    	  System.out.println("File size: " + in.length() + " bytes");
	      }
	      

	}

}
