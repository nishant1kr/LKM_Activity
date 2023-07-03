package ActivityMaven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortLambda 
{
    public static void main( String[] args )
    {
        List<String> str = new ArrayList();
        str.add("Python");
        str.add("Java");
        str.add("ASP.Net");
        str.add("Salesforce");
        str.add("Generative AI");


    Comparator<String> mycomparator = (str1, str2) -> str1.compareToIgnoreCase(str2);
    str.sort(mycomparator);
    System.out.println(str);
}
}