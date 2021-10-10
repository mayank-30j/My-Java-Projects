import java.net.*;
import java.io.*;
public class MyClient
{
	public static void main(String arg[]) throws IOException
      {
      	Socket s = new Socket("localhost",4999);

      	PrintWriter pr = new PrintWriter(s.getOutputStream());

      	pr.println("Give me confidential information please. ");
      	pr.flush();

      	InputStreamReader in = new InputStreamReader(s.getInputStream());

      	BufferedReader bf = new BufferedReader(in);

      	String str = bf.readLine();
      	System.out.println("Server : "+ str);
      	System.out.println("Server : "+ str);
      }
}			