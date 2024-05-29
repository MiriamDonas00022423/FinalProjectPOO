package AnimalPackage.Bird;

public interface Bird {

    float velocity = 0;
    boolean isLaunched = false;

    void launch();
    void displacement(double strength , float angle);
}
