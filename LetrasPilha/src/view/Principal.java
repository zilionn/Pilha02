package view;

import model.PilhaString;

public class Principal {
	 public static void main(String[] args) throws Exception {
	       PilhaString pOriginal = new PilhaString();
	        pOriginal.push("J");
	        pOriginal.push("G");
	        pOriginal.push("R");
	        pOriginal.push("B");
	        pOriginal.push("H");
	        pOriginal.push("L");
	        pOriginal.push("W");

	       PilhaString pFinal = new PilhaString();

	        // Operações para obter a saída "R W" na pilha final
	        pOriginal.pop(); // Descarte "L"
	        pOriginal.pop(); // Descarte "H"

	        pFinal.push(pOriginal.pop()); // "R" para a pilha final
	        pFinal.push(pOriginal.pop()); // "W" para a pilha final

	        // Imprimir a pilha final
	        System.out.println("Pilha Final:");
	        while(!pFinal.isEmpty()) {
	            System.out.println(pFinal.pop());
	        }
	    }
	}

