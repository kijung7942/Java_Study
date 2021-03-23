package e_oop;

public class TV {

	int channel = 1;
	int volumn = 0;
	boolean power = false;
	
	
	static final int maxchannel = 13;
	static final int minchannel = 0;
	static final int maxvolumn = 5;
	static final int minvolumn = 0;
	static int width = 100;
	static int height = 100;
	
	TV(){
		
	}
	
	void channel(String in){
		if(power){
			if("up".equals(in)){
				if(channel == maxchannel){
					channel = 1; 
				}else{
					channel++;}

			}else if("down".equals(in)){
				if(channel <= 0){
					channel = maxchannel; 
				}else{
					channel--;}
			}
		}else{
			System.out.println("전원을 켜주세요");
		}
	}
	
	
	void volumn(String in){
		if(power){
			if("up".equals(in)){
				volumn++;
			}else if("down".equals(in)){
				if(volumn == 0){
					System.out.println("최소 음량입니다."); 
				}else{
					volumn--;}
			}
		}else{
		System.out.println("전원을 켜주세요");
		}
	}
	
	void power(){
		if(power){
			power = false;
		}else 
			power = true;
		}
	
	
	public static void main(String[] args) {
		TV sam = new TV();
		sam.power();
		System.out.println(sam.channel);
		sam.channel("down");
		System.out.println(sam.channel);
		sam.channel("down");
		System.out.println(sam.channel);
		sam.channel = 13;
		sam.channel("up");
		System.out.println("13 다음 " + sam.channel);
		
		
		sam.power();
		System.out.println(sam.channel);
		sam.channel("down");
		
		sam.power();
		sam.volumn = 5;
		sam.volumn("up");
		System.out.println(sam.volumn);
		
		
	}
	
	// 과제. 임의의 사물을 대상으로 클래스 만들기
	// 사물이 가지고 있는 속성을 변수로 만들고
	// 변수와 관계된 동작들을 메서드로 만들기.
}
