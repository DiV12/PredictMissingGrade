import org.json.simple.*;
import java.util.*;
import java.util.Map.Entry;

public class PredictMissingGrade {
     enum subjects {
		English, Physics, Chemistry, Mathematics, ComputerScience, Biology, 
        PhysicalEducation, Economics, Accountancy, BusinessStudies;
	}
    
	public static void main(String[] args) {
        Map<subjects, Integer> grades = new HashMap<subjects, Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
        String SERIAL = "serial";
		for (int i = 0; i < n; i++) {
			String _readline = sc.nextLine();
			JSONObject _readValues = (JSONObject) JSONValue.parse(_readline);
			Set<Entry<Object, Object>> entrySet = _readValues.entrySet();
                              //     System.out.println(entrySet);
			for (Entry<Object, Object> e : entrySet) {
				String subject = String.valueOf(e.getKey());
                            //    System.out.println(subject);
				if (subject.equals(SERIAL)) {
					continue;
				}
				int grade = Integer.valueOf(String.valueOf(e.getValue()));
				grades.put(subjects.valueOf(subject), grade);
			}
        int result = 0;
        Iterator it = grades.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry _i = (Map.Entry)it.next();
        String s = String.valueOf(_i.getKey());
       // System.out.print(s);
        if(s == "English"){
            int Eng = Integer.valueOf(String.valueOf(_i.getValue()));
            result+= Eng;
        }
        if(s == "Physics"){
            int Phy = Integer.valueOf(String.valueOf(_i.getValue()));
            result+= Phy;
        }
        if(s == "Chemistry"){
            int Chem = Integer.valueOf(String.valueOf(_i.getValue()));
            result+= Chem;
       //     System.out.println("CHe" + result);
        }
        if(s == "ComputerScience"){
            int CS = Integer.valueOf(String.valueOf(_i.getValue()));            
            result+= CS;
       //    System.out.println(result);
        }
        if(s == "Biology"){
            int Bio = Integer.valueOf(String.valueOf(_i.getValue()));            
            result+= Bio;
        //   System.out.println("Bi" + result);
        }
        if(s == "PhysicalEducation"){
            int PE = Integer.valueOf(String.valueOf(_i.getValue()));           
            result+= PE;
        //    System.out.println(result);
        }
        if(s == "Economics"){
            int Econ = Integer.valueOf(String.valueOf(_i.getValue()));            
            result+= Econ;
         //   System.out.println(result);
        }
        if(s == "Accountancy"){
            int Acc = Integer.valueOf(String.valueOf(_i.getValue()));            
            result+= Acc;
        //   System.out.println(result);
        }
        if(s == "BusinessStudies"){
            int BS = Integer.valueOf(String.valueOf(_i.getValue()));            
            result+= BS;
        }
        }
             result = (int)Math.round(result/4); 
             System.out.println(result);
        }
    }
}
  

