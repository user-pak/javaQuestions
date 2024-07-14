package sava.tutorial.network;

import java.util.Scanner;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	
	static void getInetInfo() {
		
		Scanner scanner = new Scanner(System.in);
		String host = scanner.nextLine();
		try {
			InetAddress address = InetAddress.getByName(host);
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInetInfo();
	}

}
