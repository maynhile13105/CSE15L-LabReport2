import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    int num = 0;
    String result="";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")){
                return result;
        }
        else if (url.getPath().contains("/add-messages")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")){
                    num++;
                    result += "\n" + num +". " + parameters[1]; 
                    return result;
                }  
        }
        return "404 Not Found!";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
