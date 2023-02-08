package Programers;
import java.util.ArrayList;

public class CodingTest001 {

	public CodingTest001() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int[][] dots) {
        int answer = 0;
        int b[][]=new int[2][2];
        for (int i=0;i<3;i++) {
        	ArrayList<Integer> s = new ArrayList<>();
        	for(int j=1;j<=3;j++) {
        		s.add(dots[j][j]);
        	}
        	s.remove(i);
        	b[0][0]=(int)s.get(0);
        	b[1][1]=(int)s.get(1);
        	//if((dots[0][i]-dots[0][i])/(dots[i][0]-dots[1][0]) ==;
        }
        return answer;
    }
	public static void main(String[] args) {
		/*
		 * 문제 설명
		 * 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다. 
		 * [[x1, y1], [x2, y2], [x3, y3], [x4, y4]] 
		 * 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
		 * 제한사항 dots의 길이 = 4 dots의 원소는 [x, y] 형태이며 x, y는 정수입니다. 
		 * 0 ≤ x, y ≤ 100서로 다른 두개 이상의 점이 겹치는 경우는 없습니다. 
		 * 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요
		 * 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
		 */
	}

}
