package com.sunbeam;

public class PartyVotes {

	private String party;
	private int votes;
	
	public PartyVotes() {
		
	}
	
	public PartyVotes(String party, int votes) {
		this.party = party;
		this.votes = votes;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}

	public int getVotes() {
		return votes;
	}

	@Override
	public String toString() {
		return "PartyVotes [party=" + party + ", votes=" + votes + "]";
	}

	
	
	
	
	
	
	
	
}
