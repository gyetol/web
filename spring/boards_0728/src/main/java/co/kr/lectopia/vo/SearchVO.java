package co.kr.lectopia.vo;

public class SearchVO {
	private String word;
	private int page;
	private int pageSize;
	
	public SearchVO() {}

	public SearchVO(String word, int page, int pageSize) {
		super();
		this.word = word;
		this.page = page;
		this.pageSize = pageSize;
	}

	public String getWord() {
		return word;
	}

	public int getPage() {
		return page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
