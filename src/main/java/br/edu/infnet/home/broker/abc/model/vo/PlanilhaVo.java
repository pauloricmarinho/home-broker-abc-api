package br.edu.infnet.home.broker.abc.model.vo;

public class PlanilhaVo {

	private String date;
	private String open;
	private String high;
	private String low;
	private String close;
	
	public PlanilhaVo(String[] str) {
		this.date = str[0];
		this.open = str[1];
		this.high = str[2];
		this.low = str[3];
		this.close = str[4];
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}
}
