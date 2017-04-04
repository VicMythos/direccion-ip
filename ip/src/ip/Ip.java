package ip;

import java.util.Scanner;

public class Ip {

    public static void main(String[] args) {
        boolean esIpValida = true;
        System.out.println("Inserta la direccion ip v4");
        Scanner s = new Scanner(System.in);
        String ip = s.nextLine();
        String[] octetos = ip.split("\\.");
        String tipoIp = "";
        
        if(octetos.length == 4){
            int oct1, oct2,oct3,oct4;
            try{
                oct1 = Integer.parseInt(octetos[0]);
                oct2 = Integer.parseInt(octetos[1]);
                oct3 = Integer.parseInt(octetos[2]);
                oct4 = Integer.parseInt(octetos[3]);
                
                if(!(0 <= oct1 && oct1 <= 255))
                    esIpValida = false;
                if(!(0 <= oct2 && oct2 <= 255))
                    esIpValida = false;
                if(!(0 <= oct3 && oct3 <= 255))
                    esIpValida = false;
                if(!(0 <= oct4 && oct4 <= 255))
                    esIpValida = false;
                
                if(esIpValida){
                    if(1 <= oct1 && oct1 <= 127)
                        tipoIp = "IP Clase A";
                    else if(128 <= oct1 && oct1 <= 191)
                        tipoIp = "IP Clase B";
                    else if(192 <= oct1 && oct1 <= 223)
                        tipoIp = "IP Clase C";
                }
            } catch (Exception e){
                esIpValida = false;
            }
        } else {
            esIpValida = false;
        }
        
        if(esIpValida){
            System.out.println("La ip escrita es valida");
            System.out.println(tipoIp);
        } else {
            System.out.println("********************* La ip no es valida");
        }
        
    }
    
}
