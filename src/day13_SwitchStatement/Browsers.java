package day13_SwitchStatement;

public class Browsers {
    public static void main(String[] args) {
       String browserName = "chrome";

       boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
        || browserName == "safari" || browserName == "edge" || browserName == "ie";
        String selectBrowser = "";
       if (valid){
           if (browserName == "chrome"){
              selectBrowser  ="CHROME BROWSER IS SELECTED";
           }else if (browserName=="firfox"){
             selectBrowser =  "FIREFOX BROWSER IS SELECTED";
           }else if (browserName == "oera"){
               selectBrowser = "OPERA BROWSER IS SELECTED";
           }else if (browserName == " safari"){
               selectBrowser = "SAFARI IS BROWSER IS SELECTED";
           }else if ( browserName == "edge"){
               selectBrowser = "EDGE IS BROWSER IS SELECTED ";
           }else{

           }
                    System.out.println(selectBrowser);


       }




    }
}
