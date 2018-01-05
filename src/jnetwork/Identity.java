/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Suleyman
 */
public class Identity {
    
    public String getIPandFQDN(String domain_name)throws UnknownHostException {
        InetAddress address = null;
        address = InetAddress.getByName(domain_name);
        
        System.out.println(address.getHostName() + "=" + address.getHostAddress());// host name and host address
        System.out.println(address.getCanonicalHostName());//FQDN - fully qualified domain name
        return address.getHostAddress();
    }    
    public static void byteArrayOfIP(String add) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(add);
        byte[] array = ip.getAddress();
        for (byte b : array) {
            System.out.println(b & 0xFF);
        }
    }
}
