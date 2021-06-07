package com.zup.vehiclerotation.api.exception;

import java.time.LocalDateTime;
import java.util.List;

public class ExceptionError {

	private Integer status;
	private LocalDateTime dataTime;
	private String message;
	private List<Field> fields;

	public static class Field {
		
		private String field;

		private String problem;

		public Field(String field, String problem) {
			super();
			this.field = field;
			this.problem = problem;
		}

		public String getField() {
			return field;
		}

		public String getProblem() {
			return problem;
		}
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime getDataTime() {
		return dataTime;
	}

	public void setDataTime(LocalDateTime dataTime) {
		this.dataTime = dataTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

}
