package mooc.vandy.java4android.calculator.logic;


/**
 * Perform the Divide operation.
 */
public class Divide implements Operations {
    // TODO -- start your code here


    /**
     * Implementing the operate method of the Operations Interface
     */
    public String operate(int argumentOne,int argumentTwo)
    {
        if(argumentTwo==0)
        {
            return "Cannot divide by zero.";
        }
        else
        {
            int quotient = argumentOne / argumentTwo;
            int remainder = argumentOne % argumentTwo;
            /**
             * Converting the int quotient and remainder to String for returning.
             */
            String resultq = Integer.toString(quotient);
            String resultr = Integer.toString(remainder);
            return resultq + " R: " + resultr;
        }
    }
}
