public class StringDemo {
	public static void main(String[] args) {
		String msg="Hello";
		System.out.println(" HashCode for :: " + msg + " :: " +msg.hashCode());
		msg=msg.concat(" All");
		System.out.println(" HashCode for :: " + msg + " :: " +msg.hashCode());
		
		System.out.println("=======String Buffer=======");
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(" HashCode for :: " + sb + " :: " + sb.hashCode());
		sb.append(" All");
		System.out.println(" HashCode for :: " + sb + " :: " + sb.hashCode());
		
		System.out.println("=======String Builder=======");
		StringBuilder sbl=new StringBuilder("Hello");
		System.out.println(" HashCode for :: " + sbl + " :: " + sbl.hashCode());
		sbl.append(" All");
		System.out.println(" HashCode for :: " + sbl + " :: " + sbl.hashCode());
	}

}