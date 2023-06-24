package task3;

import java.util.List;


public class RootClass {
	    private int page;
	    private int per_page;
	    private int total;
	    private int total_pages;
	    private List<Data> data;
	    private Support support;
	   
	    public RootClass(int page, int per_page, int total, int total_pages, List<Data> data,Support support) {
	    	super();
			this.page = page;
			this.per_page = per_page;
			this.total = total;
			this.total_pages = total_pages;
			this.data = data;
			this.support = support;
		}
		public int getPage() {
	        return page;
	    }
	    public void setPage(int page) {
	        this.page = page;
	    }
	    public int getper_page() {
	        return per_page;
	    }
	    public void setper_page(int perPage) {
	        this.per_page = perPage;
	    }
	    public int getTotal() {
	        return total;
	    }
	    public void setTotal(int total) {
	        this.total = total;
	    }
	    public int gettotal_pages() {
	        return total_pages;
	    }
	    public void settotal_pages(int totalPages) {
	        this.total_pages = totalPages;
	    }
	    public List<Data> getData() {
	        return data;
	    }
	    public void setData(List<Data> data) {
	        this.data = data;
	    }
	    public Support getSupport() {
	        return support;
	    }
	    public void setSupport(Support support) {
	        this.support = support;
	    }
	}


