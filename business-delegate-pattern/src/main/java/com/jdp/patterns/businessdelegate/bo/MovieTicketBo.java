package com.jdp.patterns.businessdelegate.bo;

public class MovieTicketBo {

	private int id;
	private String movieName;
	private String screenType;
	private String seatNumber;

	public int getId() {
		return id;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getScreenType() {
		return screenType;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

}
