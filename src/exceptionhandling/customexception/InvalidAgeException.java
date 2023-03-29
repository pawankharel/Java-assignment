package exceptionhandling.customexception;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message); //parent(In this case parent class is Exception) class ko cunstroctor call garxa
    }
}
