package problem3;

public class Problem3 {

    public static int binToDec(String numBin) throws IllegalArgumentException  {
        int numDec = 0;
        for(int i=0; i<numBin.length(); i++) {            
            if (numBin.charAt(i) == '0') 
                numDec = 2 * numDec;
            else if (numBin.charAt(i) == '1')
                numDec = (2 * numDec) + 1;
            else
                throw new IllegalArgumentException(numBin);                               
        }                
        return numDec;
    }
}
