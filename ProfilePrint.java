/*public class ProfilePrint{
	byte age;
	String name;
	boolean isMarried;


	public static void main(String args[]);{
		byte age=19;
		String name=LeeJungWoo;
		boolean isMarried=true;
		ProfilePrint types=new ProfilePrint();

		types.setAge(age);
		types.setName(name);
		types.setMarried(flag);

		System.out.println.(type.setAge());
		System.out.println.(type.setName());
		System.out.println.(type.setMarried());
	}
	public void setAge(byte 19){
		age=19;
		//return getAge;
	}
	public byte age(){
		return age;
	}
	public void setName(String LeeJungWoo){
		name=LeeJungWoo;
		//return getName;
	}
	public String name() {
		return LeeJungWoo
	}
	public void setMarried(boolean IsMarried){
		isMarried=IsMarried;
		//return isMarried;
	}
	public boolean isMarried() {
		return isMarried;
	}
	/*public void name(){
		byte age=19;
		byte String="LEEJUNGWOO";
		}

}*/
public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;

	public static void main(String[] args) {
		ProfilePrint profile=new ProfilePrint();
		byte age=20;
		String name="Min";
		boolean isMarried=true;

		profile.setAge(age);
		profile.setName(name);
		profile.setMarried(isMarried);

		System.out.println(profile.getAge());
		System.out.println(profile.getName());
		System.out.println(profile.isMarried());
	}
	public void setAge(byte paramAge) {
		age=paramAge;
	}
	public byte getAge() {
		return age;
	}
	public void setName(String paramName) {
		name=paramName;
	}
	public String getName() {
		return name;
	}
	public void setMarried(boolean paramIsMarried) {
		isMarried=paramIsMarried;
	}

	public boolean isMarried() {
		return isMarried;
	}
}
