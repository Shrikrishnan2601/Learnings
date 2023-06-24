package org.task2;

import java.util.List;

public class RootClass {
	    private Integer page;
	    private Integer per_page;
	    private Integer total;
	    private Integer total_pages;
	    private List<Data> data;
	    private Support support;
	   
		public Integer getPage() {
	        return page;
	    }
	    public void setPage(Integer page) {
	        this.page = page;
	    }
	    public Integer getper_page() {
	        return per_page;
	    }
	    public void setper_page(Integer perPage) {
	        this.per_page = perPage;
	    }
	    public Integer getTotal() {
	        return total;
	    }
	    public void setTotal(Integer total) {
	        this.total = total;
	    }
	    public Integer gettotal_pages() {
	        return total_pages;
	    }
	    public void settotal_pages(Integer totalPages) {
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
