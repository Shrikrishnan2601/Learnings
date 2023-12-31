package task3;

public class Data {
	    private Integer id;
	    private String email;
	    private String first_name;
	    private String last_name;
	    private String avatar;
	    
	    public Data(Integer id, String email, String first_name, String last_name, String avatar) {
	    	super();
			this.id = id;
			this.email = email;
			this.first_name = first_name;
			this.last_name = last_name;
			this.avatar = avatar;
		}
		public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public String getfirst_name() {
	        return first_name;
	    }
	    public void setfirst_name(String first_name) {
	        this.first_name = first_name;
	    }
	    public String getlast_name() {
	        return last_name;
	    }
	    public void setlast_name(String last_name) {
	        this.last_name = last_name;
	    }
	    public String getAvatar() {
	        return avatar;
	    }
	    public void setAvatar(String avatar) {
	        this.avatar = avatar;
	    }
	}

