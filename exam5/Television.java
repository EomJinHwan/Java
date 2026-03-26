package ch08.exam5;

public class Television implements RemoteControl{
	//필드
	private int voluem;
	
	//turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV On");
	}
	
	//turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV Off");
	}
	
	//setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.voluem = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.voluem = RemoteControl.MIN_VOLUME;
		} else {
			this.voluem = volume;
		}
		System.out.println("현재 볼륨 : " + this.voluem);
	}

}
