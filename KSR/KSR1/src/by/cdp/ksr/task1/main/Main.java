package by.cdp.ksr.task1.main;

import by.cdp.ksr.task1.entity.common.Address;


import by.cdp.ksr.task1.entity.person.Customer;
import by.cdp.ksr.task1.entity.person.Person;
import by.cdp.ksr.task1.entity.person.Student;

/**
 * Created by Vitali_Markusheusky on 5/16/2019.
 */
public class Main {
    public static void main (String[]  avg){


        Address adrPerson1= new Address("Беларусь", "Минск", "Рафиева", 19);
        Person person1 = new Customer("Васильев", "Василий", adrPerson1, 121212313 );
        Address adrPerson2= new Address("Беларусь", "Минск", "Рафиева", 19);
        Person person2 = new Student("Васильев", "Василий", adrPerson2, "ывыв", 2);
        Person person3 = new Person("Gegc", "Вsdsdасилий", adrPerson2);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        person3.setAddress(new Address ("","","",2,3,4));
        System.out.println(person3);
    }


}
