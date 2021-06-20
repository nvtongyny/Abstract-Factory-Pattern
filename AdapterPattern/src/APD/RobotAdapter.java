package APD;

public class RobotAdapter extends Bird implements Robot {
	Bird bird = new Bird();
	public void move( ) {
		System.out.println("机器人走路");
		bird.cry();
	}
	
	public void talk() {
		System.out.println("机器人说话");
		bird.fly();
	}	
}
