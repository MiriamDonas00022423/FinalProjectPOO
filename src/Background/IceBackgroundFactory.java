package Background;

public class IceBackgroundFactory extends BackgroundFactory{
    @Override
    public Background createBackground() {
        return new IceBackground();
    }
}
