package Day6;



public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show ob=new show();
		System.out.println(ob.getName());
		System.out.println(ob.getId());
		System.out.println(ob.setMark(10));
		System.out.println(ob.getMark());
		System.out.println(ob.setMark(-1));
		System.out.println(ob.getMark());

	}

}
class stu{
	private final String name="iswarya k";
	private final int id=14;
	public int getMark() {
		return mark;
	}
	public String setMark(int mark) {
		if(mark>=0 && mark<=100){
			this.mark = mark;
			return "Mark updated successfully";
		}
			return "enter the mark between 0 and 100";
		
		
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	private int mark;
}

class show extends stu{
	
}
