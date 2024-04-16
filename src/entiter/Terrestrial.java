
package entiter;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    public void swim() {
        System.out.println(" this aquatic is animal is swimming ");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nbrLegs=" + nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {

    }

    @Override
    public void eatPlant(Food plant) {

    }

    @Override
    public void eatPlantAndMeat(Food food) {

    }
}
