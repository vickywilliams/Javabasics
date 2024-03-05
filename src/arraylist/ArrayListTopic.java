package arraylist;

import java.util.ArrayList;

public class ArrayListTopic {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList <Integer>();
        al.add(12);
        al.add(34);
        al.add(19);
        al.add(29);
        print(al);
        System.out.println("*******Add spacific index ********");
        al.add(1,45);
        print(al);
        System.out.println("********remove spacific index ********");
        al.remove(3);
        print(al);
        System.out.println("******** remove all ***********");
        al.clear();
        al.add(11);
        print(al);
        System.out.println("IS empty check : "+ al.isEmpty());
        System.out.println("Array list Size : "+al.size());
        System.out.println("Find index 21: "+al.indexOf(21));
        System.out.println("Find index 12: "+al.indexOf(12));
        
    }

    private static void print(ArrayList<Integer> al) {
        // TODO Auto-generated method stub
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
