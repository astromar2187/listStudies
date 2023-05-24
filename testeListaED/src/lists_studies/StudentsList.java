package lists_studies;

import java.util.Scanner;

public class StudentsList {
	public class Node{
		private String name;
		private Node prox;
	}
	
	private Node start=null;

	public static void main(String[] args) {
		StudentsList list = new StudentsList();
		Scanner sc = new Scanner(System.in);
		int op = -1;
		
		while(op!=0) {
			String menu = "Menu\n1.Insert\n2.Shows list\n0.Quit\nPlease, choose an option from above.";
			System.out.print(menu);
			op = Integer.parseInt(sc.nextLine());
			
			switch(op) {
			case 1: //Inserting at the beginning
				System.out.print("Plese, type the new student's name: ");
				String stdName = sc.nextLine();
				list.insertInBegining(stdName);
				break;
			case 2:
				list.showList();
				break;
			default:
				System.out.print("Please, type a valid option");
			}
				
		}
		
		sc.close();
	}
	
	private void insertInBegining(String name) {
		Node newNode = new Node();
		newNode.name= name;
		newNode.prox = start;
		start = newNode;
	}
	
	private void showList() {
		Node aux = start;
		System.out.print("Students' list: ");
		while(aux!=null){
			System.out.print(aux.name+" ->");
			aux = aux.prox;
		}
		System.out.println("\n");
	}
	
	

}
