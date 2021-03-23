package g_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	// 게터, 세터 => 소스 메뉴를 통해 쉽게 만들 수 있음.
	// 게터는 현재 저장되어 있는 변수의 값을 돌려주는 메서드
	// 세터는 변수에 값을 저장하는 메서드
	
	String getTime(){
		return hour + ":" + minute + ":" + second; 
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour>=0 && hour<=24)
		this.hour = hour;
		else{
			System.out.println("시: 정확한 숫자를 입력하세요(1~23) 입력값:"+hour);
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute>=0 && minute<60)
		this.minute = minute;
		else{
			System.out.println("분: 정확한 숫자를 입력하세요(1~60) 입력값:"+minute);
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second>=0 && second<=60)
		this.second = second;
		else{
			System.out.println("초: 정확한 숫자를 입력하세요(1~60) 입력값:"+second);
		}
	}
		
		
	void clock(){
		while(true){
			if(second == 60){
				minute++;
				second = 0;}
			if(minute == 60){
				hour++;
				minute = 0;}
			if(hour == 24){
				hour = 0;}
			System.out.println(getTime());
			stop(1000);
			setSecond(second+1);
		}
	}
	// stop은 외부에 노출시킬 필요가 없는 메서드임.
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
