package AnimalPackage.Pig;

public class RegularPigFactory extends PigFactory{
    @Override
    Pig createPig() {
        return new RegularPig();
    }
}
