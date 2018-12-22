package com.jdp.patterns.businessdelegate.model;

public class MovieTicket {

	private int id;
	private String movie;
	private String screen;
	private String seat;

	public int getId() {
		return id;
	}

	public String getMovie() {
		return movie;
	}

	public String getScreen() {
		return screen;
	}

	public String getSeat() {
		return seat;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

}
