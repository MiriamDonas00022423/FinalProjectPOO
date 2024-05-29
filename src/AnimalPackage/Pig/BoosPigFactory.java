package AnimalPackage.Pig;

public class BoosPigFactory extends PigFactory{
    @Override
    Pig createPig() {
        return new BossPig();
    }
}
