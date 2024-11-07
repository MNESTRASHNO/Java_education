package src.myLittleUbojestvo.insideCollections;

public class Main {
    public static void main(String[] args) {


        String[] emp = getEmployees();
        String[] newArray = new String[getEmployees().length + 1];
        for(int i = 0; i < getEmployees().length; i++){
            newArray[i] = emp[i];
        }
        newArray[newArray.length - 1] = "6";

        


    }
    private static String[] getEmployees(){
        String[] emp = new String[5];
        emp[0] = "1";
        emp[1] = "2";
        emp[2] = "3";
        emp[3] = "4";
        emp[4] = "5";
        return emp;
    }
}
