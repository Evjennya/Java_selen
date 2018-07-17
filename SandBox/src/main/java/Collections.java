import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by prohorova on 12.07.2018.
 */
public class Collections {

  public static void main (String[] args){

    String[] langs = {"Java", "C#", "Python", "PHP"};

    List<String> languages = new ArrayList<String>();
    languages.add("Java");
    languages.add("C#");
    languages.add("Python");

    List<String> languag = Arrays.asList("Java", "C#", "Python", "PHP");



    for (String l : langs) {
      System.out.println("Я хочу выучить " + l);
    }

    for (String l : languages) {
      System.out.println("Я хочу выучить " + l);
    }

  }
}
