package polymorphim;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<IPerson> personList= new ArrayList<IPerson>();
        French french = new French("Pierre");
        Portuguese portuguese = new Portuguese("Marcelo");
        Japanese japanese = new Japanese("Goku");
        IPerson felipe = new French("Felipe");

        personList.add(french);
        personList.add(portuguese);
        personList.add(japanese);
        personList.add(felipe);

        for(IPerson person : personList){
            System.out.println(person.getName() + " speaks in "+  person.speak());
        }
    }
}
