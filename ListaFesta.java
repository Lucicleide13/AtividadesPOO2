package Entradasaida;

import java.util.ArrayList;

public class ListaFesta {
	private static ListaFesta instance;
	
	private ArrayList<Pessoa> lista;
	
	private ListaFesta() {
       
    lista = new ArrayList<Pessoa>();
	

	lista.add(new Pessoa("Theo"));
	lista.add(new Pessoa("Bia"));
	lista.add(new Pessoa("Paula"));
	lista.add(new Pessoa("Joana"));
	lista.add(new Pessoa("Mariana"));
	
	}
	public static ListaFesta getInstance(){
		if(instance == null)
			instance = new ListaFesta();
		return instance;
	}	
	
	public void show(){
		for(int i=0; i<lista.size(); i++){
			System.out.println("                        " + lista.get(i).getNome());
	}
}
}