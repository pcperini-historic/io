//
//  io.java
//  io for Java
//
//  Created by Patrick Perini on 9/29/11.
//  Licensing information available in README.md
//

import java.io.*;
import java.util.*;
import java.net.*;

public class io
{
	public static void error(int status, Object... objects)
	{
		for(Object obj : objects)
		{
			System.err.println(obj);
		}
		System.exit(status);
	}
	
	public static void error(Object... objects)
	{
		for(Object obj : objects)
		{
			System.err.println(obj);
		}
	}
	
	public static void print(Object... objects)
	{
		for(Object obj : objects)
		{
			System.out.println(obj);
		}
	}
	
	public static void printf(String format, Object... objects)
	{
		System.out.printf(format, objects);
	}
	
	public static String read() throws IOException
	{
		BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
		return inReader.readLine();
	}
	
	public static ArrayList<String> read(int lines) throws IOException
	{
		BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> buffer = new ArrayList<String>();
		for(int i = 0; i < lines; i++)
		{
			buffer.add(inReader.readLine());
		}
		return buffer;
	}
	
	public static String read(String filename) throws FileNotFoundException
	{
		Scanner inReader = new Scanner(new FileInputStream(filename));
		String buffer = "";
		while(inReader.hasNextLine())
		{
			buffer += inReader.nextLine()+"\n";
		}
		return buffer;
	}
	
	public static String read(String filename, int length) throws FileNotFoundException, IOException
	{
		RandomAccessFile file = new RandomAccessFile(new File(filename), "r");
		String outString = "";
		for(int i =0; i < length && i < file.length(); i++)
		{
			outString += file.readChar();
		}
		file.close();
		return outString;
	}
	
	public static ArrayList<String> read(int lines, Socket socket) throws IOException
	{
		BufferedReader inRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		ArrayList<String> buffer = new ArrayList<String>();
		for(int i = 0; i < lines; i++)
		{
			buffer.add(inRead.readLine());
		}
		return buffer;
	}
	
	public static String read(Socket socket) throws IOException
	{
		BufferedReader inRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		return inRead.readLine();
	}
	
	public static void write(String filename, Object... objects) throws IOException
	{
		BufferedWriter outWrite = new BufferedWriter(new FileWriter(filename));
		boolean first = true;
		for(Object obj : objects)
		{
			if(first)
			{
				outWrite.write(obj+"");
				first = false;
			}
			else
			{
				outWrite.write("\n"+obj);
			}
		}
		outWrite.close();
	}
	
	public static void write(String filename, int offset, Object... objects) throws IOException
	{
		RandomAccessFile file = new RandomAccessFile(new File(filename), "rw");
		String outString = "";
		for(int i = 0; i < offset; i++)
		{
			file.readByte();
		}
		boolean first = true;
		for(Object obj : objects)
		{
			if(first)
			{
				outString += obj;
				first = false;
			}
			else
			{
				outString += "\n"+obj;
			}
		}
		file.write(outString.getBytes());
		file.close();
	}
	
	
	public static void write(Socket socket, Object... objects) throws IOException
	{
		PrintWriter outWrite = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
		for(Object obj : objects)
		{
			outWrite.println(obj);
		}
	}
	
	public static ArrayList<String> file(String filename) throws FileNotFoundException
	{
		Scanner inReader = new Scanner(new FileInputStream(filename));
		ArrayList<String> buffer = new ArrayList<String>();
		while(inReader.hasNextLine())
		{
			buffer.add(inReader.nextLine());
		}
		return buffer;
	}
		
	public static void save(ArrayList<?> data, String filename) throws IOException
	{
		File file = new File(filename);
		if(file.exists())
			file.delete();
		file.createNewFile();
		BufferedWriter outWrite = new BufferedWriter(new FileWriter(filename));
		for(Object obj : data)
		{
			outWrite.write(obj+"\n");
		}
		outWrite.close();
	}
	
	public static void newfile(String filename) throws IOException
	{
		File file = new File(filename);
		if(file.exists())
			file.delete();
		file.createNewFile();
	}
	
	public static ServerSocket newsocket() throws UnknownHostException, IOException
	{
		return new ServerSocket(80);
	}
	
	public static ServerSocket newsocket(int port) throws UnknownHostException, IOException
	{
		return new ServerSocket(port);
	}
	
	public static Socket newsocket(String addr) throws UnknownHostException, IOException
	{
		return new Socket(InetAddress.getByName(addr), 80);
	}
	
	public static Socket newsocket(String addr, int port) throws UnknownHostException, IOException
	{
		return new Socket(InetAddress.getByName(addr), port);
	}
}