package network;

import java.net.InetAddress;

public class InetAddressEx2 {

	public static void main(String[] args) {
		// InetAddress 클래스 : IP 주소를 다루기 위한 클래스
		InetAddress ip = null;

		try {
			// getByName(호스트명) : IP 주소를 얻게 됨
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());

		} catch (Exception e) {

		}
	}

}
