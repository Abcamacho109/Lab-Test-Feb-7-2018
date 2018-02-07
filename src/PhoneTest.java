import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Phone no = new Phone("Samsung" , "Galaxy" ,  "2018" ,800);
Phone to = new Phone("Apple" , "Iphone",  "2018",  900);
Phone so = new Phone("HTC",  "Droid", "2017",  700);
Scanner scanner = new Scanner (System.in);
System.out.println(no.Brand + no.PhoneName + no.yearReleased + no.price);
System.out.println(to.Brand + to.PhoneName + to.yearReleased + to.price);
System.out.println(so.Brand + so.PhoneName + so.yearReleased + so.price);


System.out.println("Which Phone did you choose");
Scanner scan = new  Scanner (System.in);
System.out.println("The price of the phone is");

	}


	}


