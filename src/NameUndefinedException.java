public class NameUndefinedException extends RuntimeException{
    public NameUndefinedException(String message) {
        super(message);
        System.out.println("First Name and Lsat Name can't be empty.");
    }
}