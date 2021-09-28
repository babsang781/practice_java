package human;

public class WomanClass {
	private int age;
	private int height;
	private int weight;
	private String phoneNum;
			
	public WomanClass() {
		
	}
	public double calculateBMI() {
    	//TODO Auto-generated method stub
    	double result = weight / (height *height);
    	return result;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public int getWeight() {
    	return weight;
    }
    
    public void setWeight(int weight) {
    	this.weight = weight;
    }
    
    public String getPhoneNum() {
    	return phoneNum;
    }
    
    public void setPhoneNum(String phoneNum){
    	this.phoneNum = phoneNum;
    }
}			
	    
