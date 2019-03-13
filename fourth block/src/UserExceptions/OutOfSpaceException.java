package UserExceptions;

public class OutOfSpaceException extends Exception {
     float spaceLeft;

    public OutOfSpaceException(String message, float spaceLeft) {
        super(message);
        this.spaceLeft = spaceLeft;
    }

    public float getSpaceLeft() {
        return spaceLeft;
    }
}
