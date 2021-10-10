import java.net.*;
import java.io.*;
public class MyServer
{
	public static void main(String arg[]) throws IOException
      {
      	ServerSocket ss = new ServerSocket(4999);
      	Socket s = ss.accept();

      	System.out.println("Client connected ");

      	InputStreamReader in = new InputStreamReader(s.getInputStream());

      	BufferedReader bf = new BufferedReader(in);

      	String str = bf.readLine();
      	System.out.println("Client : "+ str);


      	PrintWriter pr = new PrintWriter(s.getOutputStream());

      	pr.println("Wait it will take some time......");
      	pr.println("Processing");
      	pr.flush();
      }
}		