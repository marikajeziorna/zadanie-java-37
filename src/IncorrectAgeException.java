public class IncorrectAgeException extends Exception{
    public IncorrectAgeException(String message) {
       super(message);
    System.out.println("Wrong age, It can't be less than 1.");
    }
}