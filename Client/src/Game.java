public class Game {

    private Client network;
    private gameUI ui;

    public Game (){


    }


public void connectServer(String ip){

        network = new Client(ip);



}

}
