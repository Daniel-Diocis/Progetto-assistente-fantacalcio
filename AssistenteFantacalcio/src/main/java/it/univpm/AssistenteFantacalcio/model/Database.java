package it.univpm.AssistenteFantacalcio.model;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Database {
	public static void main(String[] args) throws IOException, ParseException {

		String P = "P";
		String D = "D";
		String C = "C";
		String A = "A";
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonfiles\\giocatori.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject empjsonobj = (JSONObject)obj;
		
		JSONArray array = (JSONArray)empjsonobj.get("numero");
		
		for(int i=0;i<array.size();i++)
		{
			JSONObject numero = (JSONObject)array.get(i);
			
			Number Id = (Number) numero.get("Id");
			String R = (String) numero.get("R");
			String Nome = (String) numero.get("Nome");
			String Squadra = (String) numero.get("Squadra");
			Number Pg = (Number) numero.get("Pg");
			Number Mv = (Number) numero.get("Mv");
			Number Mf = (Number) numero.get("Mf");
			Number Gf = (Number) numero.get("Gf");
			Number Gs = (Number) numero.get("Gs");
			Number Rp = (Number) numero.get("Rp");
			Number Rc = (Number) numero.get("Rc");
			Number Rf = (Number) numero.get("R+");
			Number Rs = (Number) numero.get("R-");
			Number Ass = (Number) numero.get("Ass");
			Number Amm = (Number) numero.get("Amm");
			Number Esp = (Number) numero.get("Esp");
			Number Au = (Number) numero.get("Au");
			
		}
		
		System.out.println("Immetti il nome del giocatore: ");
		Scanner tastiera = new Scanner(System.in);
		String giocatore = tastiera.next();
//		System.out.println("Hai scritto: "+giocatore);
		
		JSONObject RADUNOVIC = (JSONObject)array.get(0);
		JSONObject SPORTIELLO = (JSONObject)array.get(1);
		JSONObject CONTI = (JSONObject)array.get(2);
		JSONObject MASIELLO = (JSONObject)array.get(3);
		JSONObject DE_ROON = (JSONObject)array.get(4);
		
//		String R = (String) RADUNOVIC.get("R");
		String Radunovicc = "RADUNOVIC";
		if (giocatore.compareTo(Radunovicc) == 0)
		{
			for(int i=1;i<2;i++)
			{
				JSONObject numero = (JSONObject)array.get(i);
				
				numero = RADUNOVIC;
				
				Number Id = (Number) numero.get("Id");
				String R = (String) numero.get("R");
				String Nome = (String) numero.get("Nome");
				String Squadra = (String) numero.get("Squadra");
				Number Pg = (Number) numero.get("Pg");
				Number Mv = (Number) numero.get("Mv");
				Number Mf = (Number) numero.get("Mf");
				Number Gf = (Number) numero.get("Gf");
				Number Gs = (Number) numero.get("Gs");
				Number Rp = (Number) numero.get("Rp");
				Number Rc = (Number) numero.get("Rc");
				Number Rf = (Number) numero.get("R+");
				Number Rs = (Number) numero.get("R-");
				Number Ass = (Number) numero.get("Ass");
				Number Amm = (Number) numero.get("Amm");
				Number Esp = (Number) numero.get("Esp");
				Number Au = (Number) numero.get("Au");
							
				System.out.println("Nome: "+Nome);
//				System.out.println("Id: "+Id);
				System.out.print("Ruolo: "+R);
				if(R.compareTo(P) == 0) 
				{System.out.println("ortiere");}
				else
					if (R.compareTo(D) == 0)
					{System.out.println("ifensore");}
					else
						if (R.compareTo(C) == 0)
						{System.out.println("entrocampista");}
						else {System.out.println("ttaccante");};
				System.out.println("Squadra: "+Squadra);
				System.out.println("Partite giocate: "+Pg);
				System.out.println("Mediavoto: "+Mv);
				System.out.println("Mediafantavoto: "+Mf);
				System.out.println("Gol fatti: "+Gf);
				System.out.println("Gol subiti: "+Gs);
				System.out.println("Rigori parati: "+Rp);
				System.out.println("Rigori calciati: "+Rc);
				System.out.println("Rigori segnati: "+Rf);
				System.out.println("Rigori sbagliati: "+Rs);
				System.out.println("Assist: "+Ass);
				System.out.println("Ammonizioni: "+Amm);
				System.out.println("Espulsioni: "+Esp);
				System.out.println("Autogol: "+Au);
				System.out.println();
			}
		}
		
		
		
/*		for(int i=1;i<2;i++)
		{
			JSONObject numero = (JSONObject)array.get(i);
			
			numero = RADUNOVIC;
			
			Number Id = (Number) numero.get("Id");
			String R = (String) numero.get("R");
			String Nome = (String) numero.get("Nome");
			String Squadra = (String) numero.get("Squadra");
			Number Pg = (Number) numero.get("Pg");
			Number Mv = (Number) numero.get("Mv");
			Number Mf = (Number) numero.get("Mf");
			Number Gf = (Number) numero.get("Gf");
			Number Gs = (Number) numero.get("Gs");
			Number Rp = (Number) numero.get("Rp");
			Number Rc = (Number) numero.get("Rc");
			Number Rf = (Number) numero.get("R+");
			Number Rs = (Number) numero.get("R-");
			Number Ass = (Number) numero.get("Ass");
			Number Amm = (Number) numero.get("Amm");
			Number Esp = (Number) numero.get("Esp");
			Number Au = (Number) numero.get("Au");
						
			System.out.println("Nome: "+Nome);
//			System.out.println("Id: "+Id);
			System.out.print("Ruolo: "+R);
			if(R.compareTo(P) == 0) 
			{System.out.println("ortiere");}
			else
				if (R.compareTo(D) == 0)
				{System.out.println("ifensore");}
				else
					if (R.compareTo(C) == 0)
					{System.out.println("entrocampista");}
					else {System.out.println("ttaccante");};
			System.out.println("Squadra: "+Squadra);
			System.out.println("Partite giocate: "+Pg);
			System.out.println("Mediavoto: "+Mv);
			System.out.println("Mediafantavoto: "+Mf);
			System.out.println("Gol fatti: "+Gf);
			System.out.println("Gol subiti: "+Gs);
			System.out.println("Rigori parati: "+Rp);
			System.out.println("Rigori calciati: "+Rc);
			System.out.println("Rigori segnati: "+Rf);
			System.out.println("Rigori sbagliati: "+Rs);
			System.out.println("Assist: "+Ass);
			System.out.println("Ammonizioni: "+Amm);
			System.out.println("Espulsioni: "+Esp);
			System.out.println("Autogol: "+Au);
			System.out.println();
		}*/
//		String R = (String) RADUNOVIC.get("R");
//		System.out.println("R: "+R);
			
	}

}

