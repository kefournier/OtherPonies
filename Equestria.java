/** Program to help Princess Luna and Celestia go on a tour of the kingdom
 * to greet the other citizens of Equestria
 */
import java.lang.Math;

public class Equestria
{
    public static double roadTrip (double diameter) //this is a method
    {
        return Math.PI * diameter;
    }

    public static double distance (int x1, int y1, int x2, int y2)
    {
        double distancePoints = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return distancePoints;
    }

    public static double totalTrip (int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double distance1 = distance(x1, y1, x2, y2);
        double distance2 = distance(x3, y3, x2, y2);
        double distance3 = distance(x3, y3, x1, y1);
        return distance1 + distance2 + distance3;

    }


    public static void main (String[] args)
    {
        double baltimareManehattan = distance(29, 16, 34, 8);
        double lospegasusNeighagrafalls = distance(6, 19, 22, 7);
        double badlandsPonyville = distance(25, 24, 16, 14);

        System.out.println(baltimareManehattan);
        System.out.println(lospegasusNeighagrafalls);
        System.out.println(badlandsPonyville);

        //Total trip from Baltimare to Manehattan to Badlands and back to Baltimare
        System.out.println(totalTrip(29, 16, 34, 8, 25, 24));
        System.out.println("If Princess Luna and Celestia had visited the cities of Equestria in order,\n");
        System.out.println("their road trip would have been a distance of " + roadTrip(35) + " pony miles.");
    }
}
