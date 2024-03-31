public class myFifthApp {
    public static void main(String[] args) {
        //
        printCharacter('X', 5, 3); //
    }

    //
    public static void printCharacter(char ch, int repeat, int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < repeat; j++) {
                System.out.print(ch);
            }
            System.out.println(); // 'repeat'
        }
    }
}
