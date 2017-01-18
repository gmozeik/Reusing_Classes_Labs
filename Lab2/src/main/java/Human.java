/**
 * Created by gerrodmozeik on 1/18/17.
 */
public class Human {

    String name;
    int age;
    char gender;
    String occupation;
    String address;

    public static void main(String[] args) {
        Human gerrod = new Human();
        SuperHuman spiderman = new SuperHuman();
        gerrod.setName("Gerrod");
        System.out.println("Human name is " + gerrod.getName());
        gerrod.setAge(25);
        System.out.println("Human age is " + gerrod.getAge());
        gerrod.setGender('m');
        System.out.println("Human gender is " + gerrod.getGender());
        gerrod.setOccupation("Coder");
        System.out.println("Human occupation is " + gerrod.getOccupation());
        gerrod.setAddress("323 Skeet Ave");
        System.out.println("Human address is " + gerrod.getAddress());
        spiderman.setName("Spiderman");
        System.out.println("Superhero name is " + spiderman.getName());
        spiderman.setAge(30);
        System.out.println("Superhero age is " + spiderman.getAge());
        spiderman.setGender('m');
        System.out.println("Superhero gender is " + spiderman.getGender());
        spiderman.setOccupation("Superhero");
        System.out.println("Superhero occupation is " + spiderman.getOccupation());
        spiderman.setAddress("111 New York Rd");
        System.out.println("Superhero address is " + spiderman.getAddress());
        spiderman.setAllegiance("Good");
        System.out.println("Superhero allegiance is " + spiderman.getAllegiance());
        spiderman.setAbility("Spider powers");
        System.out.println("Superhero ability is " + spiderman.getAbility());
        spiderman.setHeroName("Spiderman");
        System.out.println("Superhero name is " + spiderman.getHeroName());

    }

    String getName() {
        return name;
    }

    String setName(String nameToSet) {
        name = nameToSet;
        return name;
    }

    int getAge() {
        return age;
    }

    int setAge(int ageToSet) {
        age = ageToSet;
        return age;
    }

    char getGender() {
        return gender;
    }

    char setGender(char genderToSet) {
        gender = genderToSet;
        return gender;
    }

    String getOccupation() {
        return occupation;
    }

    String setOccupation(String occupationToSet) {
        occupation = occupationToSet;
        return occupation;
    }

    String getAddress() {
        return address;
    }

    String setAddress(String addressToSet) {
        address = addressToSet;
        return address;
    }
}
