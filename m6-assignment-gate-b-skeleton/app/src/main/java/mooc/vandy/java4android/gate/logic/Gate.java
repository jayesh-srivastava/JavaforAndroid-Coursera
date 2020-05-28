package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate
{
    public static final int IN=1;
    public static final int OUT=-1;
    public static final int CLOSED=0;
    private int mSwing;
    public boolean setSwing(int direction)
    {
        boolean result=false;
        if(direction==IN || direction==OUT || direction==CLOSED) {
            mSwing = direction;
            result = true;
        }
        return result;
    }
    public int getSwingDirection()
    {
        return mSwing;
    }
    public boolean open(int direction)
    {
        boolean result=true;
        if(direction!=IN && direction!=OUT)
            result=false;
        else
            this.setSwing(direction);
        return result;
    }
    public int thru(int count)
    {
        int check=0;
        if(this.getSwingDirection()==IN)
            check=+count;
        else if(this.getSwingDirection()==OUT)
            check=-count;
        return check;
    }
    public String toString()
    {
        String s="";
        if(this.getSwingDirection()==IN)
            s="This gate is open and swings to enter the pen only";
        else if(this.getSwingDirection()==OUT)
            s="This gate is open and swings to exit the pen only";
        else if(this.getSwingDirection()==CLOSED)
            s="This gate is closed";
        else
            s="This gate has an invalid swing direction";
        return s;
    }
    public void close()
    {
    }


}
