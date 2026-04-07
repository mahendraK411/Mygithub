public class Main {
  public static void main(String args[]) {
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);
  }
}

class Test {
    // Method to find factorial of given number
    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    // main method
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of " + num + " is "
                           + factorial(5));
    }
}

// Working of chained exceptions
public class Geeks {
    public static void main(String[] args) {
        try {
          
            // Creating an exception
            NumberFormatException ex = new NumberFormatException("Primary Exception");

            // Setting the cause of the exception
            ex.initCause(new NullPointerException("Root cause of the exception"));

            // Throwing the exception with a cause
            throw ex;
        } 
        catch (NumberFormatException ex) {
          
            // Displaying the primary exception
            System.out.println("Caught Exception: " + ex);

            // Displaying the root cause of the exception
            System.out.println("Cause of Exception: " + ex.getCause());
        }
    }
}








