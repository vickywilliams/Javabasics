package linkedlist.stack;
class StackLIFOMain{
    public static void main(String[] args) {
        // LIFOut<String> obj = new LIFOut<String>();
        // obj.push("Dhinakar");
        // obj.push("sanjay");
        // obj.push("Barath");
        // obj.push("Kavin");
        // obj.print();
        // System.out.println("pop in element: ");
        // obj.pop();
        // obj.print();
        System.out.println("Integer type  element: ");
        LIFOut<Integer> v = new LIFOut<Integer>();
        v.push(23);
        v.push(25);
        v.push(27);
        v.push(29);
        System.out.println("pop in element: ");
        v.pop();v.pop();v.pop();v.pop();v.pop();
        v.pop();
        v.print();
    }
    
}
