public class TimeCrunch {
    public static void main(String[] args) {
        double rawMinutes= 90.;

       int time =(int)(rawMinutes*1);

       int hoursPassed= time/60;
       time= time % 60;

       int minutesPassed = time/2;
       time=time%2;

       int secondsPassed= time%60;




        System.out.println("The different amounts of times used in: " + rawMinutes);
        System.out.println("hours: "+ hoursPassed);
        System.out.println("minutes: "+ minutesPassed);
        System.out.println("seconds: " + secondsPassed);
    }
    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
}
