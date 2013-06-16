package a9;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 16.06.13
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */
public class A2Main {
    public static void main(String[]a){

        HeapQueue<Integer, String> h = new HeapQueue<Integer, String>();

        h.store(12,"hallo");
        h.store(2,"Felix");
        h.store(3,"Julian");
        h.store(14,"Memel");
        h.store(24,"Timo");

        System.out.println(h.toString());

    }
}
