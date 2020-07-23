package keyholder.vo;

public class ProductVO {
	private int productId;
	private String productName;
	private int productPrice;
	private int partId;
	private PartVO part;
	
	public ProductVO() {
		this(0,null,0,0);
	}
	

	public ProductVO(int productId, String productName, int productPrice, int partId) {
		this(productId,productName,productPrice,partId,null);
	}


	public ProductVO(int productId, String productName, int productPrice, int partId, PartVO part) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.partId = partId;
		this.part = part;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public int getPartId() {
		return partId;
	}

	public PartVO getPart() {
		return part;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public void setPart(PartVO part) {
		this.part = part;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %d %d", productId,productName,productPrice,partId);
	}
	

}
