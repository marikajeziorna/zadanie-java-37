public class NameUndefinedException extends Exception{
    public NameUndefinedException(String message) {
        super(message);
        System.out.println("First Name and Lsat Name can't be empty.");
    }
}