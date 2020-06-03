package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Operations {
    // TODO -- start your code here


    /**
     * Implementing the operate method of the Operations Interface
     */
    public String operate(int argumentOne,int argumentTwo)
    {
        int sum=argumentOne+argumentTwo;
        /**
         * Converting the int sum to String for returning.
         */
        String result=Integer.toString(sum);
        return result;
    }
}
