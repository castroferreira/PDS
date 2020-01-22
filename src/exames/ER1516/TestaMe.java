package Exame;
import java.util.GregorianCalendar;

//Nao alterar esta classe
//Mas pode (Deve!) comentar linhas com erros para poder testar o codigo que for desenvolvendo

public class TestaMe {

	public static void main(String[] args) {

		// base data 
		Organization edp = new Organization("Portugal", "EDP", null);
		Organization nokia = new Organization("Portugal", "Infraestruturas de Portugal", "+00351 961234567");
		Organization ua = new Organization("Portugal", "Universidade de Aveiro", "+00351 234 300 300");
		Organization google = new Organization("World wide", "Google Corporation", null);
		
		Seeker seeker1 = new Seeker("Pedro", "pedro@edp.pt", edp);
		Seeker seeker2 = new Seeker("Alexandre", "alexandre@edp.pt", edp);
		Seeker seeker3 = new Seeker("Maria", "maria@infra.pt", nokia);
		
		Solver solver1 = new Solver("Jorge", "Lopes", "jorge.lopes@deti.ua.pt", ua);
		Solver solver2 = new Solver("Ana", "Martins", "ana.martins@ua.pt", ua);
		Solver solver3 = new Solver("Sandra", "Costa", "sandra.costa@gmail.com", google);

		Challenge challenge1 = new Challenge("ERM" , "End User Relationship Management", seeker1, 3000.0, ChallengeType.PRATICAL_CHALLENGE);
		Challenge challenge2 = new Challenge("File share", "Mobile Access to File Share", seeker2, 4000.0, ChallengeType.PRATICAL_CHALLENGE);
		Challenge challenge3 = new Challenge("Geo", "Geotechnical assets management system", seeker3, 4000.0, ChallengeType.PRATICAL_CHALLENGE);

		// transactions
		System.out.println(">> Alinea A");
		Broker broker = new Broker();
		broker.addSolver(solver1); 	broker.addSolver(solver2); broker.addSolver(solver3);
		broker.addSeeker(seeker1); 	broker.addSeeker(seeker2); broker.addSeeker(seeker3);
		
		ChallengeSubject subject1 = broker.addChallenge(challenge1, new GregorianCalendar(2017,06,26));
		ChallengeSubject subject2 = broker.addChallenge(challenge2, new GregorianCalendar(2017,06,30));
		ChallengeSubject subject3 = broker.addChallenge(challenge3, new GregorianCalendar(2017,06,30));
		
		System.out.println(broker);
		
//		System.out.println(">> Alinea b");
//		subject1.attach(solver1); subject1.attach(solver2);
//		subject1.close();
//		System.out.println();
//		
//		subject2.attach(solver2); subject2.attach(solver3);
//		subject2.setWinner(solver2);
//		System.out.println();
//
//		subject3.attach(solver2); 	subject3.attach(solver3);
//				
//		System.out.println(">> Alinea C... see exceptions!");
//		// Exception handling
////		subject1.close();				// throws illegalStateException
////		subject3.setWinner(solver1);	// throws illegalArgumentException

	}

}
