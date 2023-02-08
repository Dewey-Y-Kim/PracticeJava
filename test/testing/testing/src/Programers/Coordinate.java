package Programers;

public class Coordinate {

	public Coordinate() {
		// TODO Auto-generated constructor stub
	}
	public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int xmax = board[0]/2;
        int ymax = board[1]/2;
		System.out.println("StartPoint");
        System.out.println(answer[0]+" , "+answer[1]);
		
        for(String key : keyinput) {
        	switch(key) {
        	case "left": 
        		if(answer[0]-1 >= -xmax) {answer[0]--;}
        		System.out.println(key);
        		System.out.println(answer[0]+" , "+answer[1]);
        		break;
        	case "right":
        		
        		if(answer[0]+1 <= xmax) {answer[0]++;}
        		System.out.println(key);
        		System.out.println(answer[0]+" , "+answer[1]);
        		break;
        	case "up":
        		if(answer[1]+1 <= ymax) {answer[1]++;}
        		System.out.println(key);
        		System.out.println(answer[0]+" , "+answer[1]);
        		break;
        	case "down":
        		if(answer[1]-1 >= -ymax) {answer[1]--;}
        		System.out.println(key);
        		System.out.println(answer[0]+" , "+answer[1]);
        		break;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keyinput= {"left", "right", "up", "right", "right"};
		int[] board= {11,11};
		new Coordinate().solution(keyinput, board);
	}

}
