package com.demo.response;

import java.util.List;

import com.demo.dto.TrainerDTO;

public class ResponseObject {
	private String successMessage;
	private String failureMessage;
	private List<TrainerDTO> TrainerList;

	// Getters Setters
	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	public List<TrainerDTO> getTrainerList() {
		return TrainerList;
	}

	public void setTrainerList(List<TrainerDTO> TrainerList) {
		this.TrainerList = TrainerList;
	}
}
