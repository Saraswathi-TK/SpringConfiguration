package com.xworkz.ott.dto;

public class OttDTO {

	private String name;
	private String region;
	private String subscriptionPlan;
	private String user;
	private int since;
	private String lang;
	private boolean active;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubscriptionPlan() {
		return subscriptionPlan;
	}

	public void setsubscriptionPlan(String subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "OttDTO [name=" + name + ", region=" + region + ", subscriptionPlan=" + subscriptionPlan + ", user="
				+ user + ", since=" + since + ", lang=" + lang + ", active=" + active + "]";
	}

	

}
