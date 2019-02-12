public class IncorrectAgeException extends RuntimeException{
    public IncorrectAgeException(String message) {
       super(message);
    System.out.println("Wrong age, It can't be less than 1.");
    }
}