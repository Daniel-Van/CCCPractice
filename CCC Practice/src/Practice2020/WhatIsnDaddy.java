/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 *
 * @author TheDa
 */
public class WhatIsnDaddy {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        if (n == 1) {
            System.out.println("1");
        }
        if (n == 2) {
            System.out.println("2");
        }
        if (n == 3) {
            System.out.println("2");
        }
        if (n == 4) {
            System.out.println("3");
        }
        if (n == 5) {
            System.out.println("3");
        }
        if (n == 6) {
            System.out.println("3");
        }
        if (n == 7) {
            System.out.println("2");
        }
        if (n == 8) {
            System.out.println("2");
        }
        if (n == 9) {
            System.out.println("1");
        }
        if (n == 10) {
            System.out.println("1");
        }
    }

}
