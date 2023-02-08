
public class lessons_81301 {

	public lessons_81301() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		"one4seveneight"
		"23four5six7"	234567
		"2three45sixseven"	234567
		"123"	123
		*/
		String s="";
		pattern number =pattern.compile("[0-9]");
		String result;
		for (int i=0; i<s.slength();) {
			for(int j=0; j<s.length()-i;j++) {
				if(s.substring(i,j).matches([09])) {i++;result+=s.subSequence(i, j);break;}
				else {
				for(int k=0; k<9;k++) {
					if(num[k]==s.substring(i,j)) {
						i+=j;
						result=result+k;
						break;
					}
				}
				}
				
			}
		}
	}

}
