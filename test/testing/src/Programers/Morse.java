package Programers;

import java.util.TreeMap;

public class Morse {

	public Morse() {
		// TODO Auto.generated constructor stub
	}
	public String Morswitch(String str) {
		 switch(str) {
		 case ".-" : return "a";
		 case "-..." : return "b";
		 case "-.-." : return "c";
		 case "-.." : return "d";
		 case "." : return "e";
		 case "..-." : return "f";
		 case "--." : return "g";
		 case "...." : return "h";
		 case ".." : return "I";
		 case ".---" : return "j";
		 case "-.-" : return "k";
		 case ".-.." : return "l";
		 case "--" : return "m";
		 case "-." : return "n";
		 case "---" : return "o";
		 case ".--." : return "p";
		 case "--.-" : return "q";
		 case ".-." : return "r";
		 case "..." : return "s";
		 case "-" : return "t";
		 case "..-" : return "u";
		 case "...-" : return "v";
		 case ".--" : return "w";
		 case "-..-" : return "x";
		 case "-.--" : return "y";
		 case "--.." : return "z";

			default:
		 }
			return "";
		 
	}
	
	public String solution1(String letter) {
		String[] cha=letter.split(" ");
		String answer = "";
		for(String str:cha) {
			answer=answer+Morswitch(str);
		}
		
		return answer;
	}
	
	public String solution2(String letter) {
		String[] morse={"..","....","....","...",".","....","...","....","..","....","...","....","..","..","...","....","....","...","...",".","...","....","...","....","....","...."};
		String[] str=letter.split(" ");
		String solution="";
		for(int i=0;i<str.length;i++) {
			for(int ciper=0;ciper<morse.length;ciper++) {
				if(str[i].equals(morse[ciper])) {
					solution=solution+(char)('a'+ciper);
				}
			}
		}
		return solution;
	}
	
	public String solution3(String letter) {
		String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		StringBuilder solution=new StringBuilder();
		TreeMap<String,String> ts=new TreeMap<>();
		for(int i=0;i<26;i++) {
			String t=String.valueOf((char)('a'+i));
			ts.put(morse[i],t);
		}
		String[] letterCut=letter.split(" ");
		for(String str:letterCut) {
			String t=(String)(ts.get(str));
			solution.append(t);
		}
		return solution.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto.generated method stub
		long start = System.nanoTime();
		new Morse().solution1(".--. -.-- - .... --- -.");
		long end = System.nanoTime();
		System.out.println(end-start);
		start = System.nanoTime();
		new Morse().solution2(".--. -.-- - .... --- -.");
		end = System.nanoTime();
		System.out.println(end-start);
		start = System.nanoTime();
		new Morse().solution3(".--. -.-- - .... --- -.");
		end = System.nanoTime();
		System.out.println(end-start);
	}
	
}
