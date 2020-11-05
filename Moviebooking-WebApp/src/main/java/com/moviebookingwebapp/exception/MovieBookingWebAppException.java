package com.moviebookingwebapp.exception;

import org.springframework.http.HttpStatus;

public class MovieBookingWebAppException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6335764236468722888L;
	private HttpStatus httpStatus;

	public MovieBookingWebAppException() {
		super();
	}

	public MovieBookingWebAppException(MovieBookingWebAppException e, HttpStatus httpStatus) {
		super(e);
		this.httpStatus = httpStatus;
	}

	public MovieBookingWebAppException(String message, HttpStatus httpStatus) {
		super(message);
		this.httpStatus = httpStatus;
	}

	public MovieBookingWebAppException(MovieBookingWebAppException e, String message, HttpStatus httpStatus) {
		super(message, e);
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
