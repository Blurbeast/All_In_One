package chapter5;

public class Shapes {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            for (int j =0;j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++){
            for (int j = 10; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++){
            for (int j = 9; j > i; j--){
                System.out.print(" ");
            }
            for (int k =0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
