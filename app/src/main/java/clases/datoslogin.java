package clases;

/**
 * Created by User on 7/6/2016.
 */
public class datoslogin {
    private String email;
    private String password;
    private int numerocel;



    public datoslogin(String email, String password, int numerocel){

        this.email=email;
        this.password=password;
        this.numerocel=numerocel;


    }



    public void setEmail(String email) {
        this.email = email ;
    }


    public void setPassword(String password) {
        this.password = password ;
    }

    public void setNumerocel(int numerocel) {
        this.numerocel = numerocel ;
    }







    public String getemail(){


        return email;
    }


    public String getPassword(){


        return password;
    }


    public int getnumerocel(){


        return numerocel;
    }





}
