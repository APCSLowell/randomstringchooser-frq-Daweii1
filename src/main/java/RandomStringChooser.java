import java.util.*;
public class RandomStringChooser
{
  private Arraylist <String> boom;

  public RandomStringChooser(string[] a) {
  for(int i =0; i < a.length; i++) {
boom.add(a[i]);
  }

  }

  public String getNext() {
  if(boom.size() > 0)
    return boom.remove((int)(Math.random()*boom.size()));
    else
    return "NONE";


  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
