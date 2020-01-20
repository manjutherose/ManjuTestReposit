package ManjuTest.ManjuTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class AppTest {
	 static Logger lg = Logger.getLogger(ManjuTest.ManjuTest.AppTest.class);
	@Test (groups = { "FR1","Regression" })
    public void testcase1()
    {

	   
	    try
	    {
	   
	 	    PropertyConfigurator.configure("log4j.properties");
	 	    
	 	    //Log in console in and log file
	 	    
	 	    lg.info("TC1: Starting Testcase1 in AppTest");
	 	    lg.trace("TC1:tracing");
	 	    String fname = "Manju";
	 	    lg.trace("TC1:processing first name - " + fname);
	 	   throw new NullPointerException("demo"); 
	 	 
	 	    
	    }
	    catch(Exception e)
	    {
	    	 lg.error((e.getMessage()));
	    	 lg.fatal("TC1:fatal");
	    }
	    finally
	    {
	    	lg.info("TC1:Executing finally block");
	    }
	    
	    }
	@Test (groups = { "Fr2" })
	 public void testcase2()
	    {

		try
	    {
	    	 System.out.println( "www.hsn.com" );
	 	    PropertyConfigurator.configure("log4j.properties");
	 	    
	 	    //Log in console in and log file
	 	    
	 	    lg.info("TC2: Starting Testcase2 in AppTest");
	 	    lg.trace("TC2:tracing");
	 	    String fname = "Manju";
	 	    lg.trace("TC2:processing first name - " + fname);
	 	   throw new NullPointerException("demo"); 
	 	 
	 	    
	    }
	    catch(Exception e)
	    {
	    	 lg.error((e.getMessage()));
	    	 lg.fatal("TC2:fatal");
	    }
	    finally
	    {
	    	lg.info("TC2:Executing finally block");
	    }
		    
		    }
	@Test (groups = { "Fr2","Regression" })
	 public void testcase3()
	    {

		   
		try
	    {
	    	 System.out.println( "www.hsn.com" );
	 	    PropertyConfigurator.configure("log4j.properties");
	 	    
	 	    //Log in console in and log file
	 	    
	 	    lg.info("TC3: Starting Testcase3 in AppTest");
	 	    lg.trace("TC3:tracing");
	 	    String fname = "Manju";
	 	    lg.trace("TC3:processing first name - " + fname);
	 	   throw new NullPointerException("demo"); 
	 	 
	 	    
	    }
	    catch(Exception e)
	    {
	    	 lg.error((e.getMessage()));
	    	 lg.fatal("TC3:fatal");
	    }
	    finally
	    {
	    	lg.info("TC3:Executing finally block");
	    }
		    
		    }
	
}
