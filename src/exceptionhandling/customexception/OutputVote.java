package exceptionhandling.customexception;

public class OutputVote {
    public static void main(String[] args) {
        Vote vote = new Vote();
        try{
            vote.eligibilityToVote(21);
        }catch (InvalidAgeException e){
            //e.printStackTrace();//system generated exception message
            System.out.println("Eligible: ");
        }
    }
}
