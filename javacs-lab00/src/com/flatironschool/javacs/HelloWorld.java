package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // get the java version
        String version = System.getProperty("java.specification.version");
        
        // return the java version in a double
        return Double.parseDouble(version);
    }
    
    public static void main(String[] args) {
        //Testing getVersion()
        System.out.print(HelloWorld.getVersion());
    }
}
