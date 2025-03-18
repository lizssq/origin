package org.singleLogin.set;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        //
//        Scanner scanner=new Scanner(System.in);
//        List<String> list = new ArrayList<String>();
//
//        for(int i = 1; i <= 2; i++) {
//            System.out.println("Enter a string: ");
//            String str = scanner.nextLine();
//            list.add(str);
//        }
//        System.out.println(list);
//        list.set(0, "Hello");
//        list.set(1, "World");
//        System.out.println(list);
//        scanner.close();
//        List<work> list1 = new ArrayList<work>();
//        work w1 = new work(1, "John", 25, "New York");
//        work w2 = new work(2, "Mike", 30, "New Jersey");
//        list1.add(w1);
//        list1.add(w2);
//        list1.add(2, new work(3, "Tom", 35, "California"));
//        System.out.println(list1.get(0).toString());
//        System.out.println(list1.get(1).toString());
//        Integer i = 1000000000;
//        System.out.println(i);
        Llll t1 = new Llll(13, 20, 30);
        Llll t2 = new Llll(10, 20, 30);
        List<Llll> list =Arrays.asList(t1, t2);
        Collections.sort(list);
//        for(Llll t : list) {
//            System.out.println(t);
//        }
        Iterator<Llll> iterator = list.iterator();

            System.out.println(iterator.next());


    }
}
