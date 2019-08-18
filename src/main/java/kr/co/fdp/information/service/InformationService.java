package kr.co.fdp.information.service;

import org.jdom2.output.XMLOutputter;
import org.json.XML;
import org.springframework.stereotype.Service;

import kr.co.fdp.Dispatcher;
import kr.co.fdp.abstracts.AbstractService;

@Service
public class InformationService extends AbstractService {

	@Override
	protected void beforeInvoke() {
		
	}

	public String getProjectInformation() {
		String xmlToString = new XMLOutputter().outputString(Dispatcher.getMicroServiceInform().getRootElement());
		
		return XML.toJSONObject(xmlToString).toString();
	}
}
