package kr.co.fdp.airkorea.service;

import org.springframework.stereotype.Service;

import kr.co.fdp.abstracts.AbstractAirKoreaService;
import kr.co.fdp.airkorea.constance.AirKoreaServiceConst;
import kr.co.fdp.airkorea.model.AirKoreaVO;

@Service
public class AirPollutionInfoSvcImpl extends AbstractAirKoreaService implements AirPollutionInfoSvc {

	@Override
	public String getMsrstnAcctoRltmMesureDnsty(AirKoreaVO query) {
		// TODO Auto-generated method stub
		
		return simpleFetch(query, AirPollutionInfoSvc.getMsrstnAcctoRltmMesureDnsty);
	}

	@Override
	public String getUnityAirEnvrnIdexSnstiveAboveMsrstnList(AirKoreaVO query) {
		// TODO Auto-generated method stub.
		
		return simpleFetch(query, AirPollutionInfoSvc.getUnityAirEnvrnIdexSnstiveAboveMsrstnList);
	}

	@Override
	public String getCtprvnRltmMesureDnsty(AirKoreaVO query) {
		// TODO Auto-generated method stub
		
		return simpleFetch(query, AirPollutionInfoSvc.getCtprvnRltmMesureDnsty);
	}

	@Override
	public String getMinuDustFrcstDspth(AirKoreaVO query) {
		// TODO Auto-generated method stub
		
		return simpleFetch(query, AirPollutionInfoSvc.getMinuDustFrcstDspth);
	}

	@Override
	public String getCtprvnMesureLIst(AirKoreaVO query) {
		// TODO Auto-generated method stub
		
		return simpleFetch(query, AirPollutionInfoSvc.getCtprvnMesureLIst);
	}

	@Override
	public String getCtprvnMesureSidoLIst(AirKoreaVO query) {
		// TODO Auto-generated method stub
		
		return simpleFetch(query, AirPollutionInfoSvc.getCtprvnMesureSidoLIst);
	}
	
	@Override
	protected void beforeInvoke() {
		// TODO Auto-generated method stub
		
		this.setServiceName(AirKoreaServiceConst.AIR_POLLUTION_INFO_SVC);
	}
	
}
