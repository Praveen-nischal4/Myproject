// third constructor injection using autowired

package com.praveen.MyProject.annotation2;

import org.springframework.beans.factory.annotation.Autowired;

public class Cricket {

	private String name;
	private int gameid;
	private String coachname;	
	
	private IPL ipl;
	public Cricket() {
		super();
	}

	
	@Autowired
	public Cricket(String name, int gameid, String coachname,IPL ipl) {
		super();
		this.name = name;
		this.gameid = gameid;
		this.coachname = coachname;
		this.ipl=ipl;
	}

	@Override
	public String toString() {
		return "Cricket [name=" + name + ", gameid=" + gameid + ", coachname=" + coachname + ", ipl=" + ipl + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public String getCoachname() {
		return coachname;
	}

	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}



	public IPL getIpl() {
		return ipl;
	}



	public void setIpl(IPL ipl) {
		this.ipl = ipl;
	}
	
	
}
