package kr.co.fdp.airkorea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fdp.airkorea.model.AirKoreaVO;
import kr.co.fdp.airkorea.service.AirPollutionInfoSvc;

@RestController
@RequestMapping(value="/airkorea")
public class AirKoreaController {
	
	@Autowired
	private AirPollutionInfoSvc airPolInfoService;
	
	@RequestMapping(value="/airPollutionInfo/{operation}")
	public String get(
			@ModelAttribute AirKoreaVO query,
			@PathVariable(name="operation") String operation) {

		switch (operation) {
			case "getMsrstnAcctoRltmMesureDnsty":
				return airPolInfoService.getMsrstnAcctoRltmMesureDnsty(query);
			case "getUnityAirEnvrnIdexSnstiveAboveMsrstnList":
				return airPolInfoService.getUnityAirEnvrnIdexSnstiveAboveMsrstnList(query);
			case "getCtprvnRltmMesureDnsty":
				return airPolInfoService.getCtprvnRltmMesureDnsty(query);
			case "getMinuDustFrcstDspth":
				return airPolInfoService.getMinuDustFrcstDspth(query);
			case "getCtprvnMesureLIst":
				return airPolInfoService.getCtprvnMesureLIst(query);
			case "getCtprvnMesureSidoLIst":
				return airPolInfoService.getCtprvnMesureSidoLIst(query);
			default:
				return "알 수 없는 오류가 발생했습니다.";
		}
	}
}
