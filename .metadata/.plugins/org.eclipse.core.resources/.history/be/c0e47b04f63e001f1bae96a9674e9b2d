package javaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
				
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adwoa");
		names.add("Achiaa");
		names.add("David");
		names.add("Shekainah");
		names.add("Gideon");
		names.add("Ella");
		names.add("Abrachardabra");
		
		Long count = names.stream().filter(n->n.startsWith("A")).count();
		System.out.println(count);
		
		Long total = Stream.of("Ankrah", "Bosompem", "Achiaa", "David", "Shekainah", "Ella", "Gedion", "Abrachardabra").filter(s->
		s.startsWith("A")).count();
		System.out.println(total);		
		
		
		
		names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));// prints all names in the array list greater than 5
		
		names.stream().filter(f->f.length()>5).limit(2).forEach(f->System.out.println(f));
		
		
		
		}

}
