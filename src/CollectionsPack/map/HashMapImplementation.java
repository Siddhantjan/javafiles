package CollectionsPack.map;

import java.util.HashMap;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"C");
        map.put(2,"C++");
        map.put(3,"Java");
        System.out.println(map); //{first=hey, second=No}
         //getOrDefault
        String s= map.getOrDefault(1,"NotFound");
        System.out.println(s); //c

        s= map.getOrDefault(4,"Not Found");
        System.out.println(s); //Not Found

        System.out.println(map.get(4)); //null

        if (map.containsKey(1)){
            map.put(1,"python");
        }
        System.out.println(map); //{1=python, 2=C++, 3=Java}

        if (map.containsValue("Java")){
           System.out.println("Value exists");
        }

        map.putIfAbsent(4,"JS");
        System.out.println(map); //{1=python, 2=C++, 3=Java, 4=JS}

        s= map.getOrDefault(4,"Not Found");
        System.out.println(s); //Not Found

        System.out.println(map.isEmpty()); //false
        map.replace(1,"python","c");
        map.remove(4);
        System.out.println(map);//{1=c, 2=C++, 3=Java}

        map.computeIfAbsent(4,k->"Js");
        System.out.println(map);//{1=c, 2=C++, 3=Java, 4=Js}

        map.compute(4,(key, val)
                -> val.concat(" language"));
        System.out.println(map); //{1=c, 2=C++, 3=Java, 4=Js language}



    }
}
