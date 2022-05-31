package p3;

import java.io.*;
public class ByteStream {

	public static void main(String[] args) {
FileInputStream f=new FileInputStream();
FileOutPutStream fo=new FileOutPutStream();
int x;
while(x=f.read())!=-1){
	System.out.println(x);
}
f.close();
	}

}
