package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;
    public Building(int length,int width,int lotLength,int lotWidth)
    {
        mLength=length;
        mWidth=width;
        mLotLength=lotLength;
        mLotWidth=lotWidth;
    }
    public int getLength()
    {
        return mLength;
    }
    public int getWidth()
    {
        return mWidth;
    }
    public int getLotLength()
    {
        return mLotLength;
    }
    public int getLotWidth()
    {
        return mLotWidth;
    }
    public void setLength(int mLength)
    {
        this.mLength=mLength;
    }
    public void setWidth(int mWidth)
    {
        this.mWidth=mWidth;
    }
    public void setLotLength(int mLotLength)
    {
        this.mLotLength=mLotLength;
    }
    public void setLotWidth(int mLotWidth)
    {
        this.mLotWidth=mLotWidth;
    }
    public int calcBuildingArea()
    {
        return this.getLength()*this.getWidth();
    }
    public int calcLotArea()
    {
        return this.getLotLength()*this.getLotWidth();
    }
    @Override
    public String toString()
    {
        return "Building";
    }
}
