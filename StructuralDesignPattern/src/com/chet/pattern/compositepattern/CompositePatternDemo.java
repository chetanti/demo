package com.chet.pattern.compositepattern;

public class CompositePatternDemo {

	public static void main(String[] args) {

		Employee CEO = new Employee("John", "CEO",30000);
		
		Employee head1 = new Employee("John 1", "head slaes",20000);
		Employee head2 = new Employee("John 2", "head marketing",20000);
		
		
		Employee clerk1 = new Employee("clerk 1", "clerk",10000);
		Employee ckerk2 = new Employee("clerk 2", "clerk",10000);
		
		Employee executive1 = new Employee("executive 1", "marketing",10000);
		Employee executive2 = new Employee("executive 2", "marketing",10000);

		CEO.add(head1);
		CEO.add(head2);
		
		head1.add(clerk1);
		head1.add(ckerk2);
		
		head2.add(executive1);
		head2.add(executive2);
		
		System.out.println(CEO);
		
		for(Employee e : CEO.getSubordinates()) {
			
			System.out.println( e);
			for(Employee e1 : e.getSubordinates()) {
				System.out.println(e1);
			}
		}
	}

}
