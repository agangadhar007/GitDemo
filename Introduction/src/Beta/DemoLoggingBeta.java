package Beta;
import org.apache.logging.log4j.*;

public class DemoLoggingBeta {
	
	private static Logger log =LogManager.getLogger(DemoLoggingBeta.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Debugging mode");
		log.info("Info mode");
		log.error("error mode");
		log.fatal("fatal mode");
		

	}

}
