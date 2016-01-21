package test.task2;

import com.company.PropertyManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ira on 22.01.2016.
 */
public class TestPropertyManager {

    @Test
    public void testProperyManager(){
        PropertyManager propertyManager = new PropertyManager();
        assertTrue(propertyManager.init("test.task2.main"));
        assertEquals("",propertyManager.getValue(""),null);
        assertEquals("",propertyManager.getValue("dbpassword"),"password");

      //  System.out.println();

    }
}
