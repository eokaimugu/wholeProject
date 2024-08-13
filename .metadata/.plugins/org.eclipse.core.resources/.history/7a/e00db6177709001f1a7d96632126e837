package streamsJavaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamsWithMap {

	// Map is used to manipulate the values in a stream

	public String streamMap() {
		Stream.of("Achiaa", "Dansa", "Sasata", " Romeoville", "Alekhya", "Gideon").filter(f -> f.endsWith("a"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		return null;
	}

	public static void main(String[] args) {

		StreamsWithMap swm = new StreamsWithMap();
		swm.streamMap();
		
		//Print the names in an array converting the First letter to upper case and sorting them
		
		String [] animals = {"Monkey", "dog", "bear", "shark","python"};
		List<String> animo = Arrays.asList(animals);
		animo.stream().filter(s->s.startsWith("m")).map(s->s.toUpperCase()).forEach(f->System.out.println(f));
		
		Stream.of("John","Junour","Sampson","Rebecca").filter(s->s.contains("o")).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		
		String [] countries = {"Zimbabwe", "South Africa", "Tanzania", "Togo", "Benin","Ghana","Angola"	};
		List<String> states = Arrays.asList(countries);
		
		states.stream().filter(s->s.contains("i")).sorted().map(f->f.toLowerCase()).forEach(f->System.out.println(f));
		
		
		Stream<String> newStream = Stream.concat(states.stream(),animo.stream() );
		newStream.sorted().forEach(f->System.out.println(f));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("dansa"));
		Assert.assertTrue(flag);
		
		}

}
