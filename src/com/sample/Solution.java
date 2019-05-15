package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public void RemidialAssociates(List<Associates> li) {
		for(Associates s:li) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Associates> li=new ArrayList<Associates>();
		li.add(new Associates(101,"Ranjini",23));
		li.add(new Associates(102,"Manoj",32));
		li.add(new Associates(103,"Barath",45));
		li.add(new Associates(104,"Rani",25));
		li.add(new Associates(105,"Raji",13));
		
		Solution s=new Solution();
		s.RemidialAssociates(li);
	}

}
