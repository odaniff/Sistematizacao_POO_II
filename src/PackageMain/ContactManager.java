package PackageMain;

import PackageClasses.Contact;
import PackageClasses.ContactList;
/*import PackageClasses.Node;*/

import java.util.Scanner;

public class ContactManager {

	public static void main(String[] args) {
		 ContactList contactList = new ContactList();
		 Scanner scanner = new Scanner(System.in);
		 int choice = 0;
	
		 do {
			 System.out.println("\n||Bem-vindo(a) ao Sistema de Gerenciamento de Contatos||");
			 System.out.println("1 - Adicionar Contato.");
			 System.out.println("2 - Buscar Contato.");
			 System.out.println("3 - Remover Contato.");
			 System.out.println("4 - Listar Contatos.");
			 System.out.println("5 - Sair.");
			 System.out.print("Escolha uma Opção: ");
			 choice = scanner.nextInt();
			 scanner.nextLine();
			 
			 switch (choice) {
			 	case 1:
			 		System.out.print("Digite o Nome do contato: ");
					String name = scanner.nextLine();
					System.out.print("Digite o Número de Telefone do contato: ");
					String phoneNumber = scanner.nextLine();
					System.out.print("Digite o E-mail do contato: ");
					String email = scanner.nextLine();
					Contact contato_novo = new Contact(name, phoneNumber, email);
					contactList.addContact(contato_novo);
					System.out.println("Contato adicionado com sucesso.");
			 		break;
			 		
			 	case 2:
			 		System.out.print("Digite o Nome ou Número de Telefone do contato que deseja buscar: ");
			 		String nameOuPhone = scanner.nextLine();
			 		if(contactList.searchContact(nameOuPhone) != null) {
			 			System.out.println("Contato encontrado com sucesso: "); 
			 			System.out.println(contactList.searchContact(nameOuPhone));
			 		} else {
			 			System.out.println("Contato não encontrado.");
			 		}
			 		break;
			 		
			 	case 3:
			 		System.out.print("Digite o Nome ou Número de Telefone do contato que deseja remover: ");
			 		String nameOuPhone2 = scanner.nextLine();
			 		if(contactList.removeContact(nameOuPhone2) == true) {
			 			System.out.println("Contato removido com Sucesso.");
			 		} else {
			 			System.out.println("Contato não encontrado.");
			 		}
			 		break;
			 		
			 	case 4:
			 		System.out.println("Sua lista de contatos: ");
			 		contactList.listContacts();
			 		break;
			 		
			 	case 5:
			 		System.out.println("Saindo do Sistema...");
			 		break;
			 		
			 	default:
			 		System.out.println("Escolha inválida. Por favor, escolha uma opção válida.");
			 		break;
			}
				
		 } while(choice != 5); {
			 scanner.close();
		 }		 
	}

}