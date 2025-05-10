package Tiem;
import java.util.Scanner;
import java.lang.Math;
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long inputsec = pureint("Please enter Seconds :");
        long inputmin = pureint("Enter Minutes :");

        double result = getDurationnall(inputmin, inputsec);
        long onlyintmin = (long) result;
        double obtainDeciHour = result - onlyintmin;
        double DeciHourToMins = obtainDeciHour * 60;
        long onlyintsec = antiDeci(DeciHourToMins);
        double obtainDeciMin = DeciHourToMins - onlyintsec;
        double DeciMinToSecs = obtainDeciMin * 60;
        long pureseconds = (long) DeciMinToSecs;

        if (onlyintmin > 23) {
            long hours1 = onlyintmin;
            double Years = onlyintmin / (365d * 24d);
            int deciYears = (int) Years;
            double decistep1 = Years - deciYears;
            double Days1 = decistep1 * 365;
            int Days = (int) Days1;
            double decidays = Days1 - Days;
            double tohour = (decidays * 24) + 0.001d;
            int hello = (int) tohour;

            System.out.println("Your conversion from seconds Exeeded 23 Hours\n Converting to years...");
            threadsleep(3000);
            System.out.println(deciYears + " years " + Days + " days " + hello + " hours " + onlyintsec + " minutes " + pureseconds + " seconds.");
            long fiddle = pureint("To convert only Hrs/Mins/Secs format Press(1)");
            if (fiddle == 1) {
                System.out.println(onlyintmin + "h " + onlyintsec + "m " + pureseconds + "s.");
                System.out.println(onlyintmin + " hours " + onlyintsec + " minutes " + pureseconds + " seconds.");
            }
        } else {
            System.out.println(onlyintmin + "h " + onlyintsec + "m " + pureseconds + "s.");
            System.out.println(onlyintmin + " hours " + onlyintsec + " minutes " + pureseconds + " seconds.");
        }
    }

    public static double getDurationinHours(long seconds) {
        return seconds / Math.pow(60, 2);
    }

    public static double getDurationnall(long minutes, long seconds) {
        Scanner input = new Scanner(System.in);
        long negnum = 0;
        if (seconds < 0) {
            System.out.println("Negative [ seconds ] are not Accepted Currently..\n To convert to Positive Number Press (1) \nTo exit..Press (2)");
            negnum = input.nextInt();
            if (negnum == 1) {
                seconds = seconds * (-1);
            } else if (negnum == 2) {
                System.exit(0);
            }
        }
        long negnumin = 0;
        if (minutes < 0) {
            System.out.println("Negative [ minutes ] are not Accepted Currently..\n To convert to Positive Number Press (1) \nTo exit..Press (2)");
            negnumin = input.nextInt();
            if (negnumin == 1) {
                minutes = minutes * (-1);
            } else if (negnumin == 2) {
                System.exit(0);
            }
        }
        double gettingHoursFromminutes = minutes / 60d;
        double gettingHoursfromseconds = getDurationinHours(seconds);
        return gettingHoursFromminutes + gettingHoursfromseconds;
    }

    public static long antiDeci(double onlyint) {
        return (long) onlyint;
    }

    public static long pureint(String QUESTION) {
        long n = 0;
        boolean flag;
        do {
            try {
                Scanner weight = new Scanner(System.in);
                System.out.println(QUESTION);
                n = weight.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("This Program currently Accepts Integers.\nStay tuned for updates.");
                flag = true;
            }
        } while (flag);
        return n;
    }

    public static void threadsleep(int delayval) {
        try {
            Thread.sleep(delayval);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}