package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        int mid=((size*2)+2)/2;                                                                     //To find the mid value of the column.
        if(size==1)
        {
            for(int x=1;x<=3;x++)
            {
                for (int y=1;y<=4;y++)
                {
                    if(x==1&&(y==1||y==4)||x==3&&(y==1||y==4))
                    {
                        mOut.print("+");
                    }
                    else if(x==1&&(y==2||y==3)||x==3&&(y==2||y==3))
                    {
                        mOut.print("-");
                    }
                    else if(x==2&&(y==1||y==4))
                    {
                        mOut.print("|");
                    }
                    else if(x==2&&(y==2||y==3))
                    {
                        if(x==2&&y==2)
                        {
                            mOut.print("<");
                        }
                        else
                        {
                            mOut.print(">");
                        }
                    }
                    else
                    {
                        mOut.print(" ");
                    }
                }
                mOut.println("");
            }
        }
        else
        {
            for(int x=1;x<=(size*2)+1;x++)
            {
                for(int y=1;y<=(size*2)+2;y++)
                {

                    if(x==1&&(y==1||y==((size*2)+2))||x==((size*2)+1)&&(y==1||y==((size*2)+2)))
                    {
                        mOut.print("+");
                    }
                    else if((x>=2&&x<=(size*2))&&(y==1||y==((size*2)+2)))
                    {
                        mOut.print("|");
                    }
                    else if((y>=2&&y<=((size*2)+1))&&(x==1||x==((size*2)+1)))
                    {
                        mOut.print("-");
                    }
                    else if(y<=mid)
                    {
                        if(x<=mid-1&&(x+y==size+3))
                        {
                            mOut.print("/");
                        }
                        else if(x<=mid-1&&x+y>size+3)
                        {
                            if (x%2==0)
                            {
                                mOut.print("=");
                            }
                            else
                            {
                                mOut.print("-");
                            }
                        } 
                        else if(x>=mid+1&&(x-y==size-1))
                        {
                            mOut.print("\\");
                        }
                        else if (x >= mid + 1 && x - y < size)
                        {
                            if(x%2==0)
                            {
                                mOut.print("=");
                            }
                            else
                            {
                                mOut.print("-");
                            }
                        }
                        else if(x==mid&&x+y==size+3)
                        {
                            mOut.print("<");
                        }
                        else if(x==mid&&x+y>size+3)
                        {
                            if (x % 2 == 0)
                            {
                                mOut.print("=");
                            }
                            else
                            {
                                mOut.print("-");
                            }
                        }
                        else 
                        {   
                            mOut.print(" "); 
                        }
                    }
                    else if(y>=mid+1)
                    {
                        if(x>=mid+1&&(x+y)-size==((size*2)+2))
                        {
                            mOut.print("/");
                        }
                        else if(x>=mid+1&&(x+y)-size<((size*2)+2))
                        {
                            if(x%2==0)
                            {
                                mOut.print("=");
                            }
                            else
                            {
                                mOut.print("-");
                            }
                        }
                        else if(x<=mid-1&&y-x==size)
                        {
                            mOut.print("\\");
                        }
                        else if(x<=mid-1&&y-x<size)
                        {
                            if(x%2==0)
                            {
                                mOut.print("=");
                            }
                            else
                            {    
                                mOut.print("-");
                            }
                        }
                        else if(x==mid&&(x+y)-size==((size*2)+2))
                        {
                            mOut.print(">");
                        }
                        else if(x==mid&&(x+y)-size<((size*2)+2))
                        {
                            if(x%2==0)
                            {
                                mOut.print("=");
                            }
                            else
                            {    
                                mOut.print("-");
                            }
                        }
                        else 
                        {    
                            mOut.print(" ");
                        }
                    }
                    else
                    {    
                        mOut.print(" ");
                    }
                }
                mOut.println("");
            }
        }
    }
}

