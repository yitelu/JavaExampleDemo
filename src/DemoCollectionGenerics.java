import java.util.*;

public class DemoCollectionGenerics {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("myName", "Navin");
        map.put("actor", "John");
        map.put("ceo", "Marisa");

        System.out.println(map);

        List<Integer> values = new ArrayList<>();

        values.add(404);
        values.add(908);
        values.add(631);
        values.add(265);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(values, c);

        for(Integer o : values){
            System.out.println(o);
        }

//        System.out.println(values); //print all
//
//        //how to print the value one by one, use Iterator
//        Iterator it = values.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

    }
}
