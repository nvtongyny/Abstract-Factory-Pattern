import java.applet.Applet;

public class Saler extends AVisitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("����Ա"+name+"��ƻ�����ӣ�Ȼ�����۸�");
    }

    @Override
    public void visit(Book book) {
        System.out.println("����Ա"+name+"ֱ�Ӽ�����ļ۸�");
    }
}
