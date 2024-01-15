package passage_9;

public class Number {
    public  static int count(int a,int b){
        return a*b;
    }

    public static void main(String[] args) throws Exception{
        try {
           int resutl = count(12315,57876876);
            System.out.println(resutl);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
