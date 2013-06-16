package a8;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 11.06.13
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[]rgs){

        A a = new A();
        B b = a;
        System.out.println(a.v());

    }

    public static class C{
        public int Value = 999;
    }

    public static class B extends C{
        public int Value = 5;
    }

    public static class A extends B{
        public int Value = 12;

        public int v(){
            return super.Value;
        }
    }



}
