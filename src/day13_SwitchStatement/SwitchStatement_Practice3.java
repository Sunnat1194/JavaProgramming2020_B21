package day13_SwitchStatement;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {

        String browser = "chrome";
        String selectBrowser = "";
        switch ( browser){
            case "chrome"  : selectBrowser = "CHROME BROWSER";
            break;

            case "firefox" : selectBrowser = "FIREFOX BROWSER";
            break;

            case "opera" : selectBrowser = "OPERA BROWSER";
            break;

            case "safari" : selectBrowser = " SAFARI BROWSER";
            break;

            case "edge" :  selectBrowser = "EDGE BROWSER";
            break;

            case "ed" : selectBrowser = "INTERNET EXPLORE BROWSER";

            default: selectBrowser = "Invalid browser";

        }
        System.out.println(selectBrowser);
    }
}
