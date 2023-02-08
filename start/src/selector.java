import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class selector {

	public selector() {
		// TODO Auto-generated constructor stub
	}
	public String sel() {
		  JFileChooser chooser = new JFileChooser();
		    
		  chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    int returnVal = chooser.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       String S = chooser.getSelectedFile().getName();
		       return S;
		    }
			return null;
	}
	 
	public static void main(String[] args) {
		selector selector = new selector();
		// TODO Auto-generated method stub
		selector.sel();
	}

}
