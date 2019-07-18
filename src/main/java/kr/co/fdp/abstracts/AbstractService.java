package kr.co.fdp.abstracts;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.fdp.airkorea.AirKorea;
import kr.co.fdp.airkorea.model.AirKoreaVO;

public abstract class AbstractService {
	protected static final Logger logger = LoggerFactory.getLogger(AbstractService.class);
	private String serviceName = null;

	protected abstract void beforeInvoke();
	
	public AbstractService() {
		beforeInvoke();
	}
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	protected String simpleFetch(AirKoreaVO query, String operationName) {
		String result = null;
		try {
			result = AirKorea.fetch(query, this.serviceName, operationName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
