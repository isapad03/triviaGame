public class Game {

    private Client network;
    private Question[] qestionBank;

    public Game (){


    }


public void connectServer(String ip){

        network = new Client(ip);



}

}
