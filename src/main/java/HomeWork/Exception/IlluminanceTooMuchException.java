package HomeWork.Exception;

public class IlluminanceTooMuchException extends Throwable {
    @Override
    public String toString() {
        return "Illumination should be less than 4000 lx.";
    }
}