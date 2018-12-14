package morganstanley.mcqs;


class ColorPack{
	
	int shadeCount = 12;
	static int getShadeCount(){
		//return shadeCount; -> give compiler error
		return 0;
	}
	
	static void setShadeCount(int value){
		//shadeCount = value; -> give compiler error
	}
	
}
public class Artist {

	public static void main(String[] args) {
		ColorPack.setShadeCount(10);
		ColorPack pack1 = new ColorPack();
		System.out.println(pack1.getShadeCount());
	}
}

/*
The above program will give compilation error, because the non-static variable shadeCount
is used in static methods.
Static methods can only access static variables, whereas non-static can have access to both 
static and non-static variables 
*/