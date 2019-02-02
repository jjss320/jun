package com.jun.code;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException  {	
		Style proc2 = new Style();
	
		
		HttpURLConnection con = proc2.process1();
		HashMap<String, String> params = proc2.process2("20181116");
		proc2.process3(con, params);
		proc2.process4(con);
		proc2.process5(con);
	}
}
