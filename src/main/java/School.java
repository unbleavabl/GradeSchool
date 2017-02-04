import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class School{
	private Map <Integer,List<String>> StudentDB = new HashMap <Integer,List<String>>();
	public int numberOfStudents(){
		int count = 0;
		for(Map.Entry<Integer,List<String>> m : StudentDB.entrySet()){
			List<String> names = m.getValue();
			count += names.size();
		}
		return count;
	}
	public Map<Integer,List<String>> studentsByGradeAlphabetical(){
		Map newMap = java.util.Collections.unmodifiableMap(StudentDB);
		return newMap;
	}

	public List<String> grade (Integer gr){
		List<String> stuList = StudentDB.get(gr);
		if(stuList==null){
			stuList = new ArrayList<String>();
		}
		return stuList;
	}

	public void add (String name, Integer gr){
		List<String> stuList = StudentDB.get(gr);
		if(stuList == null){
			stuList = new ArrayList<String>();
		}
		stuList.add(name);
		java.util.Collections.sort(stuList);
		StudentDB.put(gr,stuList);
	}


}

