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
        gerrod.getName();
        gerrod.setAge(25);
        gerrod.getAge();
        gerrod.setGender('m');
        gerrod.getGender();
        gerrod.setOccupation("Coder");
        gerrod.getOccupation();
        gerrod.setAddress("323 Skeet Ave");
        gerrod.getAddress();
        spiderman.setName("Spiderman");
        spiderman.getName();
        spiderman.setAge(30);
        spiderman.getAge();
        spiderman.setGender('m');
        spiderman.getGender();
        spiderman.setOccupation("Superhero");
        spiderman.getOccupation();
        spiderman.setAddress("111 New York Rd");
        spiderman.getAddress();
        spiderman.setAllegiance("Good");
        spiderman.getAllegiance();
        spiderman.setAbility("Spider powers");
        spiderman.getAbility();
        spiderman.setHeroName("Spiderman");
        spiderman.getHeroName();
    }

    String getName() {
        System.out.println("Name is " + name);
        return name;
    }

    String setName(String nameToSet) {
        name = nameToSet;
        return name;
    }

    int getAge() {
        System.out.println("Age is " + age);
        return age;
    }

    int setAge(int ageToSet) {
        age = ageToSet;
        return age;
    }

    char getGender() {
        System.out.println("Gender is " + gender);
        return gender;
    }

    char setGender(char genderToSet) {
        gender = genderToSet;
        return gender;
    }

    String getOccupation() {
        System.out.println("Occupation is " + occupation);
        return occupation;
    }

    String setOccupation(String occupationToSet) {
        occupation = occupationToSet;
        return occupation;
    }

    String getAddress() {
        System.out.println("Address is " + address);
        return address;
    }

    String setAddress(String addressToSet) {
        address = addressToSet;
        return address;
    }
}
