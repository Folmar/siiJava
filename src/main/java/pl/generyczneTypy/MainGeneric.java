package pl.generyczneTypy;

import java.util.ArrayList;

public class MainGeneric {

    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        Box<Person> box = new Box<>();
        box.put(new Person());
        boxes.add(0, box);
        System.out.println();

        Person person = box.get();

        MainGeneric mainGeneric = new MainGeneric();
        String firstName = mainGeneric.getSomeValue(new Person("Marek", "Foltyn"));
        System.out.println();
    }

    public static <T> T getSomeValue(Person person) {
        return (T) person.getFirstName();
    }

    static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Person() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

/*    public void addWthIndex(int index, ArrayList<Box> boxes, Box box) {
        boxes.add(index, box);
    }*/
}
