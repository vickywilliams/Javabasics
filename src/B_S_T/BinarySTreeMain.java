package B_S_T;

public class BinarySTreeMain {
    public static void main(String[] args) {
        BinarysTreeLogic  Logic = new BinarysTreeLogic();
        Logic.insert(12);
        Logic.insert(10);
        Logic.insert(14);
        Logic.insert(22);
        Logic.insert(30);
        Logic.insert(23);
        Logic.insert(19);
        Logic.insert(28);
        Logic.insert(20);
        Logic.insert(21);

        System.err.println("----- FIND THE ELEMENT 'TREU OR FALSE' -----");

        Logic.find(23);
        Logic.find(6);
        Logic.find(17);
        Logic.find(10);
        Logic.find(19);
        Logic.find(22);


        
    }
}
