package com.mapr.samples.racingseries.dto;

import java.util.ArrayList;
import java.util.List;

public class TelemetryTimestampsResponse {
	private List<TelemetryTimestamp> timestamps = new ArrayList<>();

	public List<TelemetryTimestamp> getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(List<TelemetryTimestamp> timestamps) {
		this.timestamps = timestamps;
	}
}
