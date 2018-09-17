package Telas;

import java.util.ArrayList;
import java.util.List;

public class Dados {
	List<Contato> contatos = new ArrayList<Contato>();
	
	public void adicionarContado(Contato contato) {
		contatos.add(contato);
	}

	public String quantidadeContado() {
		return contatos.size()+"";
	}
}
