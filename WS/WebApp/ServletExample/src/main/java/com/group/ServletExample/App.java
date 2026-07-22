package com.group.ServletExample;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException 
    {
        System.out.println( "Hello World!" );
        
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        tomcat.getConnector();
        
        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context,"HELLO SERVLET", new HelloServlet());
        context.addServletMappingDecoded("/hello","HELLO SERVLET");
        
        tomcat.start();
        tomcat.getServer().await();;
    }
}
