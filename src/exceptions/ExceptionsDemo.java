package exceptions;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    //======================================================================================================================
//    public static void show(){
//        var reader = new FileReader("file.txt");
//    }
//    here the compile obligates us to check the exception by default
//======================================================================================================================

    //    public static void show(){
//        sayHello(null);
//}
//    public static void sayHello(String name){
//        System.out.println(name.toUpperCase());
//    }
    /*
    this is going to crush
    NullPointException
    Errors are pointed out in Stack Trace.
    This is called throwing an exception.
     */
//======================================================================================================================
//catching exceptions:
//    public static void show() {
//        try {
//            var reader = new FileReader("file.txt");
//            System.out.println("File opened."); // if the try stops at the line before, it will ignore the rest of the code.
//            // Only works if we put it after the try/catch block.
//        } catch (FileNotFoundException ex) {
//          System.out.println("File doesn't exist.");
//            System.out.println(ex.getMessage()); //This message is default in the FileNotFoundException.
//        }
//        //Shortcut: there is a button from intellij which automatically surrounds it. But it will put the standard
//        //e.StackTrace(); method. Will not appear as a message, but rather as an error.
//    }
//======================================================================================================================
// catching multiple types of exceptions :
//    public static void show() {
//        try {
//            var reader = new FileReader("file.txt");
//            var value = reader.read();
//            new SimpleDateFormat().parse("");
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//            //This will catch the exception if it does not find a file.
//        } catch (IOException e) {
//            System.out.println("Could not read data.");
//            //This will catch it if there isn't any I/O.
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        catch (IOException | ParseException e){
//            System.out.println();
//        }
// This will get either an IOException either ParseException. They can be put in the same block of code.
// Sometimes the hierarchy of the catch blocks matters. Like in the cases when a parent exception is put over.
// a child exception like swapping the IO with File, which is the parent class (IO is the parent)
//    }
//======================================================================================================================
//    the finally block:
//    public static void show() {
//        FileReader reader=null;
//        try {
//            reader = new FileReader("file.txt");
//            var value = reader.read(); //if the reader throws an exception, this line of code will not be executed.
//            reader.close();
//        } catch (IOException e) {
//            System.out.println("Could not read data.");
//        }
//        finally {
//            if(reader !=null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        //This will get executed, no matter what.
//    }
//======================================================================================================================
//The try-with-resources Statement:
//    public static void show() {
//        try (
//                var reader = new FileReader("file.txt");
//                var writer = new FileWriter("...");
//        ) {
//            var value = reader.read();
//        } catch (IOException e) {
//            System.out.println("Could not read data.");
//        }
//    }
// This will automatically add a final block and close the object. But it has to implement the AutoCloseable interface.
//======================================================================================================================
//Throwing Exceptions:
//    public static void show() {
//        var account = new Account();
//        account.deposit(-1); // this throws exception.
//        account.deposit(1); // this will not.
//        it's called defensive programming.
//}
//======================================================================================================================
// Rethrowing Exceptions :
//    public static void show() throws IOException {
//        var account = new Account();
//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            System.out.println("Logging");
//        throw e;
//        }
//    }
//======================================================================================================================
// Custom Exceptions :
//    public static void show(){
//        var account = new Account();
//        try {
//            account.withdraw(10);
//        } catch (InsufficientFundsException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//======================================================================================================================
// Chaining Exceptions:
    public static void show(){
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
//            e.printStackTrace(); //V1 exception;
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
//======================================================================================================================
}

