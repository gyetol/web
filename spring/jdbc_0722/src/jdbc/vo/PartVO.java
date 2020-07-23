package jdbc.vo;

public class PartVO {
	private int partId;
	private String partName;
	
	public PartVO() {}

	public PartVO(int partId, String partName) {
		this.partId = partId;
		this.partName = partName;
	}

	public int getPartId() {
		return partId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	@Override
	public String toString() {
		return String.format("�з���ȣ: %d, �з���: %s",partId,partName);
	}
	
	
	
}
