package AnimalPackage.Bird;

public class RedBirdFactory extends BirdFactory {
    @Override
    public Bird createBird() {
        return new RedBird();
    }
}
