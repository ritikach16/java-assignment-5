package ritika.assignment.singleton;

public class JavaAssign {
    String str;
    public static JavaAssign method1(String str){
        JavaAssign obj = new JavaAssign();
        obj.str = str;
        return obj;
    }

   public void print(){
        System.out.println(str);
    }
}