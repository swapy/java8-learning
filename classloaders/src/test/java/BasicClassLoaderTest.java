import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;

public class BasicClassLoaderTest {


    @Test
    public void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Classloader of this class:"
                + BasicClassLoaderTest.class.getClassLoader());

        System.out.println("Classloader of Logging:"
                + Logger.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }
}
