package kr.co.fdp.airkorea.service;

import kr.co.fdp.airkorea.model.AirKoreaVO;

/*
 *  대기오염 정보 조회 서비스
 * 
 *  @author by chaehun
 */
public interface AirPollutionInfoSvc {
	//	측정소별 실시간 측정정보 조회
	public static final String getMsrstnAcctoRltmMesureDnsty = "getMsrstnAcctoRltmMesureDnsty";
	
	//	통합대기환경지수 나쁨 이상 측정소 목록조회
	public static final String getUnityAirEnvrnIdexSnstiveAboveMsrstnList = "getUnityAirEnvrnIdexSnstiveAboveMsrstnList";

	//	시도별 실시간 측정정보 조회 오퍼레이션
	public static final String getCtprvnRltmMesureDnsty = "getCtprvnRltmMesureDnsty";
	
	//	대기질 예보통보 조회 오퍼레이션
	public static final String getMinuDustFrcstDspth = "getMinuDustFrcstDspth";
	
	//	시도별 실시간 평균정보 조회 오퍼레이션
	public static final String getCtprvnMesureLIst = "getCtprvnMesureLIst";
	
	//	시군구별 실시간 평균정보 조회 오퍼레이션 명세
	public static final String getCtprvnMesureSidoLIst = "getCtprvnMesureSidoLIst";
	
	public String getMsrstnAcctoRltmMesureDnsty(AirKoreaVO query);
	public String getUnityAirEnvrnIdexSnstiveAboveMsrstnList(AirKoreaVO query);
	public String getCtprvnRltmMesureDnsty(AirKoreaVO query);
	public String getMinuDustFrcstDspth(AirKoreaVO query);
	public String getCtprvnMesureLIst(AirKoreaVO query);
	public String getCtprvnMesureSidoLIst(AirKoreaVO query);
}
