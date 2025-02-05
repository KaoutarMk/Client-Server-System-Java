package main;

public class Driver {

	/** 
	 * main class
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
	   	
	   	 /*******************************************************************************************************************************************
	   	  * TODO : implement all the operations of main class   																					*
	   	  ******************************************************************************************************************************************/
	    
		// Initialize all the threads
		
	   	Network network = new Network("network");		/* Activate the network */
	    network.start();
	    
	    Server server = new Server();                        /* Start the server */ 
        server.start();
        
        Client clientSend = new Client("sending");              /* Start the sending client */
        clientSend.start();
        
        Client clientReceive = new Client("receiving");            /* Start the receiving client */
        clientReceive.start();
		
	    
	}
}
