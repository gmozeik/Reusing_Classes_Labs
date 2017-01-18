/**
 * Created by gerrodmozeik on 1/18/17.
 */
public class SuperHuman extends Human{

    private String allegiance;
    private String heroName;
    private String ability;

    String getAllegiance() {
        System.out.println("Allegiance is " + allegiance);
        return allegiance;
    }

    String setAllegiance(String allegianceToSet) {
        allegiance = allegianceToSet;
        return allegiance;
    }

    String getHeroName() {
        System.out.println("Hero name is " + heroName);
        return heroName;
    }

    String setHeroName(String heroNameToSet) {
        heroName = heroNameToSet;
        return heroName;
    }

    String getAbility() {
        System.out.println("Ability is " + ability);
        return ability;
    }

    String setAbility(String abilityToSet) {
        ability = abilityToSet;
        return ability;
    }
}
