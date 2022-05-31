package p3;

public class FileIO {
	//streams:1.character stream2.byte stream

	public static void main(String[] args) {
              String str="keerthi";
              //to convert string to char[]
              char ch[]=str.toCharArray();
              //to convert string to byte[]
              byte[]b=str.getBytes();
              
              for(char c:ch) {
            	  System.out.println(c);
              }
              for(byte d:b) {
            	  System.out.println(d);
              }
	}

}
