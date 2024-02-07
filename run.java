import java.util.ArrayList;

/**
 * The runner class for HorseBarn
 */
public class run 
{
  
  public static void main(String[] args) 
  {  
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces = barn.getSpaces();

    double totalWeight = 0;
    int numHorses = 0;
    for (Horse h : barnSpaces)
    {

      totalWeight += h.getWeight();
      numHorses++;
    } 
    System.out.println("The average weight is: " + (totalWeight/numHorses));
    System.out.println("The horses above the average weight are: ");
    Horse maxHorse = barnSpaces.get(0);
    Horse minHorse = barnSpaces.get(0);
    for (int i = 0; i < barnSpaces.size(); i++)
    {
      if (barnSpaces.get(i).getWeight() > (totalWeight/numHorses))
        System.out.println(barnSpaces.get(i));
      if (barnSpaces.get(i).getWeight() > maxHorse.getWeight())
        maxHorse = barnSpaces.get(i);
      if (barnSpaces.get(i).getWeight() < minHorse.getWeight())
        minHorse = barnSpaces.get(i);
    }
    System.out.println("The heaviest horse is: " + maxHorse);
    System.out.println("The lightest horse is: " + minHorse);

    Horse bill = new Horse("fart", 50);

    for (int i = 0; i < barnSpaces.size(); i++)
    {
      if (barnSpaces.get(i).getName().equals("Duke"))
        barnSpaces.set(i, new Horse ("Princess", 1445));
      if (barnSpaces.get(i).getName().equals("Silver"))
        barnSpaces.add(i+1, new Horse ("Chief", 1505));
      if (barnSpaces.get(i).getName().equals("Buddy"))
      {
        barnSpaces.add(i, new Horse ("Gypsy", 1335));
        barnSpaces.add(i+2, new Horse ("Magic", 1425));
        i++;
      }
    }

    for (int i = 0; i < barnSpaces.size(); i++)
      System.out.print(barnSpaces.get(i).getName() + ", ");

    System.out.println("");
    ArrayList<Horse> randHorses = HorseBarn.next(barnSpaces);

    for (int i = 0; i < randHorses.size(); i++)
      System.out.print(randHorses.get(i).getName() + ", ");
  }
} 
