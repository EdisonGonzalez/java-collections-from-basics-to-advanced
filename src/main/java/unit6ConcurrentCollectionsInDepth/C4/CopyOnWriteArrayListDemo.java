package unit6ConcurrentCollectionsInDepth.C4;

//import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    //static ArrayList<String> list = new ArrayList<String>();
    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

    public static void main(String[] args) {

        list.add("John");
        list.add("Ron");
        list.add("Harry");
        list.add("Potter");

        /**
         * while(itr.hasNext()) {
         *             String name = itr.next();
         *             if(name.equals("Harry")) {
         *                 itr.remove();
         *             }
         *         }
         */
        list.removeIf(name -> name.equals("Harry"));
        System.out.println(list);
    }

}
