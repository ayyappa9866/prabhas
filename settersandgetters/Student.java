package settersandgetters;
public class Student {
	private int idNum;
	private String name;
	private String dept;	
	public boolean setIdNum(int idNum) {
		int digits = (int)Math.log10(idNum) + 1;
		if(digits == 10) {
			this.idNum = idNum;
			return true;
		}
		return false;
	}
}
