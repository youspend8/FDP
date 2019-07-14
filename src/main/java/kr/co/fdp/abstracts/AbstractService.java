package kr.co.fdp.abstracts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractService {
	protected static final Logger logger = LoggerFactory.getLogger(AbstractService.class);
 
	public AbstractService() {
		// TODO Auto-generated constructor stub
		beforeInvoke();
	}

	protected abstract void beforeInvoke();
	
}
