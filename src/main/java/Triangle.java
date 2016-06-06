public class Triangle {
	private String type;
	private int height;
	
	public String getType() {
		return type;
	}
	
	/*public void setType(String type) {
		this.type = type;
	}*/
	
	public int getHeight() {
		return height;
	}

	public Triangle(String type_var) {
		type = type_var;
	}
	public Triangle(String type_var, int height_var) {
		type = type_var;
		height = height_var;
	}
	public void draw(){
		System.out.println(getType()+" Triangle drawn of " + getHeight());
	}
}
