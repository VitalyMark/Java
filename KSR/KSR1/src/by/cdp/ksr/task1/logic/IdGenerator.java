package by.cdp.ksr.task1.logic;

/**
 * Created by Vitali_Markusheusky on 5/16/2019.
 */
public class IdGenerator {
    private static int uniqueId=100000001;

    public static int getUniqueId()
    {
     return uniqueId++;
    }


}
