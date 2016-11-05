
public class Singleton {

		private static Singleton St = new Singleton();

		private Singleton(){}
		
		public static Singleton getinstance(){
			return St;
		}
		protected static void method(){
				System.out.println("Singleton object" + " - " /*" Hash-Code"*/ + St.hashCode());
 				//System.out.println(St.hashCode());
	
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton new1=Singleton.getinstance();
		Singleton new2=Singleton.getinstance();
		method();
		method();
	}

}
