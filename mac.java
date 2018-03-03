package test;
import java.net.*;

public class mac{

static byte[] macAddress() {
    byte[] mac=null;
  try {
    InetAddress ip = InetAddress.getLocalHost();
  
      NetworkInterface network = NetworkInterface.getByInetAddress(ip);
       mac = network.getHardwareAddress();
        return mac;
      /*  //this formats the mac address and prints a hexadecimal no.
      if(mac != null) {
        System.out.print("Current MAC address : ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
          sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        }
        System.out.println(sb.toString());
      }
      */
  } catch (UnknownHostException e) {
    e.printStackTrace();
  } catch (SocketException e){
    e.printStackTrace();
  }
   //return mac;
   /*
   public static void main(String abt [])
    {
       byte []mac= new mac().macAddress();
    }*/
  return null;
      
}

}

