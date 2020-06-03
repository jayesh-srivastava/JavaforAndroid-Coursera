package mooc.vandy.java4android.calculator.logic;


/**
 * Perform the Multiply operation.
 */
public class Multiply implements Operations {
    // TODO -- start your code here


    /**
     * Implementing the operate method of the Operations Interface
     */
    public String operate(int argumentOne,int argumentTwo)
    {
        int product=argumentOne*argumentTwo;
        /**
         * Converting the int product to String for returning.
         */
        String result=Integer.toString(product);
        return result;
    }
}
