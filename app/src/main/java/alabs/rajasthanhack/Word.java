package alabs.rajasthanhack;

/**
 * Created by DHANUSH on 20-03-2018.
 */


public class Word {
    private String mName;
    private String mDistance;
    private int resId=-1;


    public String getmName() {
        return mName;
    }

    public String getmDistance() {
        return mDistance;
    }



    public Word(String s, String s1,int resorceId)
    {
        mName=s;
        mDistance=s1;
        resId=resorceId;

    }
    public int getResId()
    {
        return resId;
    }

    public boolean hasImage()
    {
        if(resId==-1)
            return false;
        else
            return true;
    }
}
