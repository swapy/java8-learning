Classloaders

1. bootstrap
2. application or system
    - takes care of loading all the application level classes
    - It loads files found in the classpath environment variable, -classpath or -cp command line option.
    
3. extension class loader 
    - loads classes from $JAVA_HOME/lib/ext  or java.ext.dirs
    - subclass of bootstrap class loader.



If the last child class loader isn't able to load the class either, it throws java.lang.NoClassDefFoundError or java.lang.ClassNotFoundException.

