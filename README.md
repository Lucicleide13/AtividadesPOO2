main   package Exercicios;


public class Saida {

	public static void main (String [] arg){
		ListaFesta Lista = ListaFesta.getInstance();

        System.out.println(" --------Lista vip------" );
        Lista.show();


		}
}

pessoa 
package Exercicios;



public class Pessoa {
 String nome;
 public Pessoa (String nome){
	this.nome = nome;
	}
 	public Pessoa(){
 		
 	}
 	public String getNome(){
 		return nome;
 	}
 	}

lista festa   package Exercicios;
import java.util.ArrayList;

public class ListaFesta {

	private static ListaFesta instance;
	private ArrayList <Pessoa> lista;

	private ListaFesta(){
	lista = new ArrayList <Pessoa> ();


	lista.add (new Pessoa ("Luis"));
	lista.add (new Pessoa ("jose"));
	lista.add (new Pessoa ("Maria"));
	lista.add (new Pessoa ("jose"));
	}

	public static ListaFesta getInstance(){
		if (instance==null)
			instance = new ListaFesta();
		return instance;

	}
	public void show(){
		for (int i=0; i<lista.size(); i++){
			System.out.println (lista.get(i).getNome());
	 
	}
	}
}
