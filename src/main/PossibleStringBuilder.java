package main;

public class PossibleStringBuilder {

    public static void main(String [] args){

        /**
         * StringBuilder length shortening causing to lose information.
         * Also length set remains the same even though there are no elements there.
         */

        StringBuilder stringBuilder = new StringBuilder("12345678");
        stringBuilder.setLength(5); // cuts it down to "12345"
        stringBuilder.setLength(10); // still "12345"
        int length = stringBuilder.length(); // length is 10 even though stringBuilder prints out "12345" only


    }
}
