package AnimalPackage.Bird;

public class TerenceBirdFactory extends BirdFactory {
    @Override
    public Bird createBird() {
        return new TerenceBird();
    }
}
