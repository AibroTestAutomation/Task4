package HomeWork.Entity;

public class IlluminanceNotEnoughException extends Exception {
    @Override
    public String toString() {
        return "Illumination should be more than 300 lx.";
    }
}
