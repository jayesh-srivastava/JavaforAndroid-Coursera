package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Operations {
    // TODO -- start your code here


    /**
     * Implementing the operate method of the Operations Interface
     */
    public String operate(int argumentOne,int argumentTwo)
    {
        int difference=argumentOne-argumentTwo;
        /**
         * Converting the int difference to String for returning.
         */
        String result=Integer.toString(difference);
        return result;
    }
}
