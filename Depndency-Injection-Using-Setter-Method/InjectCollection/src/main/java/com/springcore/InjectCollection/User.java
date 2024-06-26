package com.springcore.InjectCollection;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class User {
	private List<String>mbno;
	@Override
	public String toString() {
		return "User [mbno=" + mbno + ", address=" + address + ", prop=" + prop + "]";
	}
	private Set<String>address;
	
	private Properties prop;
	
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public List<String> getMbno() {
		return mbno;
	}
	public void setMbno(List<String> mbno) {
		this.mbno = mbno;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	
	
}
