import java.io.InputStream;
import java.util.Properties;

public class ProUtil {
    public static Object getBean() throws Exception {
        //1.���������ļ�
        //1.1����Properties����
        Properties pro = new Properties();
        //1.2���������ļ���ת��Ϊһ������
        //1.2.1��ȡclassĿ¼�µ������ļ�
        ClassLoader classLoader = ProUtil.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
//        System.out.println(is);
        pro.load(is);

        //��ȡ�����ļ��ж��������
        String className = pro.getProperty("className");
//        String methodName = pro.getProperty("methodName");

        //3.���ظ�����ڴ�
        Class cls = Class.forName(className);
        //4.��������
        Object obj = cls.newInstance();
        //5.��ȡ��������
//        Method method = cls.getMethod(methodName);
        //6.ִ�з���
//        method.invoke(obj);

        return obj;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(ProUtil.getBean());
    }
}
