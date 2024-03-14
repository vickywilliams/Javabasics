package arraylist;

import java.util.ArrayList;

import TwoMatrix.OddorEven;

public class ArrayListLogic {
        private static final Boolean flase = null;
        private static final int i = 0;
        ArrayList<String> array;
        public ArrayListLogic(ArrayList<String> arr){
        array = arr;
    }
    public ArrayList<Integer> oddArray(){
        return oddAndEven(true);
    }
    private ArrayList<Integer> oddAndEven(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'oddAndEven'");
    }
    public ArrayList<Integer> evenArray(){
        return oddAndEven(flase);
    }

    public ArrayList<Integer> oddAndEven(Integer integer){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            if(oddAndEven(array.get(i)) && integer)
            res.add(array.get(i)); 
        }
        else if (!integer && !OddOrEven(array.get(i))) {
            res.add(array.get(i));
        }
    }
    private boolean oddAndEven(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'oddAndEven'");
    }
}
 
