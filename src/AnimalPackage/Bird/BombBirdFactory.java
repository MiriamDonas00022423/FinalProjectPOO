package AnimalPackage.Bird;

public class BombBirdFactory extends BirdFactory {
    @Override
    public Bird createBird() {
        return new BombBird();
    }
}
