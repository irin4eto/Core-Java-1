package firstTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstTasks {
	
	public List<Integer> sort(List<Integer> list) {
		List<Integer> sortedList = new ArrayList<>();
		sortedList.addAll(list);
		Collections.sort(sortedList);
		return sortedList;	
	}
	
	public List<Integer> reverse(List<Integer> list) {
		List<Integer> reversedList = new ArrayList<>();
		reversedList.addAll(list);
		Collections.reverse(reversedList);
		return reversedList;
	}
	
	public boolean isMonotonous( List<Integer> array){
        return array.equals(sort(array)) || array.equals(reverse(sort(array)));
    }

}
