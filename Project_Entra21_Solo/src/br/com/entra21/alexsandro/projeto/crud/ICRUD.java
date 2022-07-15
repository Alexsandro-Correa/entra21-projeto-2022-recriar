package br.com.entra21.alexsandro.projeto.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public interface ICRUD <G>{

	ArrayList<String> optionCrud = new ArrayList<String>(
			Arrays.asList("List", "Add", "Search","Edit", "Delete"));
	
	public void listar(HashMap<String,G> list);
	
	public void add();
	
	public G search(G key);
	
	public void edit(G key);
	
	public void delete(G key);
	
	public G captureKey();
	
	public G captureValues();
	
	public void showDetails(G complete);
	
}
