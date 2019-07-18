package kr.co.fdp.airkorea.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

public class AirKoreaVO {
	
	@NotNull private int pageNo;
	@NotNull private int numOfRows;
	private String stationName;
	private String dataTerm;
	private double ver;
	private String sidoName;
	private String searchDate;
	private String informCode;
	private String itemCode;
	private String dataGubun;
	private String searchCondition;
	
	private HashMap<String, Object> container = new HashMap<String, Object>();
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		container.put("pageNo", pageNo);
		this.pageNo = pageNo;
	}
	public int getNumOfRows() {
		return numOfRows;
	}
	public void setNumOfRows(int numOfRows) {
		container.put("numOfRows", numOfRows);
		this.numOfRows = numOfRows;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		container.put("stationName", stationName);
		this.stationName = stationName;
	}
	public String getDataTerm() {
		return dataTerm;
	}
	public void setDataTerm(String dataTerm) {
		container.put("dataTerm", dataTerm);
		this.dataTerm = dataTerm;
	}
	public double getVer() {
		return ver;
	}
	public void setVer(double ver) {
		container.put("ver", ver);
		this.ver = ver;
	}
	public String getSidoName() {
		return sidoName;
	}
	public void setSidoName(String sidoName) {
		container.put("sidoName", sidoName);
		this.sidoName = sidoName;
	}
	public String getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(String searchDate) {
		container.put("searchDate", searchDate);
		this.searchDate = searchDate;
	}
	public String getInformCode() {
		return informCode;
	}
	public void setInformCode(String informCode) {
		container.put("informCode", informCode);
		this.informCode = informCode;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		container.put("itemCode", itemCode);
		this.itemCode = itemCode;
	}
	public String getDataGubun() {
		return dataGubun;
	}
	public void setDataGubun(String dataGubun) {
		container.put("dataGubun", dataGubun);
		this.dataGubun = dataGubun;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		container.put("searchCondition", searchCondition);
		this.searchCondition = searchCondition;
	}
	public HashMap<String, Object> getContainer() {
		return container;
	}
	public void setContainer(HashMap<String, Object> container) {
		this.container = container;
	}
	
}
