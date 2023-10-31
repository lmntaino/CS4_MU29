/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enzot224
 */
public class BasicDataTypes {
    public static void main(String[] args){
        String s1Name = "Zild Benitez";
        String s1Role = "Bassist";
        int s1age = 26;
        
        String s2Name = "Blaster Silonga";
        String s2Role = "Lead Guitarist";
        int s2age = 23;
        
        String s3Name = "Badjao De Castro";
        String s3Role = "Drummer";
        int s3age = 29;
        
        int age = (s1age + s2age + s3age)/3;
        boolean samerole = s1Role == s2Role;
        boolean oldest = s3age > s1age;
        
        System.out.println("IV of Spades members: \n");
        
        System.out.println("Member 1");
        System.out.println("Name: " + s1Name);
        System.out.println("Role: " + s1Role);
        System.out.println("Age: " + s1age);
        
        System.out.println("\nMember 2");
        System.out.println("Name: " + s2Name);
        System.out.println("Role: " + s2Role);
        System.out.println("Age: " + s2age);
        
        System.out.println("\nMember 3");
        System.out.println("Name: " + s3Name);
        System.out.println("Role: " + s3Role);
        System.out.println("Age: " + s3age + "\n");
        
        System.out.println("The average age of the members is: " + age);
        System.out.println("Do any of the members have the same role in the band: " + samerole);
        System.out.println("Badjao De Castro is the oldest in the band: " + oldest + "\n");
    }
}
