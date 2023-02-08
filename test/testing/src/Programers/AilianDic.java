package Programers;

public class AilianDic {

	public AilianDic() {
		// TODO Auto-generated constructor stub
	}
	public int solution(String[] spell, String[] dic) {
		int answer=2;
		String str="";
		for (String s:dic) {
			str+=s+" ";
		}
		for(String s:spell) {
			str=str.replaceAll(s, "");
		}
		spell=str.split(" ");
		for(String s:spell) {
			answer*=s.length();
		}
		if (answer==0) {return 1;}
		else {return 2;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dic= {"moos", "dzx", "smm", "sunmmo", "som"};
		String[] spell= {"s", "o", "m", "d"};
		
		System.out.println(new AilianDic().solution(spell,dic));
		System.out.println(0*0);
	}

}
