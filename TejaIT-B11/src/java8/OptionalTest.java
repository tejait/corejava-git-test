package java8;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
public static void main(String[] args) {
	//Optional<String> opt=Optional.of(null);
	String val=null;
	Optional<String> opt=Optional.ofNullable(val);
	System.out.println(opt);
	
	String data=null;
	
	if(data!=null) {
		System.out.println(data.toUpperCase());
	}else {
		System.out.println("data is empty");
		//throw new RuntimeException();
	}
	
	List<Integer> list=Arrays.asList(1,3,5,12,34,13,45,67,88,43,79,99);
	Optional<Integer> max=list.stream().filter(x-> x>100).max(Integer::compare);
	
	System.out.println(max);
	
	max.ifPresent(x->System.out.println(x*10));
	
	//Integer i=null;
	//System.out.println(i*2);
	
	if(max.isPresent()) { //
		System.out.println(max.get());
	}
	Integer orElse=max.orElse(150);
	System.out.println(orElse);
	
	Integer v=max.orElseThrow(RuntimeException::new);
	System.out.println(v);
}
}
