/**********************************************************************
 * Sample solution for Activity 3.7.4
 **********************************************************************/
import java.util.ArrayList;

 public class RandomPermRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces = new ArrayList<Horse>();
    ArrayList<Horse> randomBarnSpaces = new ArrayList<Horse>();
    barnSpaces = barn.getSpaces();

    int[] randNums = RandomPermutation.next(barnSpaces.size() - 1);

    for (int i = 0; i < randNums.length; i++) {
      randomBarnSpaces.add(barnSpaces.get(randNums[i]));
    }

    System.out.println("Randomized barn spaces ArrayList: " + randomBarnSpaces + "\n");

    System.out.println("Partnerships:");    
    for (int i = 0; i < randNums.length - 2; i += 2) 
      System.out.println(randomBarnSpaces.get(i) + " and " + randomBarnSpaces.get(i + 1));
    if (randNums.length % 2 != 0) System.out.println(randomBarnSpaces.get(randNums.length - 1) + " has no partner :(");

  }
}