/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTCN_06;

/**
 *
 * @author Windows
 */
public class Main {
    public static String typeTriangle(float a, float b, float c) {
        String msg = "";
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
            msg = "Tam gi�c ??u";
            }
            else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a+b*b) {
                msg = "Tam gi�c vu�ng";
            }
            else if (a == b || b == c || c == a) {
                msg = "Tam gi�c c�n";
            }
            else {
                msg = "Tam gi�c th??ng";
            }
        }
        else {
            msg = "Kh�ng ph?i tam gi�c";
        }
        return msg;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String result = typeTriangle(1,2,3);
        System.out.print(result);
    }
    
}
