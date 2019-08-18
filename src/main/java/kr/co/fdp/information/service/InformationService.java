package kr.co.fdp.information.service;

import org.jdom2.output.XMLOutputter;
import org.json.XML;
import org.springframework.stereotype.Service;

import kr.co.fdp.Dispatcher;
import kr.co.fdp.abstracts.AbstractAirKoreaService;

@Service
public class InformationService extends AbstractAirKoreaService {

	@Override
	protected void beforeInvoke() {
		
	}

	public String getProjectInformation() {
		String xmlToString = new XMLOutputter().outputString(Dispatcher.getMicroServiceInform().getRootElement());
		
		return XML.toJSONObject(xmlToString).toString();
	}
}
