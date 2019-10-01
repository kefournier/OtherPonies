public class OtherPonies extends Equestria
{
    private int age; //these are my fields
    private String name;


public OtherPonies(int ponyAge, String ponyName) //this is a constructor
{
    age = ponyAge; //these are attributes of my objects
    name = ponyName;
}

    public String toString() //creating this to override the default Java toString method
    {

        return name + ": " + age;

    }

public static void main (String[] args) //main method
{
    //Creating my three pony objects
    OtherPonies rainbowDash = new OtherPonies(15, "Rainbow Dash");
    OtherPonies twilightSparkle = new OtherPonies(16, "Twilight Sparkle");
    OtherPonies pinkiePie = new OtherPonies(17, "Pinkie Pie");

    //Calling my toString method on my objects to return their name and age which I will then print to the screen
    rainbowDash.toString();
    twilightSparkle.toString();
    pinkiePie.toString();

    //printing out my pony names and ages
    System.out.println(rainbowDash);
    System.out.println(twilightSparkle);
    System.out.println(pinkiePie);

    //creating new variables to hold the number of miles each pony traveled
    //calling my TotalTrip method from my Equestria class on the coordinates of the cities each pony visits
    double rdMiles = rainbowDash.totalTrip(29, 16, 34, 8, 6, 19);
    double tsMiles = twilightSparkle.totalTrip(29, 16, 22, 7, 6, 19);
    double ppMiles = pinkiePie.totalTrip(22, 7, 34, 8, 25, 24);

    //printing an extra line to make my output look nice
    System.out.println(" ");

    //printing out the miles each pony traveled, to the screen
    System.out.println("Rainbow Dash traveled a total of " + rdMiles + " pony miles.");
    System.out.println("Twilight Sparkle traveled a total of " + tsMiles + " pony miles.");
    System.out.println("Pinkie Pie traveled a total of " + ppMiles + " pony miles.");

    //printing an extra line to make the output look better
    System.out.println(" ");

    //creating a double variable to hold the shortest route traveled - I used the Math.min function to find this
    double shortest = Math.min(rdMiles,(Math.min(tsMiles, ppMiles)));

    //bunch of if statements to print the output I want
    if (rdMiles == shortest)
    {
        System.out.println("Rainbow Dash traveled the shortest distance which was " + shortest + " pony miles.");
    }

    if (tsMiles == shortest)
    {
        System.out.println("Twilight Sparkle traveled the shortest distance which was " + shortest + " pony miles.");
    }

    if (ppMiles == shortest)
    {
        System.out.println("Pinkie Pie traveled the shortest distance which was " + shortest + " pony miles.");
    }


    //creating a double variable to hold the longest route traveled - I used the Math.max function to find this
    double longest = Math.max(rdMiles,(Math.max(tsMiles, ppMiles)));

    if (rdMiles == longest)
    {
        System.out.println("Rainbow Dash traveled the longest distance which was " + longest + " pony miles.");
    }

    if (tsMiles == longest)
    {
        System.out.println("Twilight Sparkle traveled the longest distance which was " + longest + " pony miles.");
    }

    if (ppMiles == longest)
    {
        System.out.println("Pinkie Pie traveled the longest distance which was " + longest + " pony miles.");
    }


}

}