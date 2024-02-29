package S_T_L;

public class Sum {
    Integer a,b;
    public Sum(Integer a, Integer b){
        this.a=a;
        this.b=b;
    }
    private Integer add(){
        return a+b;
    }
    public static Integer add(Integer x, Integer y){
        return x+y;
    }
    public static float addFLoat(float x, float y){
        return x+y;
    }
    public Double add(Double x, Double y){
        return x+y;
    }
}
