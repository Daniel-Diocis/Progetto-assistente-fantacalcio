package it.univpm.AssistenteFantacalcio.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GiocatoreList {
	public ArrayList getGiocatoreList() {
		return GiocatoreList;
	}

	public void setGiocatoreList(ArrayList giocatoreList) {
		GiocatoreList = giocatoreList;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public ArrayList getArraylistName() {
		return ArraylistName;
	}

	public void setArraylistName(ArrayList arraylistName) {
		ArraylistName = arraylistName;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getGolFatti() {
		return golFatti;
	}

	public void setGolFatti(int golFatti) {
		this.golFatti = golFatti;
	}

	public int getRigoriSegnati() {
		return rigoriSegnati;
	}

	public void setRigoriSegnati(int rigoriSegnati) {
		this.rigoriSegnati = rigoriSegnati;
	}

	public GolSegnati getGolSegnati() {
		return golSegnati;
	}

	public void setGolSegnati(GolSegnati golSegnati) {
		this.golSegnati = golSegnati;
	}

	ArrayList GiocatoreList = new ArrayList();
//	private JSONObject giocatore;
	private int i;
	private ArrayList ArraylistName;
	private String Nome;
	private int golFatti;
	private int rigoriSegnati;
	private GolSegnati golSegnati;
	
	public GiocatoreList (String Nome, int i) throws IOException, ParseException
	{
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonfiles\\giocatori.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject empjsonobj = (JSONObject)obj;
		
		JSONArray array = (JSONArray)empjsonobj.get("numero");
		this.i = i;
		JSONObject Giocatore = (JSONObject)array.get(i);
		this.ArraylistName = new ArrayList();
		
		this.Nome = (String) Giocatore.get("Nome");
		this.golFatti = (int) Giocatore.get("Gf");
		this.rigoriSegnati = (int) Giocatore.get("R+");
		this.golSegnati = new GolSegnati (golFatti, rigoriSegnati);
		
		ArraylistName.add(Giocatore.get("Nome"));
		ArraylistName.add(Giocatore.get("Id"));
		ArraylistName.add(Giocatore.get("R"));
		ArraylistName.add(Giocatore.get("Nome"));
		ArraylistName.add(Giocatore.get("Squadra"));
		ArraylistName.add(Giocatore.get("Pg"));
		ArraylistName.add(Giocatore.get("Mv"));
		ArraylistName.add(Giocatore.get("Mf"));
		ArraylistName.add(Giocatore.get("Gf"));
		ArraylistName.add(golSegnati);
		ArraylistName.add(Giocatore.get("Gs"));
		ArraylistName.add(Giocatore.get("Rp"));
		ArraylistName.add(Giocatore.get("Rc"));
		ArraylistName.add(Giocatore.get("R+"));
		ArraylistName.add(Giocatore.get("R-"));
		ArraylistName.add(Giocatore.get("Ass"));
		ArraylistName.add(Giocatore.get("Amm"));
		ArraylistName.add(Giocatore.get("Esp"));
		ArraylistName.add(Giocatore.get("Au"));
		
	}
	
	
	
	@Override
	public String toString() {
		return "ListaGiocatore=" + ArraylistName;
	}
	
}
