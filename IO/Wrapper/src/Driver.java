import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		// we created a buffered output stream
		// hooked it up to a fileoutputstream
		
		BufferedOutputStream bo1 = 
				new BufferedOutputStream(new FileOutputStream("bout.txt"));
		
		
		DataOutputStream do1 = new DataOutputStream(bo1);
		
		// writing a floating point number NOT as a string
		// but as it's binary image
		
		do1.writeFloat((float) 3.14159);
		do1.writeLong(28282828);
		
		// writing 'a'
		
	    // bo1.write('a');
				
		bo1.close();
		
		// read from bout.txt through a data input stream
		DataInputStream di = new DataInputStream(
				new FileInputStream("bout.txt"));
		
		// to read back - i need to read in the same order
		// also the same data type
		
		
		int c = di.read();
		while(c!=-1) {
			System.out.print((char)c);
			c = di.read();
		}
		
		//float f1 = di.readFloat();
		//long l1 = di.readLong();
		// System.out.println(f1+","+l1);
		
		
		// System.out is an OutputStream
		/*
		DataOutputStream dd = new DataOutputStream(System.out);
		dd.writeDouble(2.345);
		dd.writeUTF("まつお ばしょう");
		dd.flush();
		*/

	}

}
