package tudelft.even;

public class eventest {
    public int evenquestion(int A, int B){
        if (A>20){
            if (A%2==0){
                System.out.println("A IS A LARGE EVEN NUMBER");
            }
            else System.out.println("A IS A LARGE UNEVEN NUMBER ");
        }

        if (B>100){
            if (B%2==0){
                System.out.println("B IS A LARGE EVEN NUMBER ");
            }
            else System.out.println("B IS A LARGE UNEVEN NUMBER ");
        }
        return 0;

    }
}
