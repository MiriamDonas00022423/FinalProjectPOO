package AnimalPackage.Bird;

public class ChuckBirdFactory extends BirdFactory {
    @Override
    public Bird createBird() {
        return new ChuckBird();
    }
}
