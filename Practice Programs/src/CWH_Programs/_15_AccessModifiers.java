package CWH_Programs;

import java.util.Scanner;

public class _15_AccessModifiers {
    // By Making the data member private we applying the feature of data hiding.
    private int id;
    private String name;

    public _15_AccessModifiers() {
    }
    //  If default constructor is private then we cannot inherit this class becoz private members
    //  is only visible by class members only as well as cannot be inherited
    
    private _15_AccessModifiers(String str){
        name = str;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) /*throws IOException, InterruptedException*/ {
        //  Private members can be accessed using object of the class becoz in java main 
        //  method is in same class
         Scanner sc = new Scanner(System.in);

        _15_AccessModifiers o1 = new _15_AccessModifiers("abhay");
        System.out.println("name : " + o1.name);

        // System.out.println(o1.getId());
        // System.out.println(o1.getName());



        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }
        // System.out.println("To clear cmd, Press enter to continue");
        // sc.nextLine();
        
        //  Used to clear the cmd screen
        // try{
        //     new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        // }
        // catch (Exception e) {
        //     System.out.println(e);
        // }
        
    }
}
