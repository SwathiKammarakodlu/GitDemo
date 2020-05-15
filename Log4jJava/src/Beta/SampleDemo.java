package Beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Alpha.SampleJava;

public class SampleDemo {

	private static Logger Log = LogManager.getLogger(SampleJava.class.getClass());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("debug message Beta");
		Log.error("error message Beta");
		Log.fatal("fatal message Beta");
		Log.info("Info message Beta");
	}

}
