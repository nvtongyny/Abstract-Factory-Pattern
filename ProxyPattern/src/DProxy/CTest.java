package DProxy;

public class CTest implements ITestInterface{
    @Override
    public void SendMessage(String mes) {
        for (int i = 0; i < 5; i++) {
            System.out.println(mes+"����ĳ��ֻ���"+(i+1)+"��");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(mes+"��������ˣ�");
    }
}
