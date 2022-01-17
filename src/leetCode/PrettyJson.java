package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PrettyJson {

	public static void main(String[] args) {

		sample("{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}\"");

	}

	private static String[] sample(String A) {
		System.out.println(A);


		List<String> listString= new ArrayList<>();

		StringBuilder sb= new StringBuilder();
		StringBuilder ident= new StringBuilder();
		int counter=0;

		for(int i=0; i<A.length(); i++) {

			char each= A.charAt(i);

			switch (each) {
			case '{':
			case '[':
				if(listString.size() ==0) {
					listString.add(Character.toString(each));
					counter++;
				}
				else {

					for(int k=0; k < counter;k++) {
						ident.append('\t');
					}

					if(sb.length() !=0) {
						ident.append(sb);
						listString.add(ident.toString());						
						ident.delete(ident.length() - sb.length(), ident.length());
						sb= new StringBuilder();
					}					

					ident.append(each);
					listString.add(ident.toString());
					ident= new StringBuilder();
					counter++;
				}
				break;

			case ',':
				sb.append(each);
				for(int k=0; k < counter;k++) {
					ident.append('\t');
				}
				ident.append(sb);
				//arrayString[i]=ident.toString();
				listString.add(ident.toString());
				ident= new StringBuilder();
				sb= new StringBuilder();
				break;

			case '}':
			case ']':			

				if(sb.length() !=0) {

					for(int k=0; k < counter;k++) {
						ident.append('\t');
					}

					ident.append(sb);
					listString.add(ident.toString());
					ident= new StringBuilder();
					sb= new StringBuilder();
				}	

				for(int k=0; k < counter - 1;k++) {
					ident.append('\t');
				}
				ident.append(each);
				if(i+1 < A.length() && A.charAt(i+1) ==',') {
					ident.append(A.charAt(i+1));
					i++;
				}
				listString.add(ident.toString());
				ident= new StringBuilder();
				counter--;
				break;	

			default:
				sb.append(each);
				continue;
			}
		}

		System.out.println(listString);
		String[] arrayString= new String[listString.size()];

		for(int i=0; i<listString.size();i++) {
			arrayString[i]=listString.get(i);
		}

		System.out.println(arrayString);
		return arrayString;
	}

}
