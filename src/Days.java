public class Days {
    public static void main(String[] args) {
        int seconds = 10000;
        int secPerMin = 60;
        int secPerHour = secPerMin * 60;
        int secPerDay = secPerHour * 24;
        int days = seconds / secPerDay;
        int hours = (seconds % secPerDay) / secPerHour;
        int mins = ((seconds % secPerDay)%secPerHour) / secPerMin;
        int leftSec = seconds - days * secPerDay - hours * secPerHour - mins * secPerMin;
        System.out.println("In " + seconds + " seconds we have: ");
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + mins);
        System.out.println("Seconds: " + leftSec);
        

    }
}
