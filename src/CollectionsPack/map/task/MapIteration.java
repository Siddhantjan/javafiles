package CollectionsPack.map.task;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> m
                = new HashMap<>();
        m.put(1,"Sid");
        m.put(2,"Ree");
        m.put(3,"ri");
        for (Integer key : m.keySet()){
            m.put(key,"sgxde");
        }
        System.out.println(m);
    }
}
