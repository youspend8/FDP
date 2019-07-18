package kr.co.fdp.airkorea.service;
/*
 * 	측정소정보 조회 서비스 
 * 	
 * 	@author chaehun
 */
public interface ObserInfoSvc {
	//	근접측정소 목록 조회
	public static final String getNearbyMsrstnList = "getNearbyMsrstnList";
	
	//	측정소 목록 조회
	public static final String getMsrstnList = "getMsrstnList";
	
	//	TM 기준좌표 조회
	public static final String getTMStdrCrdnt = "getTMStdrCrdnt";
}
