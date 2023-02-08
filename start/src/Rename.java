import java.io.File;

import javax.swing.JFileChooser;

public class Rename {

	public Rename() {
		// TODO Auto-generated constructor stub
	}
	public JFileChooser sel() {
		  JFileChooser chooser = new JFileChooser();
		    
		  chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	System.out.println(chooser.getCurrentFileName().getName());
		       String S = chooser.getCurrentDirectory().getName();
		       System.out.println(S);
		       return chooser;
		    }
			return null;
	}
	public void Rename(JFileChooser s) {
		File dstDirectory = new File(s.getParent());
		File[] files = dstDirectory.listFiles();
		for(File f:files) {
			System.out.println(f.getName());
		}
	}
	
	public static void main(String args) {
		Rename rn = new Rename();
		JFileChooser s = rn.sel();
		System.out.println(s);
		rn.Rename(s);
		
	}
}
