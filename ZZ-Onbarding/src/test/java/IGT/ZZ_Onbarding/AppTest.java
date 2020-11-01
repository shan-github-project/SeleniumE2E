package IGT.ZZ_Onbarding;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        System.out.println("commit x");
        System.out.println("commit y");
    }

    public void Appium( String testName )
    {
        
        System.out.println("branch test 1");
        System.out.println("branch test 2");
    }
    
    public void Api( String testName )
    {
        
        System.out.println("branch test 1");
        System.out.println("branch test 2");
    }
    
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
