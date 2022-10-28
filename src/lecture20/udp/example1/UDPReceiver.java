package lecture20.udp.example1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket dgs = new DatagramSocket(9999);
        
        byte[] data = new byte[120];
        DatagramPacket pkt = new DatagramPacket(data, data.length);

        dgs.receive(pkt);

        data = pkt.getData();

        System.out.println(pkt.getLength());

        for (int i = 0; i < pkt.getLength(); ++i) {
            System.out.printf("%c", data[i]);
        }
        System.out.println();

    }
}
