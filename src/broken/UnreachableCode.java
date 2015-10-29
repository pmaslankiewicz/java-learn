package broken;

public class UnreachableCode {

    static String[] weekDays = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };

    public static void main(String[] args){
        int index = 0;
        for(String day : weekDays){
            if(index == 3){ // index will never be incremented => it'll go to else every time
                break;
            }else {
                continue; // it will go out of the current loop and continue so the code below will be unreachable
            }


            /**
             * All the code here cannot be reached, which causes the whole program not to compile.
             * It would normally go through all the days and print weekDays[0] = "monday" at the end
             * but the JVM will not tel it compile.
             *
             */
//            index++;
//            if(weekDays[index].length()>3){
//                weekDays[index] = day.substring(0,3);
//            }
        }
        System.out.println(weekDays[index]);
    }
}
