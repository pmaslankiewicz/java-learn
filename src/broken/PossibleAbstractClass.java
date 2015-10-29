package broken;

abstract class PossibleAbstractClass {

    int int1;
    String string;

    abstract void abstractMethod1(); // can define method without a body because i declared that it's abstract

//    abstract abstractMethod2(); // would not be valid as a return type is required for abstract methods as well
//
//    static abstract abstractMethod3(); // static method cannot be abstract

    void doSomethingElse(){}; // i have to give this method a mody {} because it has not been declared abstract


}
