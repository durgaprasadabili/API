package API.cool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class FindW {

	public static void main(String[] args) throws IOException 
	
	{
	FindW ds = new FindW();
	String ur1 = "http://dummy.restapiexample.com/api/v1/employees";
	int a=0;
	while(a!=200)
	{
		a=ds.deleteRequestMethod();
		System.out.println(a);
	}
	

	}
	
	public int getMain(String url1) throws IOException
	{
		int code = 0;
		try
		{
		URL url = new URL(url1);
		HttpURLConnection https = (HttpURLConnection) url.openConnection();
		code=https.getResponseCode();
		String str = https.getResponseMessage();
		System.out.print(str);
		if(code==200)
		{
			InputStream inputstream = https.getInputStream();
			InputStreamReader inputreader = new InputStreamReader(inputstream);
			BufferedReader reader = new BufferedReader(inputreader);
			String line;
			while((line=reader.readLine())!=null)
			{
				System.out.println(line);
				
			}
			
		}
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("URL:" +url1+" "+code);
		}
		return code;
		
		
	}
	
	public int  Post() throws IOException
	{
		int code=0;
		try
		{
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection http =  (HttpURLConnection) url.openConnection();
		http.setRequestMethod("POST");
		http.setDoOutput(true);
		http.setRequestProperty("Content-Type", "application/json");
		String dson = "{\"name\":\"Dick1\",\"salary\":\"123\",\"age\":\"23\"}";
		byte[] ds=dson.getBytes();
		OutputStream dvd = http.getOutputStream();
		dvd.write(ds);
		System.out.println(http.getResponseCode());
		 code = http.getResponseCode();
		if(code ==200)
		{
			InputStream inputstream = http.getInputStream();
			InputStreamReader inputreader = new InputStreamReader(inputstream);
			BufferedReader reader = new BufferedReader(inputreader);
			String line;
			while((line=reader.readLine())!=null)
			{
				System.out.println(line);
				
			}
		}
		
		
		}
		finally
		{
			System.out.println();
		}
		
		
		return code;
		
	}
	
	public int putRequestExample() throws IOException
	{
		int code=0;
		try
		{
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/4603");
		HttpURLConnection http =  (HttpURLConnection) url.openConnection();
		http.setRequestMethod("PUT");
		http.setDoOutput(true);
		http.setRequestProperty("Content-Type", "application/json");
		String dson = "{\"name\":\"ABILI\",\"salary\":\"123\",\"age\":\"23\"}";
		byte[] ds=dson.getBytes();
		OutputStream dvd = http.getOutputStream();
		dvd.write(ds);
		System.out.println(http.getResponseCode());
		 code = http.getResponseCode();
		if(code ==200)
		{
			InputStream inputstream = http.getInputStream();
			InputStreamReader inputreader = new InputStreamReader(inputstream);
			BufferedReader reader = new BufferedReader(inputreader);
			String line;
			while((line=reader.readLine())!=null)
			{
				System.out.println(line);
				
			}
		}
		
		
		}
		finally
		{
			System.out.println();
		}
		
		
		return code;
		
		
		
	}
	
	public int deleteRequestMethod() throws IOException
	{
		
		int code=0;
		try
		{
			//4603
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/4603");
		HttpURLConnection http =  (HttpURLConnection) url.openConnection();
		http.setRequestMethod("DELETE");
		http.setDoOutput(true);
		System.out.println(http.getResponseCode());
		 code = http.getResponseCode();
		if(code ==200)
		{
			InputStream inputstream = http.getInputStream();
			InputStreamReader inputreader = new InputStreamReader(inputstream);
			BufferedReader reader = new BufferedReader(inputreader);
			String line;
			while((line=reader.readLine())!=null)
			{
				System.out.println(line);
				
			}
		}
		
		
		}
		finally
		{
			System.out.println();
		}
		
		
		return code;
	}

}
