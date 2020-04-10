package tema2_ISP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		try {
			//LOGIN MENU
			System.out.println("Va rugam sa va introduceti mail-ul dvs: ");
			String email = new String(in.readLine());
			System.out.println("Va rugam sa introduceti parola dvs: ");
			String parola = new String(in.readLine());
			System.out.println("OPTIUNI USER:\n");
			System.out.println("ADMIN: Administrator\n");
			System.out.println("AGENT: Agent de Turism\n");
			System.out.println("CLIENT: Client");
			
			//OPTIUNI CREARE CONT/LOGARE
			BufferedReader in_user_creation = new BufferedReader(new InputStreamReader (System.in));
			try {
				System.out.println("Optiunea dvs este:");
				String tip_user = new String(in_user_creation.readLine());
				//Creare tip user respectiv
				switch(tip_user) {
					case "ADMIN":{
								//CREARE ADMIN
								Administrator administrator = new Administrator(email,parola,"Administrator");
								administrator.afisareUser();
								break;
						 }
					case "AGENT":{
							 	//CREARE AGENT TURISM
								AgentTurism agent = new AgentTurism(email,parola,"Agent Turism");
								agent.afisareUser();
							 break;
						 }
					case "CLIENT":{
							 	//CREARE CLIENT
								Client client = new Client(email,parola,"Client");
								client.afisareUser();
							 break;
						 }
						 default:{
							 //DACA NU ESTE NICIUNA DIN OPTIUNI TREBUIE SA RERULAM MAIN-UL DE LA INCEPUT
							 System.out.println("ATI INTRODUS O OPTIUNE INCORECTA");
							 main(new String[] {});
							 break;
						 }
				}
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
