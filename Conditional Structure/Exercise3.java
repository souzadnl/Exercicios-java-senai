import java.util.Scanner;
import States.States;

public class Exercise3 {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);

        System.out.println("Enter the state you want information on");
        String choice = write.next();
        switch (choice.toUpperCase()) {
            case "AC":
                States.AC();
                break;
            case "AL":
                States.AL();
                break;
            case "AM":
                States.AM();
                break;
            case "AP":
                States.AP();
                break;
            case "BA":
                States.BA();
                break;
            case "CE":
                States.CE();
                break;
            case "DF":
                States.DF();
                break;
            case "ES":
                States.ES();
                break;
            case "GO":
                States.GO();
                break;
            case "MA":
                States.MA();
                break;
            case "MG":
                States.MG();
                break;
            case "MS":
                States.MS();
                break;
            case "MT":
                States.MT();
                break;
            case "PA":
                States.PA();
                break;
            case "PB":
                States.PB();
                break;
            case "PE":
                States.PE();
                break;
            case "PI":
                States.PI();
                break;
            case "PR":
                States.PR();
                break;
            case "RJ":
                States.RJ();
                break;
            case "RN":
                States.RN();
                break;
            case "RO":
                States.RO();
                break;
            case "RR":
                States.RR();
                break;
            case "RS":
                States.RS();
                break;
            case "SC":
                States.SC();
                break;
            case "SE":
                States.SE();
                break;
            case "SP":
                States.SP();
                break;
            case "TO":
                States.TO();
                break;
            default:
                System.out.println("State not found.");
                break;
        }


    }
}
