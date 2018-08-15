package demo.test.kafka;

public class KafkaSampleData {
	private String sampleId;
	private String currentTime;
	private String sampleData;

	public KafkaSampleData() {

	}

	public KafkaSampleData(String sampleId, String currentTime, String sampleData) {
		this.sampleId = sampleId;
		this.currentTime = currentTime;
		this.sampleData = sampleData;
	}

	public String getSampleId() {
		return sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public String getSampleData() {
		return sampleData;
	}

	public void setSampleData(String sampleData) {
		this.sampleData = sampleData;
	}

	@Override
	public String toString() {
		return "KafkaSampleData [sampleId=" + sampleId + ", currentTime=" + currentTime + ", sampleData=" + sampleData
				+ "]";
	}

}
