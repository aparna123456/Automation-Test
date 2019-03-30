package JavaMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fileinputstream {
// eg of check exception
	public static void main(String[] args) {


	}

	public void M4() throws FileNotFoundException {
		FileInputStream obj=new FileInputStream("abc");
	}
	
	public void M3() {
		try {
			M4();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public void M2() {
		M3();
	}
}
