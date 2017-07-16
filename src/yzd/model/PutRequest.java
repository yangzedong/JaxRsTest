package yzd.model;

import org.json.JSONObject;

public class PutRequest {
	private String aa;
	private int cc;
	
	
/*	public PutRequest(String aa, int cc) {
		super();
		this.aa = aa;
		this.cc = cc;
	}*/
	public PutRequest(String str) {
		JSONObject obj = new JSONObject(str);
		aa = (String)obj.get("aa");
		cc = (Integer)obj.get("cc");
	}
	
	
	public String getAa() {
		return aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "PutRequest [aa=" + aa + ", cc=" + cc + "]";
	}
	
}
