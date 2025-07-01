import java.util.ArrayList;

public class ListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        int m1=100;
        int m2=89;
        int m3=98;
        marks.add(m1);
        marks.add(m2);
        marks.add(m3);
        int sum=0;
        for(int m:marks){
            sum+=m;
        }
        System.out.println(sum);
    }
}
