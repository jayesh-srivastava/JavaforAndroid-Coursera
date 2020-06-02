package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building
{
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;
    House secondhouse;
    public House(int length,int width,int lotLength,int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
    }
    public House(int length,int width,int lotLength,int lotWidth,String owner)
    {
        this(length,width,lotLength,lotWidth);
        mOwner=owner;
    }
    public House(int length,int width,int lotLength,int lotWidth,String owner,boolean pool)
    {
        this(length,width,lotLength,lotWidth);
        mOwner=owner;
        mPool=pool;
    }
    public String getOwner()
    {
        return mOwner;
    }
    public boolean hasPool()
    {
        if(mPool)
            return true;
        else
            return false;
    }
    public void setOwner(String mOwner)
    {
        this.mOwner=mOwner;
    }
    public void setPool(boolean mPool)
    {
        this.mPool=mPool;
    }
    @Override
    public String toString()
    {
        String result = "Owner: ";
        if (mOwner != null)
            result += getOwner();
        else
            result += "n/a";
        if (mPool)
            result += "; has a pool";
        if(this.calcLotArea() > 2*this.calcBuildingArea())
            result += "; has a big open space";
        return result;
    }
    @Override
    public boolean equals(Object object)
    {
        boolean result=false;
        if(object instanceof House) {
            secondhouse = (House) object;
            if (secondhouse.calcBuildingArea() == this.calcBuildingArea() && secondhouse.hasPool() == this.hasPool())
                result=true;
        }
        return result;
    }
}
