package muhtar_task;

public class Browser {

    public static void main(String[] args) {

        String browser = "edge";

        if (browser == "chrome" || browser == "firefox" || browser == "opera" || browser== "safari" || browser == "edge"){

            if (browser == "chrome"){
                browser = "Chrome Browser is selected";
            }else  if (browser == "firefox"){
                browser = "Firefox Browser is selected";
            }else if (browser == "opera"){
                browser = "Opera Browser is selected";
            }else if (browser == "safari"){
                browser = "Safari Browser is selected";
            }else{
                browser = "Edge Browser is selected";
            }

        }else{
            browser = "Invalid Browser Name";
        }

        System.out.println(browser);

                /* Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested i */
    }
}
