import java.util.*;

// http://bigdatums.net/2016/07/19/how-to-create-a-hash-table-in-java-chaining-example/
// https://www.dreamincode.net/forums/topic/206807-print-all-keys-value-pairs/

public class STC extends Object {
    private Hashtable<String, LinkedList<String>> ST;
    private Hashtable<String, String> types;
    private Hashtable<String, String> objects;

    STC() {
        ST = new Hashtable<>();
        types = new Hashtable<>();
        objects = new Hashtable<>();
        ST.put("global", new LinkedList<String>());
    }

    public void add(String id, String type, String object, String scope) {
        LinkedList<String> item = ST.get(scope);
        if (item == null) {
            item = new LinkedList<>();
            item.add(id);
            ST.put(scope, item);
        }
        else {
            item.addFirst(id);   
        }
        types.put(id + scope, type);
        objects.put(id + scope, object);
    }

    public void printTable() {
        String scope;
        Enumeration e = ST.keys();
        
        while (e.hasMoreElements()) {
            scope = (String) e.nextElement();
            System.out.println(scope +":");
            LinkedList<String> item = ST.get(scope);
            
            for (String id : item) {
                String type = types.get(id + scope);
                String object = objects.get(id + scope);
                System.out.println("     " + object + "\t" + id + "\t" + type);
            }
        }
        
    }
    
}
