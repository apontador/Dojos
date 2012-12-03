package org.fizzbuzzeros.com;

public class FizzBuzz {

	public String print(int i) {
		// TODO Auto-generated method stub
		
		if (ehDivisivelPor3(i) && ehDivisivelPor5(i)) {
		    return "FizzBuzz";
	    } else if (contem3(i) && contem5(i)) {
	    	return "FizzBuzz";
	    } else if (ehDivisivelPor3(i) || contem3(i)) {
			return "Fizz";
		} else if(contem5(i) || ehDivisivelPor5(i)) {
			return "Buzz";
		}
		return String.valueOf(i);

	}

	private boolean contem5(int i) {
		return String.valueOf(i).contains("5");
	}

	private boolean contem3(int i) {
		return String.valueOf(i).contains("3");
	}
	
	private boolean ehDivisivelPor3(int i){
		return (i % 3 == 0);
	}

	private boolean ehDivisivelPor5(int i){
		return (i % 5 == 0);
	}

	public String print(int ... i) {
		String retorno = "";
		
		for (int j : i) {
			
			if (retorno.equals("")) {
				retorno = print(j); 
			} else {
				retorno += "," + print(j);
			}
		}
		return retorno;
	}
	
	
}
