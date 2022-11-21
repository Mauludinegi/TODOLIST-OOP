/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.util.Scanner;
/**
 *
 * @author GIE
 */
public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);
    
    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
}
