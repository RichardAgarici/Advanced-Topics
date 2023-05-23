package exceptions;

import java.io.IOException;

//Throwing exceptions
public class Account {
    //======================================================================================================================
//    public void deposit(float value) throws IOException {
//        if (value <= 0)
////            throw new IllegalArgumentException();
//            throw new IOException();
//    }
// This represents the API of the application.
// In this case is not a compilation error but a coding error which should be fixed.
//======================================================================================================================
// Custom Exceptions :
//    private float balance;
//
//    public void deposit(float value) throws IOException {
//        if (value <= 0)
////            throw new IllegalArgumentException();
//            throw new IOException();
//    }
//    public void withdraw(float value) throws InsufficientFundsException {
//        if (value > balance)
//            throw new InsufficientFundsException();
//    }
//======================================================================================================================
// Chaining Exceptions:
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0)
//            throw new IllegalArgumentException();
            throw new IOException();
    }
    public void withdraw(float value) throws AccountException {
        if (value > balance){
            throw new AccountException(new InsufficientFundsException());
        }
    }
//======================================================================================================================
}
