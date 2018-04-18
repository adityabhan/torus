package test;
import java.net.*;

public class mac{

 String macAddress() {
    
  try {
          InetAddress ip = InetAddress.getLocalHost();
          NetworkInterface network = NetworkInterface.getByInetAddress(ip);
          byte[] mac= network.getHardwareAddress();
        //return mac;
        //this formats the mac address and prints a hexadecimal no.
        if(mac != null) {
            System.out.print("Current MAC address : ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            System.out.println(sb);
            String ret=sb.toString();
            return ret;
      }
      
  } catch (UnknownHostException | SocketException e) {
      System.out.println(e.getMessage());
      return "not found";
      
  }
   //return mac;
   return "not found";
      
}

public static void main(String abt [])
    {
       String mac= new mac().macAddress();
        System.out.println(mac);
    }

}

