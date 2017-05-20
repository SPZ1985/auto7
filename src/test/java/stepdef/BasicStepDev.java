package stepdef;

import cucumber.api.java.en.Given;

public class BasicStepDev {

	
@Given("^to print \"([^\"]*)\" numbers$")
public void to_print_numbers(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("This methos shall print number from 0 to limit");
	Integer intNum = Integer.parseInt(arg1);
	for(int i=0;i<intNum;i++){
		System.out.println(i);
	}
}

@Given("^to print from \"([^\"]*)\" to \"([^\"]*)\"$")
public void to_print_from_to(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("This methos shall print number from specified start to end");
	
	Integer intNum1 = Integer.parseInt(arg1);
	Integer intNum2 = Integer.parseInt(arg2);

	while(intNum1 <= intNum2){
		System.out.println(intNum1);
		intNum1++;
	}
}

@Given("^to print even from \"([^\"]*)\" to \"([^\"]*)\"$")
public void to_print_even_from_to(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("    "); 
	System.out.println("This shall print even numbers");
	
	Integer start = Integer.parseInt(arg1);
	Integer endNum = Integer.parseInt(arg2);
	while(start <= endNum){
		if(start % 2 == 0){
			System.out.print(start + " ");
		}
		start++;
	}	
}


@Given("^to print \"([^\"]*)\" numbers descending from \"([^\"]*)\"$")
public void to_print_numbers_descending_from(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("    "); 
	System.out.println("This shall print numbers in descending order"); 
	int countNum = Integer.parseInt(arg1);
	Integer limit = Integer.parseInt(arg2);

		for(int j=0; j<countNum; j++){
			System.out.print(limit + " ");
			limit--;
		}			
}

@Given("^to learn arrays$")
public void to_learn_arrays() throws Throwable {
    // Write code here that turns the phrase above into concrete actions 
	System.out.println("\n Learning arrays now"); 
	char vowels[]={'a','b','c','d','e'};
	System.out.println(vowels);
	for(int i=0;i<vowels.length;i++){
		System.out.println(vowels[i] + " ");
	}
	
	String names[] = new String[10];
	for(int j=0; j<names.length; j++){
		names[j]= j + "n";
		System.out.print(names[j]+" ");
	}
	
	System.out.println();
	for(int k=0; k<vowels.length; k++){
		names[k]= String.valueOf(vowels[k]);
		System.out.print(names[k]+" ");
	}

	System.out.println("finding max from array!");
	int numArray[]={3, 8, 2, 77, 4, 22, 5};
	int intTemp =numArray[0];
	for(int p=0;p<numArray.length;p++){
		if(intTemp<numArray[p]){
			intTemp=numArray[p];
		}
	}
	System.out.println("Largest integer is " + intTemp);
}

@Given("^reverse the string \"([^\"]*)\"$")
public void reverse_the_string(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("\n reversing string now"); 

    String strT[] = new String[arg1.length()];
    System.out.println("length " + arg1.length());
    
    for(int q=0; q<arg1.length(); q++){
    	//strTemp = arg1.substring(i-1,i);
    	strT[q] = arg1.substring(q, q+1);
    	System.out.println(strT[q]);
    }

    for(int i=arg1.length()-1; i>=0; i--){
    	System.out.print(arg1.substring(i, i+1));
   }   
}

@Given("^reverse words in string \"([^\"]*)\"$")
public void reverse_words_in_string(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("\n Reverse words in string");
    String[] strRevWords = arg1.split("\\s",0);
    System.out.println("total words " + strRevWords.length);
    
    for(int i=0; i<=strRevWords.length-1; i++){
    	System.out.print(strRevWords[i] + " ");
   }   
        
    System.out.println();
    for(int k=strRevWords.length-1; k>=0; k--){
    	System.out.print(strRevWords[k] + " ");
   }   
    
}


@Given("^check if \"([^\"]*)\" is a palindrome$")
public void check_if_is_a_palindrome(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("\n Checking for palindrome now");
	Integer intLen=arg1.length();
	String[] strArr = new String[intLen];
	String[] strRevArr = new String[intLen];
	
	String frwdString = "";
	String rvrsString="";
	
	for(int i=0;i<intLen;i++){
		strArr[i]=arg1.substring(i, i+1);
		System.out.print(strArr[i]);
		frwdString = frwdString+strArr[i];
	}
	System.out.println("\n" + " forward string = " + frwdString + " \n");
	
	int i=0;
    for(int k=intLen; k>=1; k--){
    	strRevArr[i]=arg1.substring(k-1, k);
    	System.out.print(strRevArr[i]);
    	rvrsString = rvrsString+strRevArr[i];
    	i++;
    }   
    System.out.println("\n" + " reverse string = " + rvrsString + " \n");
    String blnCheck="False";
    if(frwdString.equalsIgnoreCase(rvrsString)){
    	blnCheck="True";
    }
    System.out.println("\n is this a palindrome? = " + blnCheck);
}


}//class