package Background;

public class DesertBackgroundFactory extends BackgroundFactory{
    @Override
    public Background createBackground() {
        return new DesertBackground();
    }
}
