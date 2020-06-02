package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
       
    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices=0;
    Office secondoffice;
    public Office(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        mBusinessName=null;
        mParkingSpaces=0;
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName)
    {
        this(length, width, lotLength, lotWidth);
        mBusinessName=businessName;
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces)
    {
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces=parkingSpaces;
        sTotalOffices++;
    }
    public String getBusinessName()
    {
        return mBusinessName;
    }
    public int getParkingSpaces()
    {
        return mParkingSpaces;
    }
    public void setBusinessName(String mBusinessName)
    {
        this.mBusinessName=mBusinessName;
    }
    public void setParkingSpaces(int mParkingSpaces)
    {
        this.mParkingSpaces=mParkingSpaces;
    }
    @Override
    public String toString()
    {
        String result="Business: ";
        if(mBusinessName==null)
            result+="unoccupied;";
        else
            result+=mBusinessName+";";
        if(mParkingSpaces!=0)
            result+="has "+mParkingSpaces+" parking spaces";
        result+="(total offices: "+sTotalOffices+")";
        return result;
    }
    @Override
    public boolean equals(Object object)
    {
        boolean result=false;
        if(object instanceof Office) {
            secondoffice = (Office) object;
            if (secondoffice.calcBuildingArea() == this.calcBuildingArea() && secondoffice.getParkingSpaces() == this.getParkingSpaces())
                result = true;
        }
        return result;
    }
}
