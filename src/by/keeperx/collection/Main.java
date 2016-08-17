package by.keeperx.collection;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;



/**
 * Created by Admin on 16.08.2016.
 */
public class Main {

 private static ArrayList<Profile> profiles = new ArrayList<>();
    static String file = "c://SerFile";

    public static void main(String[] args) {
        //deserData();
        System.out.println(profiles.size());
        Profile profile = new Profile();
        profile.setName(JOptionPane.showInputDialog(null,"Введите имя" ));
        profile.setSurname(JOptionPane.showInputDialog(null,"Введите фамилию"));
        profiles.add(profile);
        for (Profile p:profiles){
            System.out.println(p.getSurname()+" "+p.getName());
        }
        System.out.println(profiles.size());

        //serData();
    }
   public  static  void deserData()  {
       File f = new File (file+".ser");
       if (f.exists()){
           System.out.println("Он существует");
           try {
               FileInputStream fIS = new FileInputStream(f);
               ObjectInputStream oIS= new ObjectInputStream(fIS);
               profiles=(ArrayList<Profile>) oIS.readObject();
               fIS.close();
               oIS.close();
           }catch (Exception e){
                   e.printStackTrace();
               }
           }


       }


   public static void serData(){
       try {
           FileOutputStream fOS = new FileOutputStream(file+".ser");
           ObjectOutputStream oOS= new ObjectOutputStream(fOS);
          oOS.writeObject(profiles);
           fOS.close();
           oOS.close();
       }catch(Exception e){System.out.println(e.toString());System.exit(1);}

   }
}
