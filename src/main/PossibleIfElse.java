package main;

public class PossibleIfElse {

    public static void main(String[] args){
        boolean ifElse = false;
        boolean elseIf = false;

        /**
         * Allowed version of IF - ELSEIF - ELSE
         */

        if(ifElse) System.out.println("if");
        else if (elseIf) System.out.println("else if");
        else System.out.println("else");

        /**
         * Standard version of IF - ELSEIF - ELSE
         */

        if(ifElse){
            System.out.println("if");
        } else if (elseIf){
            System.out.println("elseif");
        } else {
            System.out.println("else");
        }

        /**
         * This kind of statement is also acceptable. It assigns ifElse the value of the boolean on the
         * RHS of the '=' which is 'elseIf == false' which evaluates to false since elseIf = true.
         */

        if(ifElse = elseIf == false) System.out.println("if: " + ifElse + " " + elseIf);
        else System.out.println("else: " + ifElse + " " + elseIf);

    }
}
