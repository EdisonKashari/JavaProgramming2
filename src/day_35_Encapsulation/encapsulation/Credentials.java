package day_35_Encapsulation.encapsulation;

public class Credentials {

    private String userName,password;
    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

/*if (!isStrongPassword())
    return;*/
        if (password.length() < 8 || password.contains(" ")) {
System.exit(0);
            return;
        }
        this.password = password;

    }

    public boolean isStrongPassword(){

        boolean isLetter=false;
        boolean isDigit=false;
        boolean isSpecialCharacter=false;
      //  boolean isValid = !(password.length() < 8 && password.contains(" "));

        for (int i = 0;i<password.length();i++){
            if (Character.isLetter(password.charAt(i))){
                isLetter=true;

            }
            if (Character.isDigit(password.charAt(i))){
                isDigit=true;

            }
            if (!(Character.isDigit(password.charAt(i))&&Character.isLetter(password.charAt(i)))){
                isSpecialCharacter=true;

            }
        }
if (isDigit&&isLetter&&isSpecialCharacter){
    return true;
}

return false;



    }


    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ",isStrongPassword=" + isStrongPassword()+
                '}';
    }
}









/* create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)*/