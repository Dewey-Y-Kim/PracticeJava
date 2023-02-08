package Jv03_Oop;

public class Tv {
	
	static final int MAX_CHANNEL = 20;//최대채널
	static final int MAX_VOLUME = 30;//최대볼륨 	
	
	boolean power = false; // 전원상태
	int volume; //없음 0
	int channel = 1;
	
	// 생성자메소드의 오버로딩
	protected Tv() {
		power = true;
		volume = 10;
		channel = 11;
	}
	protected Tv(boolean power, int channel, int volume) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	protected Tv(int channel, boolean power, int volume) {
		this(power, channel, volume);//다른 생성자 호출, 처음 실행문이여야 한다.
	}
	protected Tv(int channel, int volume, boolean power) {
		this(power, channel, volume);
	}
	
	public static Tv getInstance() {
		return new Tv();
	}
	//현재정보 출력
	public void tvInformation() {
		System.out.println("전원:"+ power+", 채널:"+channel+", 볼륨:"+volume);
	}
	//볼륨업
	public void volumeUp() {
		volume++;
		if(volume>MAX_VOLUME) {
			volume=MAX_VOLUME;
		}		
	}
	public void volumeDown() {
		volume--;
		if(volume<0) { //  ==-1, <=-1, <0
			volume=0;
		}
	}
	public void channelUp() {
		channel++;
		if(channel > MAX_CHANNEL) {
			channel = 1;
		}
	}
	public void channelDown() {
		channel--;
		if(channel<1) {
			channel =  MAX_CHANNEL;
		}
	}
	public void setOnOff() {
		power = !power;
		if(!power) {
			System.exit(0);//프로그램 종료  , 0:정상종료
		}
	}
}
