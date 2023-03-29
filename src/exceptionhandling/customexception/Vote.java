package exceptionhandling.customexception;

public class Vote {
    public void eligibilityToVote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Cannot vote");
        } else {
            System.out.println("Can Vote...");
        }
    }
}
