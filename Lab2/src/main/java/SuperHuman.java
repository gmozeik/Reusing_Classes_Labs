/**
 * Created by gerrodmozeik on 1/18/17.
 */
public class SuperHuman extends Human{

    private String allegiance;
    private String heroName;
    private String ability;

    String getAllegiance() {
        return allegiance;
    }

    String setAllegiance(String allegianceToSet) {
        allegiance = allegianceToSet;
        return allegiance;
    }

    String getHeroName() {
        return heroName;
    }

    String setHeroName(String heroNameToSet) {
        heroName = heroNameToSet;
        return heroName;
    }

    String getAbility() {
        return ability;
    }

    String setAbility(String abilityToSet) {
        ability = abilityToSet;
        return ability;
    }
}
