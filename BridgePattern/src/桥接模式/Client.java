package �Ž�ģʽ;

public class Client {
	public void main(String[] args) {
		Color color;
		Pen pen;
		color=(Color)XMLUtilPen.getBean("color");
		pen=(Pen)XMLUtilPen.getBean("pen");
		pen.setColor(color);
		pen.draw("�ʻ�");
	}
}
