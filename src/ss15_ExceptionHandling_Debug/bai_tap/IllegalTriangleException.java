package ss15_ExceptionHandling_Debug.bai_tap;

public class IllegalTriangleException extends Throwable {
    String errorMessage;

    public IllegalTriangleException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
