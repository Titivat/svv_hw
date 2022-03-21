package problem5Test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import problem5.Problem5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Problem5Test {

    private Problem5 problem5;
    @Before
    public void runBeforeEachTest()
    {
        problem5 = new Problem5();
    }

    @Test
    @DisplayName("test Comb")
    public void testComb(){
        try {
            File myObj = new File("Problem5/src/problem5Test/test.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] parts = data.split(",");

                long val1 = Long.parseLong(parts[0]);
                long val2 = Long.parseLong(parts[1]);
                long val3 = Long.parseLong(parts[2]);
                assertEquals( problem5.comb(val1,val2), val3);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
