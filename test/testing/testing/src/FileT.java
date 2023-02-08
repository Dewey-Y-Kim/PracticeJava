
import java.io.File;

public class FileT {

	public FileT() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args) {
		File f1 = new File("/Users/do-hyoungkim/Documents");
		File[] list=f1.listFiles();
		for(File f:	list) {
			System.out.println(f.getPath());
		}
	}
}
