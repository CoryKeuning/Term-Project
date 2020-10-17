
/**
 * A tavunu is an imaginary Earth-dwelling being.
 *
 * A tavunu looks a bit like a Patagonian Mara and lives in a non-gendered but
 * hierarchical society. Most interactions among tavuni are negotiated with
 * pava -- items of status used for bargaining.
 *
 * @author Mithat Konar
 * @author Cory Keuning
 */
public class Tavunu {
    private String tavunuName;
    private int birthYear;
    private int pavaAmount;
    
    // Constructor
    public Tavunu(){
        String tavunuName;
        int birthYear;
        int pavaAmount;
    }
    //Constructor
    public Tavunu(String tavunuName, int birthYear, int pavaAmount){
        this.tavunuName = tavunuName;
        this.birthYear = birthYear;
        this.pavaAmount = pavaAmount;
    }
    
    public boolean setName(String newName){
        if(newName.charAt(0) == 'T'){
            tavunuName = newName;
            return true;
        }else if(newName.charAt(0) == 'D'){
            tavunuName = newName;
            return true;
        }else
            return false;
    }
    
    public void setBirthYear(int year){
        birthYear = year;
    }
    
    public boolean spendPava(int amount){
        int spentPavaAmount = pavaAmount - amount;
        if(spentPavaAmount <= 0){
            return false;
        }else{
            pavaAmount = spentPavaAmount;
            return true;
        }
    }
    
    public boolean receivePava(int amount){
        int incPavaAmount = pavaAmount - amount;
        if(incPavaAmount <= 0){
            return false;
        }else{
            pavaAmount = incPavaAmount;
            return true;
        }
    }
    
    public String getName(){
        return tavunuName;
    }
    
    public int getBirthYear(){
        return birthYear;
    }
    
    public int getPava(){
        return pavaAmount;
    }
    
    public String toString(){
        return "Tavunu name: " + tavunuName + "\n" + "Year of birth: "
                + birthYear + "\n" + "Amount of pava: " + pavaAmount;
    }
}
