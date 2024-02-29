package MathFunctions;

public class ExamplePro {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Integer age1 = 99;
        String ageStr = age1.toString();
        System.out.println(Integer.max(21, 17));
        System.out.println(Integer.min(21, 17));
        System.out.println(Integer.sum(22, 17));

        Double d = new Double(21.5);
        System.out.println(Double.parseDouble(ageStr));
        System.out.println(Double.sum(21.3, 12.5));
        String dStr = d.toString();
        System.out.println(dStr);
        
    }
}
