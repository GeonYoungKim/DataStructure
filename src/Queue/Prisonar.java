package Queue;

public class Prisonar implements Comparable<Prisonar>{
	String name;
	int weight;
	
	public Prisonar(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Prisonar o) {
		if(this.weight>o.weight) {
			return 1;
		}else if(this.weight<o.weight){
			return -1;
		}
		return 0;
	}
	
	

}
