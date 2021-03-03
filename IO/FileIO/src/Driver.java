import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

    // file is not there then we will throw FileNotFoundException exception
	
	// f is a stream that is tied to a file called "out.txt"
		
	FileOutputStream f = new FileOutputStream("silly123.txt");
	
	// write something 
	// 255 because a byte can only take from 0 to 255. 
	
	f.write(129); // writes the lowest byte of the integer
	
	// close the stream (not the file)
	
	// write an integer
	
	
	// but this will write a string as bytes
	// "279680"
	
	f.write('2');
	f.write('7');
	f.write('9');
	f.write('6');
	f.write('8');
	f.write('0');
	
	

	
	// want to write hello world !
	
	
	String s = "hello world!";
	
	// need to convert the string to an array of bytes
	
	byte []  b = s.getBytes();
	
	// this will print the address (b)
	// System.out.println(b);
	
	 
	// write bytes or [] byte 
	
	f.write(b);
	
	
	// flush makes sure that writing actually takes place
	
	f.flush();
	
	// close will flush also
	
	f.close();	
	
	
	// how do you read a stream from a file 
	
	
	// attach a stream to the file 
	
	FileInputStream fin = new FileInputStream("silly123.txt");
	
	// want to read the whole file 
	
	// read until the stream ends 
	
	int in = fin.read();
	
	while(in!=-1) {
		
		if(fin.available()>0) {
			
			// fin.read only reads a single byte 
			in = fin.read();
			System.out.print((char)in);
		}
		
		
	}

}
}
