package APD;

public class RobotAdapter extends Bird implements Robot {
	Bird bird = new Bird();
	public void move( ) {
		System.out.println("��������·");
		bird.cry();
	}
	
	public void talk() {
		System.out.println("������˵��");
		bird.fly();
	}	
}
