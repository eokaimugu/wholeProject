import java.util.Arrays;
import java.util.List;

public class MoreJavaStreamDemo {

	public static void main(String[] args) {
		
		
		List<String> transportation = Arrays.asList("car","bus","train","truck","bike","car","bus","bike","cart");
		transportation.stream().distinct().forEach(v->System.out.println(v));
		
		long number = transportation.stream().distinct().count();
		System.out.println(number);
		
		transportation.stream().limit(4).forEach(p->System.out.println(p));
		

	}

}
