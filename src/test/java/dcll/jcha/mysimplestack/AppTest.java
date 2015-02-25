package dcll.jcha.mysimplestack;

import dcll.jcha.mysimplestack.MySimpleStack.ImplStack;
import dcll.jcha.mysimplestack.MySimpleStack.Item;
import dcll.jcha.mysimplestack.MySimpleStack.SimpleStack;
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
     */
    public AppTest()
    {
        super( "testName" );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void emptyTest(){
        ImplStack test = new ImplStack();
        assertTrue(test.isEmpty());
    }

    public void notEmptyTest(){
        ImplStack test = new ImplStack();
        Item i = new Item(0);
        test.push(i);
        assertFalse(test.isEmpty());
    }

    public void sizeTest(){
        ImplStack test = new ImplStack();
        Item i = new Item(0);
        Item i2 = new Item(1);
        test.push(i);
        test.push(i2);

        assertEquals(2, test.getSize());
    }

}
