package ressources;

import java.util.ArrayList;
import java.util.List;


import entities.Internship;

public class Repository {
	static List<Internship> list = new ArrayList<Internship>();
	public Repository() {
		// TODO Auto-generated constructor stub
		this.list.add(new Internship("ref1", "backend developer", "Focus",6));
	}
	
	public List getAllInternship() {
		return this.list;
	}
	
	public String addInternship(Internship internship) {
		this.list.add(internship);
		return "Internship addedsuccessful";
	}
	
	public String updateInternship(Internship i) {
		int index = getIndexById(i.getId());

		if (index != -1) {
			list.set(index, i);
			return "update successful";
		}
		return "update unsuccessful";
	}

	public String deleteInternship(String id) {
		int index = getIndexById(id);
		if (index != -1) {
			this.list.remove(index);
			return "true";
		} else
			return "false";
	}

	public int getIndexById(String id) {
		for (Internship i : this.list) {
			if (i.getId().equals(id))
				return this.list.indexOf(i);
		}
		return -1;
	}


}
