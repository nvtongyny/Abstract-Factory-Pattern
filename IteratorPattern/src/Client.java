public class Client {
    public static void main(String[] args) throws Exception {
         Television tv = (Television) ProUtil.getBean();
         TVIterator iterator = tv.createIterator();
        System.out.println("����Ƶ����");
        while (!iterator.isLast())
        {
            System.out.println(iterator.currentChannel());
            iterator.next();
        }
    }
}
