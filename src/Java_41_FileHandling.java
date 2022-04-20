import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java_41_FileHandling {
	public static void main(String[] args) throws IOException {

		FileInputStream filein = null;
		FileOutputStream fileout = null;

		try {
			filein = new FileInputStream("sample.txt");
			fileout = new FileOutputStream("samplecopy.txt");

			int c;
			while ((c = filein.read()) != -1){
				fileout.write((char) c);
			}
			System.out.println("Writing of samplecopy.txt is complete");
		} catch (FileNotFoundException e) {
			System.out.println("Invalid file-name");
		}finally {
			if(filein != null)
				filein.close();
			if (fileout != null)
				fileout.close();
		}
	}
}
