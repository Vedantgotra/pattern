//3. Write a Java program to print the following grid. Go to the editor
//
//        Expected Output :
//
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
//        - - - - - - - - - -
public class pattern {
    public static void main(String[] args) {
         int i ,j;

        for (i = 0; i < 10; i++) {
            for(j=0;j<10;j++){
                System.out.print("_ ");
            }
            System.out.println("");
        }
    }
}
