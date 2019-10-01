public class LunaThreeStopTour extends Equestria //Equestria is a superclass, and LunaThreeStopTour is a subclass
{

    public static void tripMiles()
    {
        //Ponyville
        int city1x = 25;
        int city1y = 24;

        //Manehattan
        int city2x = 34;
        int city2y = 8;

        //Baltimare
        int city3x = 29;
        int city3y = 16;

        System.out.println(distance(city1x, city1y, city2x, city2y));
        System.out.println(distance(city2x, city2y, city3x, city3y));
        System.out.println(distance(city3x, city3y, city1x, city1y));

        System.out.println("The total trip to these 3 cities was " + totalTrip(city1x, city1y, city2x, city2y, city3x, city3y) + " pony miles.");

    }
    public static void main (String[] args)
    {
        tripMiles();


    }
}
