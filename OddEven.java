import java.util.ArrayList;

public class OddEven {
    public static void main(String[] args) {
        ArrayList<Integer>  odd =  new ArrayList<>();
        ArrayList<Integer>  even =  new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            if(i%2 == 0){
                even.add(i);
            }else {
                odd.add(i);
            }
        }

        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);

        System.out.println("Last odd Number: "+ odd.get( odd.size() - 1 )  );

        System.out.println( "Last Even Number: "+ even.get( even.size()-1 ));
    }
}
