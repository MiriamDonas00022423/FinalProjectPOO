package Background;

public class CityBackgroundFactory extends BackgroundFactory{
    @Override
    public Background createBackground() {
        return new CityBackground();
    }
}
