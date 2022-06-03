public class Reverse {
    public static void main(String[] args) {
        int n=563,reversed=0,lastdigit;
        while(n>0) {
            lastdigit = n % 10;
            reversed = reversed * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println("Reversed Number: " +reversed);


    }
    }

