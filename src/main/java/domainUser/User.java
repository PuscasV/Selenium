package domainUser;

public class User {

    public String username;
    public String password;


    public User(String username, String password){

        this.username = username;
        this.password = password;
    }

    public User(){}

    public String getUserName(){

        return username;

    }
    public String getPassword(){

        return password;
    }

    public void  setUserName(String userName){

       this.username = userName;

    }

    public void setPassword(String password){

        this.password = password;
    }


}
