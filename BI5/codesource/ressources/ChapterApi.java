package ressources;

import java.util.ArrayList;
import java.util.List;


import entities.Chapter;

public class ChapterApi {
	static List<Chapter> list = new ArrayList<Chapter>();
	public ChapterApi() {
		// TODO Auto-generated constructor stub
		this.list.add(new Chapter("ref1", "JaxRS", "Web Service",3));
	}
	
	public List getAllChapter() {
		return this.list;
	}
	
	public String addChapter(Chapter Chapter) {
		this.list.add(Chapter);
		return "Chapter addedsuccessful";
	}
	
	public String updateChapter(Chapter i) {
		int index = getIndexById(i.getId());

		if (index != -1) {
			list.set(index, i);
			return "update successful";
		}
		return "update unsuccessful";
	}

	public String deleteChapter(String id) {
		int index = getIndexById(id);
		if (index != -1) {
			this.list.remove(index);
			return "true";
		} else
			return "false";
	}

	public int getIndexById(String id) {
		for (Chapter i : this.list) {
			if (i.getId().equals(id))
				return this.list.indexOf(i);
		}
		return -1;
	}


}
