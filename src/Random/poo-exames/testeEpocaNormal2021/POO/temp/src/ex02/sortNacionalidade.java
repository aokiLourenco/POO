package ex02;

import java.util.Comparator;

public class sortNacionalidade implements Comparator<Piloto>{
	@Override
	public int compare(Piloto p1, Piloto p2) {
		return p1.getNacionalidade().compareTo(p2.getNacionalidade());
	}
}
