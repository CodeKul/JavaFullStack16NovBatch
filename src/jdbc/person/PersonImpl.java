package jdbc.person;

import jdbc.person.entity.Person;
import jdbc.person.service.PersonService;
import jdbc.person.service.PersonServiceImpl;

import java.util.Scanner;

public class PersonImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        PersonService personService = new PersonServiceImpl();
        do {
            System.out.println("1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    Person person = new Person();
                    System.out.println("Enter Id");
                    person.setId(sc.nextInt());
                    System.out.println("Enter first name");
                    person.setFirstName(sc.next());
                    personService.insert(person);
                    break;
                case 2:
                    System.out.println("Choose below option for update");
                    System.out.println("1.First Name");
                    System.out.println("2.Last Name");
                    System.out.println("3.EMail");
                    System.out.println("4.Mobile");
                    int option = sc.nextInt();
                    switch (option){
                        case 1:
                            System.out.println("Enter person id for updating first name");
                            Integer id = sc.nextInt();
                    }
            }

        }while (ch<6);
    }
}
